package String;
/*
https://leetcode.com/problems/license-key-formatting/description/

You are given a license key represented as a string S which consists only alphanumeric character and dashes. The string is separated into N+1 groups by N dashes.

Given a number K, we would want to reformat the strings such that each group contains exactly K characters, except for the first group which could be shorter than K, but still must contain at least one character. Furthermore, there must be a dash inserted between two groups and all lowercase letters should be converted to uppercase.

Given a non-empty string S and a number K, format the string according to the rules described above.

Example 1:
Input: S = "5F3Z-2e-9-w", K = 4

Output: "5F3Z-2E9W"

Explanation: The string S has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.
Example 2:
Input: S = "2-5g-3-J", K = 2

Output: "2-5G-3J"

Explanation: The string S has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.
Note:
The length of string S will not exceed 12,000, and K is a positive integer.
String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-9) and dashes(-).
String S is non-empty.
 */

public class L482_LicenseKeyFormatting {
    public static String licenseKeyFormatting(String S, int K){
        String cleaned = S.replaceAll("\\-", "").toUpperCase();
        if (cleaned.length() < K) return cleaned;
        int k = cleaned.length() % K;
        int j = cleaned.length() / K;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cleaned.substring(0, k));
        for (int i = 0;  i <j; i++){
            stringBuilder.append("-");
            stringBuilder.append(cleaned.substring(K * i + k, K * i + K + k));
        }
        return k == 0 ? stringBuilder.toString().substring(1) : stringBuilder.toString();
    }

    public static void main(String[] args) {
        String S = "2-5g-3-J";
        int K = 2;
        System.out.println(licenseKeyFormatting(S, K));
    }
}
