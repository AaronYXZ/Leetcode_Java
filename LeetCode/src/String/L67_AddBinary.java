package String;

public class L67_AddBinary {

    public static String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int maxLen = Math.max(aLen, bLen);

        int flag = 0;
        String res = "";

        for (int i = 0; i < maxLen; i++) {
            int p, q;
            //            Line 11: error: int cannot be dereferenced
            //            p = i < aLen ? alen.charAt(aLen - i - 1) - '0' : 0;
            //            q = i < bLen ? blen.charAt(bLen - i - 1) - '0' : 0;
            if (i < aLen) {
                p = a.charAt(aLen - i - 1) - '0';
            } else {
                p = 0;
            }

            if (i < bLen) {
                q = b.charAt(bLen - i - 1) - '0';
            } else {
                q = 0;
            }


            int sum = p + q + flag;
            flag = sum / 2;
            res = sum % 2 + res;
        }

        return (flag == 1) ? "1" + res : res;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("111", "111"));
    }
}
