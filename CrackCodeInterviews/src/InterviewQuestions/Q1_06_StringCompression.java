package InterviewQuestions;

public class Q1_06_StringCompression {
    // StringBuilder
    // toString, append

    public static String StringCompression(String string) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i< string.length(); i++){
            countConsecutive++;
            if (i == string.length()-1 || string.charAt(i) != string.charAt(i+1)){
                compressed.append(string.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        return compressed.length()>string.length()?string:compressed.toString();
    }

    public static void main(String[] args) {
        String str1 = "aaabbbccc";
        String str2 = "abcd";
        String str3 = "aaabbcdddd";
        String str4 = "aabbbc";
        System.out.println(StringCompression(str1));
        System.out.println(StringCompression(str2));
        System.out.println(StringCompression(str3));
        System.out.println(StringCompression(str4));
    }
}
