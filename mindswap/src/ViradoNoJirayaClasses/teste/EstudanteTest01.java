package ViradoNoJirayaClasses.teste;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Barbara");
        estudante.setIdade(32);
        estudante.setSexo('F');
        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getSexo());
    }
}
