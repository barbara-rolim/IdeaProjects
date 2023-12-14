package ViradoNoJiraya;


public class TiposPrimitivos {
    private String name;
    private String end;
    private Double salary;
    private String date;
    private static String relatorio;
    public TiposPrimitivos(String name, String end, Double salary, String date) {
        this.name = "Barbara";
        this.end = "Av Santo Antonio, 301";
        this.salary = 1200.00D;
        this.date = "12/08/1991";
        this.relatorio = "Eu " + name + ", morando no endereço " + end + ", confirmo que recebi o salario de "
                + salary + ", na data " + date;
    }

    public static void main(String[] args) {
        TiposPrimitivos objeto = new TiposPrimitivos("Barbara", "Av Santo Antonio, 301", 1200.00D, "12/08/1991");
        System.out.println(relatorio);
    }
}

