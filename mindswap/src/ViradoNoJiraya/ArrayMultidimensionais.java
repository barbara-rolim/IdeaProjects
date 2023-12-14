package ViradoNoJiraya;

public class ArrayMultidimensionais {
    public static void main(String[] args) {
        //1,2,3,4,5 Meses
        //31, 28, 31, 30 Dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31; //Janeiro
        dias[0][1] = 28; //Feveiro
        dias[0][2] = 31; //Março

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        for (int[] arrayBase : dias) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
