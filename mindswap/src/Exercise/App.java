package Exercise;

public class App {

    public static void main(String[] args) {
        String a = "Hi";
        String b = a;
        String c = "Hi";
        String d = new String("Hi");
        String e = new String("Hi");

        boolean isAEqualToB = a == b;
        boolean isAEqualToC = a == c;
        boolean isAEqualToD = a == d;
        boolean isDReallyEqualToE = d.equals(e);

        System.out.println(isAEqualToB);
        System.out.println(isAEqualToC);
        System.out.println(isAEqualToD);
        System.out.println(isDReallyEqualToE);
        }
    }
