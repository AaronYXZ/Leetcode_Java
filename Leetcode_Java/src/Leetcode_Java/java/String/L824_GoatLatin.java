package String;

/*
https://leetcode.com/problems/goat-latin

A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.

If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".

Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin.



Example 1:

Input: "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:

Input: "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 */
public class L824_GoatLatin {


    public String toGoatLatin(String S) {
        String[] sArray = S.split(" ");
        String vowels = "aeiouAEIOU";
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < sArray.length; i++) {
            String tmpS = sArray[i];
            String resultS;
            if (vowels.indexOf(tmpS.charAt(0)) >= 0) {
                resultS = tmpS + "ma";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 1; j < tmpS.length(); j++) {
                    stringBuilder.append(tmpS.charAt(j));
                }
                stringBuilder.append(tmpS.charAt(0));
                stringBuilder.append("ma");
                resultS = stringBuilder.toString();
            }
            StringBuilder tmpSB = new StringBuilder(resultS);
            for (int m = 0; m <= i; m++) {
                tmpSB.append('a');
            }
            tmpSB.append(' ');
            resultString.append(tmpSB);
        }

        return resultString.toString().substring(0, resultString.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println("aeiou".indexOf('i'));
    }
}
