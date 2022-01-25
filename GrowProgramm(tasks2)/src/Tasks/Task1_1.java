package Tasks;

import java.util.ArrayList;
import java.util.Random;

public class Task1_1 {
    public static void multiplicity(int count,int K)
    {
        int a,sum=0;
        int[] array = new int[count];
        for(int i=0;i<count;i++) {
            Random random = new Random();
            a = random.nextInt(10);
            array[i]=a;
            if ( array[i] % K ==0 )
            {
                sum += array[i];
            }
        }
        System.out.print("Сумма равна: "+ sum);
    }
}
