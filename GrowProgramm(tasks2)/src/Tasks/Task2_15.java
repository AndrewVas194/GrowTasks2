package Tasks;

import java.util.Random;

public class Task2_15 {
    public static void changeEvenToMax(){
        int a, count = 10,max=0;

        int[][] array = new int[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                Random random = new Random();
                a = random.nextInt(100);
                array[i][j] = a;
                if(array[i][j]>=max)
                    max=array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("______________________________________");

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if(array[i][j]%2==1){
                    array[i][j]=max;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
