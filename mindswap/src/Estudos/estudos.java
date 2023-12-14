/*package Estudos;

public class estudos {

    /*public static void main(java.lang.String[] args) {

        /*java.lang.String monsterMessage = "Om nom nom nom.";

        /*int index = monsterMessage.indexOf("a");
        System.out.println(index);
        int secondIndex = monsterMessage.indexOf("o", 5);
        System.out.println(secondIndex);
        int lastIndexOf = monsterMessage.lastIndexOf("o");
        System.out.println(lastIndexOf);
        String allCapsMessage = monsterMessage.toUpperCase();
        System.out.println(allCapsMessage);
        String noCapsMessage = monsterMessage.toLowerCase();
        System.out.println(noCapsMessage);
        String result = monsterMessage.replace("o", "a");
        System.out.println(result);
        String result2 = monsterMessage.replaceAll("\\s", "");
        System.out.println(result2);

        java.lang.String monsterGift = "I'd give you a cookie but I ate it.";
        System.out.println(monsterGift);
        java.lang.String[] words = monsterGift.split("");
        System.out.println(words);
        java.lang.String[] moreWords = monsterGift.split("", 2);
        System.out.println(moreWords);
        java.lang.String substring = monsterGift.substring(22);
        System.out.println(substring);
        java.lang.String anotherSubstring = monsterGift.substring(15, 21);
        System.out.println(anotherSubstring);
        java.lang.String cookieType = "        chocolate chip     ";
        cookieType.trim();
        System.out.println(cookieType.trim());
    }
        /*public class Array {
        //Ao declarar um array, você especifica o tipo de elementos que ele conterá, seguido por colchetes [] para indicar que é um array. Em Java, a inicialização pode ser feita diretamente ou usando a palavra-chave new:
        int[] numeros = new int[5];
        //Neste exemplo, numeros é um array de inteiros com tamanho 5. Os elementos são inicializados com valores padrão (0 para inteiros) quando o array é criado. (0, 1 ,2, 3, 4)
        //Os elementos em um array são acessados por meio de índices, que começam em 0. Você pode ler ou modificar um elemento usando o operador de acesso []:
        int valor = numeros[2];  // Lê o valor do terceiro elemento (índice 2)
        numeros[3] = 42;         // Modifica o valor do quarto elemento (índice 3)
        //O tamanho de um array é fixo após a sua criação. Se você precisar de uma coleção de tamanho variável, pode considerar outras estruturas de dados, como ArrayList em Java.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        //O numeros.length fornece o tamanho do array, permitindo que você itere por todos os elementos.

    /*A estrutura if-then-else é uma construção de controle de fluxo em muitas linguagens de programação, incluindo Java. Ela permite que um programa execute diferentes blocos de código com base em uma condição booleana. Aqui está uma explicação mais detalhada:
            if (condição) {
        // Bloco de código a ser executado se a condição for verdadeira
    } else {
        // Bloco de código a ser executado se a condição for falsa
    }
    Explicação:
    A palavra-chave if inicia a estrutura condicional. A condição é uma expressão booleana que será avaliada como verdadeira ou falsa.
    Se a condição é verdadeira, o bloco de código dentro do primeiro conjunto de chaves {} (após o if) é executado.
    Se a condição é falsa, o bloco de código dentro do segundo conjunto de chaves {} (após o else) é executado.
    A parte else é opcional. Se você só precisa executar código quando a condição é verdadeira, pode omitir o bloco else.
    Exemplo:
    Neste exemplo, se a variável idade for maior ou igual a 18, a mensagem "Você é maior de idade." será impressa. Caso contrário, a mensagem "Você é menor de idade." será impressa.
     ViradoNoJiraya.If-Then (sem Else):
      Se você só precisa executar código quando a condição é verdadeira e não precisa de um bloco de código para o caso contrário, você pode usar uma construção if-then sem else:*/

//public static void main(String[] args) {

       /* int idade = 18;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
            return;
        }
        System.out.println("Você é menor de idade.");
    }*/

       /* String weekday = "MONDAY";

        {
            switch (weekday) {
                case "SUNDAY":
                    System.out.println("Sunday, bloody Sunday.");
                    break;
                case "MONDAY":
                    System.out.println("Monday, Monday, can't trust that day.");
                    break;
                case "TUESDAY":
                    System.out.println("Give me your heart and I'll love you till Tuesday.");
                    break;
                case "WEDNESDAY":
                    System.out.println("On Wednesday they're feelin' fine again.");
                    break;
                case "THURSDAY":
                    System.out.println("And I was Thursday's child (oh, oh, oh, oh).");
                    break;
                case "FRIDAY":
                    System.out.println("It's Friday, Friday, gotta get down on Friday.");
                    break;
                case "SATURDAY":
                    System.out.println("Gonna keep on dancing to the rock and roll, on Saturday night.");
                    break;
            }
        }
    }*/

        /*int bullets = 20;

// WHILE LOOP
        while (bullets > 0) {
            System.out.println("Pew pew pew.");
            bullets--;
        }

// DO-WHILE LOOP
        do {
            System.out.println("Pew pew pew.");
            bullets--;
        } while (bullets > 0);
    }
}*/
       /* int bullets = 20;

// For LOOP
        for (int i = 1; i <= bullets; i++) {
            System.out.println("Pew pew pew.");
            bullets--;
        }


        String[] names = {"Elizabeth", "Archibald", "Victoria", "Charles", "Sarah"};

// ENHANCED FOR LOOP
        for (String name : names) {
            System.out.println(name);
        }
    }*/
        /*
// Array de números inteiros
        int[] numeros = {1, 2, 3, 4, 5};

// Enhanced For Loop para iterar sobre os números
        for (int numero : numeros) {
            System.out.println(numero);
        }
        Neste exemplo:

        int[] numeros é um array de números inteiros.
        for (int numero : numeros) é o Enhanced For Loop.
        int numero declara uma variável temporária chamada numero que é utilizada para armazenar cada elemento do array durante a iteração.
: numeros especifica a coleção a ser iterada, que é o array numeros.
        O bloco de código dentro do loop (System.out.println(numero);) é executado para cada elemento do array, imprimindo o número.
        A principal vantagem do Enhanced For Loop é a simplicidade. Ele cuida automaticamente dos detalhes de iteração sobre a coleção, permitindo que você se concentre no processamento de cada elemento sem a necessidade de gerenciar índices manualmente. Este tipo de loop é especialmente útil quando você não precisa rastrear a posição dos elementos no array ou lista

*/