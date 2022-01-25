package Tasks;

import java.util.Random;

public class Task2_2 {
    public static void diag() {

        int a, count = 5;
        int[][] array = new int[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                Random random = new Random();
                a = random.nextInt(10);
                array[i][j] = a;
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("______________________________________");

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if(i == j)
                {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
