package Prayer;

public class CleanPrayer {

    public static void main(String[] args) {
        String prayer = "Oh Lord, won't you buy me a trash Mercedes Benz\n" +
                "My friends all drive trash Porsches, I must make trash amends\n" +
                "Worked hard all my trash lifetime, no help from my trash friends\n" +
                "So Lord, won't you buy me a trash Mercedes Benz";

        // Remover a palavra "trash"
        String cleanedPrayer = prayer.replaceAll("trash", "");

        // Imprimir em maiúsculas
        String upperCasePrayer = cleanedPrayer.toUpperCase();

        System.out.println(upperCasePrayer);
    }
}
