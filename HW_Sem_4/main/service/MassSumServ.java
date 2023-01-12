package HW_Sem_4.main.service;

public class MassSumServ<T extends Number> {
    public int[][] mult(T mass1[], T mass2[]) {
        int [][] c = new int [mass1.length][mass2.length];
        for(int i = 0; i < mass1.length; i++){
            for(int j = 0; j < mass2.length; j++){
                c[i][j] = mass1[i].intValue() * mass2[j].intValue();
            }
        }
        return c;
    }
}
