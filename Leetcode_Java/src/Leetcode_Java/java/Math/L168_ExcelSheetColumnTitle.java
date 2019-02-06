package Math;

public class L168_ExcelSheetColumnTitle {
    public static String convertToTitle(int n){
       StringBuilder stringBuilder = new StringBuilder();
        while (n > 0){
            n--;
            int mod = n % 26 ;
            stringBuilder.insert(0, (char) ('A' + mod));
            n /= 26;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }
}
