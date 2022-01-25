package Tasks;


import java.util.Random;

import static Tasks.Prime.isPrime;

public class Task1_6 {
    public static void sum(int N) {
        int a, sum = 0;
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            a = random.nextInt(100);
            array[i] = a;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");


        for (int i = 0; i < array.length; i++) {
            if (isPrime(i)) {
                sum += array[i];
            }
        }
        System.out.println("Sum: " + sum);

    }
}
