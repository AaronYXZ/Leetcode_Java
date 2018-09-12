package HashTable;

/*
Q:
https://leetcode.com/problems/count-primes/description/

Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

S:
https://www.programcreek.com/2014/04/leetcode-count-primes-java/ solution2
埃拉托斯特尼筛法 Sieve of Eratosthenes https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
Pseudocode
The sieve of Eratosthenes can be expressed in pseudocode, as follows:[7][8]

 Input: an integer n > 1.

 Let A be an array of Boolean values, indexed by integers 2 to n,
 initially all set to true.

 for i = 2, 3, 4, ..., not exceeding √n:
   if A[i] is true:
     for j = i^2, i^2+i, i^2+2i, i2+3i, ..., not exceeding n:
       A[j] := false.

 Output: all i such that A[i] is true.
 */

import java.util.Arrays;

public class L204_CountPrimes {
    public static int countPrimes(int n){
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);

        for (int i = 2; i < Math.sqrt(n); i++){
            if (prime[i]){
                for (int j = i*i; j < n; j +=i){
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i<n; i++){
            if (prime[i]) count++;
        }

        return count;
    }
}
