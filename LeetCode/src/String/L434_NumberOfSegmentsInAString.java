package String;

public class L434_NumberOfSegmentsInAString {
    public int countSegments(String s) {
        if (s == null || s.length()==0 || s.trim().length() ==0) return 0;
        String[] stringArrays = s.trim().split("\\s+");
        return stringArrays.length;

    }

    public static void main(String[] args) {
        String s = " abc def ";
        String[] sarray = s.split("\\s+");
        System.out.println("a");
    }
}
