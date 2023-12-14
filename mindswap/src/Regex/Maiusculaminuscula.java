package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maiusculaminuscula {
    public static void main(String[] args) {
        final String regex = "[A-Z][a-z]";
        final String string = "Oi Tudo Bem?";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
        }
    }
}
