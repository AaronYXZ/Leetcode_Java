package Math;

public class L507_PerfectNumber {
    public static boolean checkPerfectNumber(int num){
        int result = 0;
        for (int i = 1; i < num / 2; i++){
            if (num % i == 0) result+=i;
        }
        return num == result;
    }

    public static void main(String[] args) {
        checkPerfectNumber(28);
    }
}
