package ViradoNoJirayaClasses.Funcionarios;

public class main {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
        funcionario.setNome("Barbara");
        funcionario.setIdade(32);
        funcionario.setSalarios(new int[]{0, 2000, 3000});
        funcionario.imprime();
        funcionario.mediaDeSalario();
    }
}
