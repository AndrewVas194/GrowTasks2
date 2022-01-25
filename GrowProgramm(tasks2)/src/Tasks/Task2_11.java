package Tasks;

import java.util.Random;

public class Task2_11 {
    public static void countMoreFive(){
        int count=10,a,countOfFive=0;
        int [][] array =new int[count][count*2];
        String [] arrayOfFive = new String[count*2];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count*2; j++) {
                Random random = new Random();
                a = random.nextInt(15);
                array[i][j] = a;
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("______________________________________");

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count*2; j++) {
                if(array[i][j]==5)
                {
                    arrayOfFive[countOfFive]="Местоположение 5 : "+ i+" "+j + "\n";
                    countOfFive++;
                }
            }
        }
        if(countOfFive>=3)
        {
            for (int i=0;i<countOfFive;i++)
                System.out.print(arrayOfFive[i]);
        }
    }
}
