package Tasks;

import java.util.Random;

public class Task2_14 {
    public static void countOnesChangeZeros(){
        Random rand = new Random();
        int a,n,m,ones=0;
        a= rand.nextInt(20);
        n=a;
        a= rand.nextInt(15);
        m=a;
        int [][] array=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i<=j)
                array[i][j]=1;
                else array[i][j]=0;
                    System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
