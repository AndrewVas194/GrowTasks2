package Tasks;

public class Task2_6 {
    public static void oneToZero(int n) {
        int[][] array = new int[n][n];
        if (n % 2 == 0) {
            int a=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(n/2>i){
                    array[i][j]=1;
                        System.out.print(array[i][j]+ " ");
                    }

                }System.out.println(" ");
                }

            }


        else {
            System.out.print("Размерность массива не четная");
        }

    }
}