package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetrasSublinhado {
    public static void main(String[] args) {
        final var regex = "[a-z]_";
        final String string = "O_la_oioi_oi";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
        }
    }
}