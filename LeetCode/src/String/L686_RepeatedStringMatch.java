package String;

public class L686_RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B){
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() < B.length()){
            stringBuilder.append(A);
            count++;
        }
        if (stringBuilder.toString().contains(B)) return count;
        if (stringBuilder.append(A).toString().contains(B)) return count + 1;
        return -1;

    }
}
