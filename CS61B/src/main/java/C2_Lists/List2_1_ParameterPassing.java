package C2_Lists;

import static C2_Lists.List2_1.Walrus;

// https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value

public class List2_1_ParameterPassing {

    public static void main(String[] args) {
        Walrus walrus = new Walrus(3500, 10.5);
        int x = 9;

        doStuff(walrus, x);
        System.out.println(walrus);
        System.out.println(x);
        System.out.println(walrus.weight);
    }

    public static void doStuff(Walrus W, int x) {
        W.weight = W.weight - 100;
        x = x - 5;
    }
}

