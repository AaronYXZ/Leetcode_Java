package Array;

public class L387_FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {
        int[] ans = new int[26];
        for (int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            ans[index]++;
        }
        for (int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            if (ans[index] == 1) return i;
        }

        return -1;
    }
}
