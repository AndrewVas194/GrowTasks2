package Tasks;


import java.util.Random;

public class Task1_4 {
    public static void minMax() {
        int a;
        int min=10, max=0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            a = random.nextInt(10);
            array[i] = a;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {

                if (array[i] >= max) {
                    max = array[i];
                }
                else if(array[i]<=min)
                {
                    min=array[i];

                }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]==max)
            {
                array[i]=min;
            }
            else if(array[i]==min)
            {
                array[i]=max;
            }
            System.out.print(array[i] + " ");
        }
    }

}
