package Tasks;

import java.util.Random;

public class Task1_3 {
    public static void countOfPositive_Negative_Zeros(int N)
    {
        int a;
        int pos=0,neg=0,zero=0;
        int[] array = new int[N];
        for(int i=0;i<N;i++) {
            Random random = new Random();
            a =-10+ random.nextInt(20);
            array[i]=a;
            if(array[i]<0)
            neg++;

            else if(array[i]>0)
                pos++;

                else if(array[i]==0)
                    zero++;

        }
        System.out.print("Положительных:"+pos+" Отрицательных:"+neg+" Равных нулю:"+zero);

    }
}
