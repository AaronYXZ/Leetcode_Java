package Math;
/*
Q:
https://leetcode.com/problems/ugly-number/description/
S:
https://leetcode.com/problems/ugly-number/discuss/69214/2-4-lines-every-language
 */

public class L263_UglyNumber {
    public static boolean uglyNumber(int n){
        for(int i = 2; i< 6 && n > 0; i++){
            while (n % i == 0){
                n /= i;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(uglyNumber(10));
        System.out.println(uglyNumber(14));
    }
}
