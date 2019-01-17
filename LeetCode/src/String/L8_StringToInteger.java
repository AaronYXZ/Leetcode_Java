package String;

/*
https://leetcode.com/problems/string-to-integer-atoi/description/

https://leetcode.com/problems/string-to-integer-atoi/discuss/4643/Java-Solution-with-4-steps-explanations
 */
public class L8_StringToInteger {

    public static int myAtoi(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int total = 0, index = 0, sign = 1;
        //        if (str.replace(' ', '').)

        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }

        if (index == str.length()) {
            return 0;
        }
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        while (str.charAt(index) < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }

            //            We are dividing by 10 to check for overflow because later we are multiplying by 10 in the statement total = 10 * total + digit; and we do not want an overflow then.
            //            To understand the second part of the statement, System.out.println(Integer.MAX_VALUE) gives 2147483647. We could have used Integer.MAX_VALUE/10 == total && 7 < digit to check for an overflow, but that would not be a generic case and would be wrong if value of Integer.MAX_VALUE changes. Hence we use Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;
        }
        return total * sign;
    }

    public static void main(String[] args) {
        String input = " ";
        System.out.println(myAtoi(input));
    }
}
