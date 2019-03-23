package String;

public class L844_BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T){
        StringBuilder stringBuilder = new StringBuilder();
        for (char c:S.toCharArray()){
            if (c == '#'){
                if (stringBuilder.length() != 0){
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
            }else {
                stringBuilder.append(c);
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        for (char c:T.toCharArray()){
            if (c == '#'){
                if (stringBuilder2.length() != 0){
                    stringBuilder2.deleteCharAt(stringBuilder2.length()-1);
                }
            }
            else{
                stringBuilder2.append(c);
            }
        }
        return stringBuilder.toString().equals(stringBuilder2.toString());
    }
}
