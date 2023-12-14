package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoverVogais {

    public static void main(String[] args) {
        final String regex = "[^aeiou]+";
        final String string = "Let's have some fun with Mindera Regex exercises! Any doubts ? Feel free to goooglize.";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
        }
    }
}

