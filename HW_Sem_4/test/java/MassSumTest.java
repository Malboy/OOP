package HW_Sem_4.test.java;


import org.junit.*;
import HW_Sem_4.main.service.MassSumServ;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class MassSumTest {
    @Test
    public void MultiplyWithoutMassives(){
        MassSumServ<Integer> serv = new MassSumServ<>();
        Integer[] a ={1,1,1};
        Integer[] b ={1,1,1};
        Integer[][] result = {{1,1,1}, {1,1,1}, {1,1,1}};
        assertEquals(serv.mult(a,b), result);
    }
}
