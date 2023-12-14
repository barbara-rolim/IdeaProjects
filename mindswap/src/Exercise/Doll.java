package Exercise;

public class Doll { //classe

    //ATRIBUTOS
    private String name;
    private String hairColor;
    private double height;

    //METODO CONSTRUTOR
public Doll(String name, String hairColor, double height){ //especifica que o construtor é público (significa que pode ser acessado de qualquer lugar) e que ele recebe 3 parâmetros
    this.name = name; //Esta linha atribui o valor a propriedade
    this.hairColor = hairColor;
    this.height = height;
}

//ENCAPSULAMENTO CONCEITO DE ESCONDER OS DETALHES INTERNOS E FORNECER METODOS (GETTER E SETTER) PARA ACESSAR OU MODIFICAR OS DADOS
public String getName(){ //METODO DE ACESSO
    return name;
}

public void setName(String name){ //METODO MODIFICA
    this.name = name;
}

public String getHairColor(){
    return hairColor;
}

public void setHairColor(String hairColor){
    this.hairColor = hairColor;
}

public double getHeight(){
    return height;
}

public void setHeight(double height){
    this.height = height;
}

// METODO PARA EXIBIR INFORMACOES DA BONECA
public void describe() {
    System.out.println("Name: " + name);
    System.out.println("Hair Color: " + hairColor);
    System.out.println("Height: " + height + " cm");
    }

    //METODO PARA EXECUCAO

public static void main(String[] args) {
    Doll myDoll = new Doll("Anna", "Blonde", 30.5);
    myDoll.describe();

    myDoll.setName("Elsa");
    myDoll.setHairColor("Silver");
    myDoll.setHeight(32.0);

    System.out.println("\nSecond Doll:");
    myDoll.describe();
    }
}