package Tasks;

import java.util.Random;

public class Task1_8 {
    public static void minInArray(int count){
        int a;
        int[] array = new int[count];
        for(int i=0;i<count;i++) {
            Random random = new Random();
            a = random.nextInt(10);
            array[i] = a;
            System.out.print(array[i]+ " ");
        }
        System.out.println(" ");

        int minVal = Integer.MAX_VALUE;
        for (int arr : array) minVal = Math.min(minVal, arr);
        int countMinElem = 0;
        for (int arr : array)
            if (arr == minVal) countMinElem++;

        int[] newA = new int[count - countMinElem];
        int indexNewArray = 0;
        for (int arr : array)
            if (arr != minVal) {
                newA[indexNewArray++] = arr;
                System.out.print(arr + " ");
            }
    }
}
