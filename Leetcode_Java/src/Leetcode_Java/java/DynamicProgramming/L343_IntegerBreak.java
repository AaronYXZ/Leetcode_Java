package DynamicProgramming;

public class L343_IntegerBreak {
    public int integerBreak(int n){
        int total = 1;
        while ( n > 10){
            n -= 3;
            total *= 3;
        }
        return 0;

    }
}
