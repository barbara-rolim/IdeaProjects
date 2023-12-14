package ViradoNoJirayaClasses.Funcionarios;

public class Funcionarios {
    private String nome;
    private int idade;
    private int[] salarios;

    public void imprime() {
        if (salarios == null) {
            return;
        }
        System.out.println(this.nome);
        System.out.println(this.idade);
            for (int salario : salarios) {
                System.out.println(salario + " ");
            }
        }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(int[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int[] getSalarios() {
        return salarios;
    }

    public void mediaDeSalario () {
            if (salarios == null) {
                return;
            }
            double media = 0;
            for (int salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
            System.out.println("Media salarial " + media);
        }
    }
