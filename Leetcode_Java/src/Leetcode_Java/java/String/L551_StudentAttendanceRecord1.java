package String;

/*
https://leetcode.com/problems/student-attendance-record-i/
You are given a string representing an attendance record for a student. The record only contains the following three characters:
'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True
Example 2:
Input: "PPALLL"
Output: False

 */
public class L551_StudentAttendanceRecord1 {
    public boolean checkRecord(String s) {
        int absent = 0;
        int maxL = 0;
        int sofarL = 0;
        // loop through every char,
        // if A, then increment absent, reset sofarL to 0
        // if L, then increment sofarL, get maxL
        // if P, reset sofarL to 0
        for (char c:s.toCharArray()){
            if (c == 'A') {
                sofarL = 0;
                absent++;
            }
            else if (c == 'L'){
                sofarL ++;
                maxL = Math.max(sofarL, maxL);
            }
            else{
                sofarL = 0;
            }
        }
        return (absent <=1 && maxL <= 2);
    }
}
