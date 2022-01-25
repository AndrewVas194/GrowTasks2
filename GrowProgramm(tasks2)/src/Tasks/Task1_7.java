package Tasks;

import java.util.Random;

public class Task1_7 {
    public static void getMaxSum(int count) {

        int a;
        int[] array = new int[count];
        for(int i=0;i<count;i++) {
            Random random = new Random();
            a = random.nextInt(10);
            array[i] = a;
            System.out.print(array[i]+ " ");
        }
        System.out.println(" ");


        int sum=0;

        for(int i=1;i<count;i++){
            int j=count;
            j-=i-1;
            if(sum<=array[i]+array[count-j]){
                sum=array[i]+array[count-j];
            }
            else {}
        }
        System.out.println(sum);
    }
}
