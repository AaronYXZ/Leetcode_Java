package HashTable;

/*
Q:
https://leetcode.com/problems/shortest-completing-word/description/

Find the minimum length word from a given dictionary words, which has all the letters from the string licensePlate. Such a word is said to complete the given string licensePlate

Here, for letters we ignore case. For example, "P" on the licensePlate still matches "p" on the word.

It is guaranteed an answer exists. If there are multiple answers, return the one that occurs first in the array.

The license plate might have the same letter occurring multiple times. For example, given a licensePlate of "PP", the word "pair" does not complete the licensePlate, but the word "supper" does.

Example 1:
Input: licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
Output: "steps"
Explanation: The smallest length word that contains the letters "S", "P", "S", and "T".
Note that the answer is not "step", because the letter "s" must occur in the word twice.
Also note that we ignored case for the purposes of comparing whether a letter exists in the word.
Example 2:
Input: licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
Output: "pest"
Explanation: There are 3 smallest length words that contains the letters "s".
We return the one that occurred first.
Note:
licensePlate will be a string with length in range [1, 7].
licensePlate will contain digits, spaces, or letters (uppercase or lowercase).
words will have a length in the range [10, 1000].
Every words[i] will consist of lowercase letters, and have length in range [1, 15].

S:
https://leetcode.com/problems/shortest-completing-word/discuss/158110/Java-6ms-beats-100-PRIME-NUMBERS
assign each letter a prime number and compute the product for the license plate. Then, compute the product for each word in wordlist. We know if the char product for a word is divisible by the license plate char product, it contains all the characters.
ToDo
S2:
https://leetcode.com/problems/shortest-completing-word/discuss/110137/Java-Solution-using-character-Array

 */

public class L748_ShortestCompletingWord {

    private static final int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

    public String shortestCompletingWord(String licensePlate, String[] words) {
        long charProduct = getCharProduct(licensePlate.toLowerCase());
        String answer = "aaaaaaaaaaaaaaaa";
        for (String word : words) {
            if (word.length() < answer.length() && getCharProduct(word) % charProduct == 0) {

                answer = word;
            }
        }
        return answer;

    }


    private static long getCharProduct(String plate) {
        long product = 1L;
        for (char c : plate.toCharArray()) {
            int index = c - 'a';
            if (0 <= index && index <= 25) {
                product *= primes[index];
            }
        }
        return product;
    }

}
