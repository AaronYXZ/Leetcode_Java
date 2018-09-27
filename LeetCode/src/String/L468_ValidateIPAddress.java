package String;

public class L468_ValidateIPAddress {
    public String validateIPAddress(String IP){
        if (isValidIPv4(IP)) return "IPv4";
        else if (isValidIPv6(IP)) return "IPv6";
        else return "Neither";

    }

    public boolean isValidIPv4Token(String token){
        if (token.startsWith("0") && token.length() > 1) return false;
        try {
            int parsedInt = Integer.parseInt(token);
            if (parsedInt > 255 || parsedInt < 0) return false;
            if (parsedInt == 0 && token.charAt(0) != '0') return false;
        } catch(NumberFormatException nfe){
            return false;
        }

        return true;
    }

    public boolean isValidIPv4(String IP){
        if (IP.length() < 7) return false;
        if (IP.charAt(0) == '.') return false;
        if (IP.charAt(IP.length()-1) == '.') return false;
        String[] tokens = IP.split("\\.");
        if (tokens.length != 4) return false;
        for (String s:tokens){
            if (!isValidIPv4Token(s)) return false;
        }
        return true;
    }

    public boolean isValidIPv6Token(String token){
        if (token.length() > 4 || token.length() == 0) return false;
        char[] chars = token.toCharArray();
        for (char c:chars){
            boolean isDigit = c >= 48 && c <=57;
            boolean isUpperCaseAF = c >= 65 && c<= 70;
            boolean isLowerCaseAF = c >= 97 && c <= 102;
            if (!(isDigit || isUpperCaseAF || isLowerCaseAF)){
                return false;
            }
        }
        return true;
    }

    public boolean isValidIPv6(String IP){
        if (IP.length()<15) return false;
        if (IP.charAt(0) == ':') return false;
        if (IP.charAt(IP.length() - 1) == ':') return false;
        String[] tokens = IP.split(":");
        for (String token: tokens){
            if (!isValidIPv6Token(token)) return false;
        }

        return true;
    }
}
