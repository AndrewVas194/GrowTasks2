package Tasks;

import java.util.Random;

public class Task1_2 {
    public static void changeZ(int Z){
    int a,count=0;
    int[] array = new int[10];
        for(int i=0;i<array.length;i++)
        {
            Random random = new Random();
            a = random.nextInt(10);
            array[i]=a;
            System.out.print(array[i]+ " ");
        }
        System.out.println(" ");
        for (int i=0;i<array.length;i++){
            if ( array[i]>=Z)
            {
                array[i]=Z;
                count++;
                System.out.print(array[i] + " ");
            }else {System.out.print(array[i]+ " "); }
            }

        System.out.println("Количество замен: "+count);
    }
}
