package Tasks;

import java.util.Random;

public class Task1_5 {
    public static void aMorei(){
        int a;
        int[] array = new int[10];
        for(int i=0;i<array.length;i++)
        {
            Random random = new Random();
            a = random.nextInt(10);
            array[i]=a;
            System.out.print(array[i]+ " ");
        }
        System.out.println(" ");

        for(int i=0;i<array.length;i++)
        {
            if(array[i]>i)
                System.out.print(array[i] + " ");
            else {}
        }
    }
}
