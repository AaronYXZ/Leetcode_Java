package Math;

public class L367_ValidPerfectSquare {
    public static boolean isPerfectSquare(int num){
        int l = 0, r = Integer.MAX_VALUE;
        while (l < r){
            int mid = l + ( r - l) /2;
            if (mid < num / mid){
                l = mid ;
            }
            else if (mid > num / mid){
                r = mid;
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
