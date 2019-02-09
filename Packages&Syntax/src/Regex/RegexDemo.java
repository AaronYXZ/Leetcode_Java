package Regex;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{1,3}");
        String text = "456 is all I have except for1, 2 and 3; I don't have 12, 23";
        Set<String> matched = new HashSet<>();

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            matched.add(matcher.group());
        }
        matched.stream().forEach(System.out::println);
    }
}
