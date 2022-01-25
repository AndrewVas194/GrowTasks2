package Tasks;

import java.util.Random;

public class Task2_9 {
    public static void sumOfPositive(int str,int row){
        int [][] array = new int[str][row];
        int [] arrayMaxSum= new int[row];
        int a,b=0,sum = 0;
        int max=0;

        for(int i=0;i<str;i++){
            for (int j=0;j<row;j++){
                Random random = new Random();
                a = random.nextInt(100);
                array[i][j]=a;
                System.out.print(array[i][j]+ " ");
            }
            System.out.println(" ");
        }
        for(int i=0;i<str;i++) {
            for (int j = 0; j < row; j++) {


                    arrayMaxSum[j]+=array[i][j];
               // System.out.print("Сумма "+i+"-ой строки и "+j+" столбца:");
               // System.out.println(arrayMaxSum[j]+ " ");
            }

           // System.out.println(" ");
        }

        for(int i=0;i<row;i++){
            if(arrayMaxSum[i]>=max) {
                max = arrayMaxSum[i];
                b=i;
            }
        }
        System.out.println("Наибольшая сумма "+max+" находится в столбце: "+ b );
    }
}
