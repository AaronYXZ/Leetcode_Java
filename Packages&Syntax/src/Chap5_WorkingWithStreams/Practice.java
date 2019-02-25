package Chap5_WorkingWithStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {

    // P199
    // https://github.com/java8/Java8InAction/blob/master/src/main/java/lambdasinaction/chap5/PuttingIntoPractice.java
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> q1_trans = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(q1_trans);

        // Query 2: What are all the unique cities where the traders work?
        List<String> q2_cities = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(q2_cities);

        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> q3_traders = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity() == "Cambridge")
                .distinct() // if no distinct, raul in cambridge will appear twice
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(q3_traders);

        // Query 4: Return a string of all traders’ names sorted alphabetically.
        String q4_names = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (a, b) -> a + b);
        System.out.println(q4_names);

        // Query 5: Are there any trader based in Milan?
        Boolean q5_milan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(q5_milan);

        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Milan"))
                .forEach(trader -> trader.setCity("Cambridge"));

        System.out.println(transactions);

        // Query 7: What's the highest value in all the transactions?
        int q7_highest = transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(0, Integer::max);
        System.out.println(q7_highest);

        // Query 8: Find the transaction with smallest value
        Optional<Transaction> q8_min = transactions.stream()
                .reduce((t1,t2) -> t1.getValue() < t2.getValue()? t1:t2);
        System.out.println(q8_min);

        Optional<Transaction> q8_min2 = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println(q8_min2);
    }
}
