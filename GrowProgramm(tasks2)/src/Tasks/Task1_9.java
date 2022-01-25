package Tasks;

import java.util.Random;

public class Task1_9 {
    public static void getMostPopularNumber() {
        int ran,count=10;
        int[] array  =  new int[count];
        int[] array1 = new int[count];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            ran = random.nextInt(10);
            array[i] = ran;
            array1[i] = 0;
        }


        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Задан массив");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            a = array[i];
            for (int j = 0; j < array.length; j++) {
                if (a == array[j]) {
                    b++;
                }
            }

            array1[i] = b;
            b = 0;
        }
        c = array[0];
        for (int i = 0; i < array1.length; i++) {
            if (c < array1[i]) {
                c = array1[i];
            }
        }

        int n = array[0];
        for (int i = 0; i < array1.length; i++) {
            if (c == array1[i]) {
                if (n > array[i]) {
                    n = array[i];
                }
            }

        }
        System.out.println();
        System.out.print("Наибольшее число повторений у наименьшего числа " + n);

    }
}
