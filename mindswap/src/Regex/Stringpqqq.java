package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringpqqq {
    public static void main(String[] args) {
        final String regex = "[pq*]";
        final String string = "pqqq";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
        }
    }
}

