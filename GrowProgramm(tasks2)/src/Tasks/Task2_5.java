package Tasks;

public class Task2_5 {
    public static void sumOfMax(int n) {
       int [][] array = new int[n][n];
       if(n%2==0){



           for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                   if(j<n-i){
                       array[i][j] = i + 1;
                       System.out.print(array[i][j] + " ");//j<n-i

                   }
                   else {
                       array[i][j]=0;
                       System.out.print(array[i][j] + " ");
                   }
               }
               System.out.println(" ");
           }

       }
       else{System.out.print("Размерность массива не четная");}

    }
}