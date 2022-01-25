package Tasks;

import java.util.Random;

public class Task1_10 {
    public static void div2(int n){
        int a;
        int[] array = new int[n];
        for(int i=0;i<array.length;i++)
        {
            Random random = new Random();
            a = random.nextInt(10);
            array[i]=a;
            System.out.print(array[i]+ " ");
        }
        System.out.println(" ");
        for(int i=0;i<array.length;i++){
            if(i%2==1)                     //i%2==0 для чётных
            {
                array[i]=0;
                System.out.print(array[i]+ " ");
            }
            else System.out.print(array[i]+ " ");

        }
    }
}
