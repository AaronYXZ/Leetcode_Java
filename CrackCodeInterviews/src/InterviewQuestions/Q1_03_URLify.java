package InterviewQuestions;

import java.net.URL;

public class Q1_03_URLify {

    public static char[] URLify(char[] str, int trueLength){
        int spaceCount = 0;
        for (char c : str) {
            if (c == ' '){
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount*2;
        char[] result = new char[index];

        for (int i = str.length-1; i >=0; i--){
            if (str[i] == ' '){
                result[index-1] = '0';
                result[index -2] = '2';
                result[index-3] = '%';
                index = index -3 ;
            }
            else
            {
                result[index-1] = str[i];
                index = index-1;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        char[] test1 = "a b c".toCharArray();
        char[] test1URLfied = URLify(test1, test1.length);
        System.out.println(test1URLfied);

    }
}
