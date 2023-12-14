package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pqlqcoisaq {
    public static void main(String[] args) {
        final String regex = "[p.*q]";
        final String string = "pooooooooorq voce nao ta bem";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
        }
    }
}
