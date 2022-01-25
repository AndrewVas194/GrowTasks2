package Tasks;

public class Task2_4 {
    public static void matrix(int n)
    {
        if(n%2!=1)
        {
            int minToMax=1,MaxToMin=n;
            int[][] array = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == 0) {
                        array[i][j] = minToMax;

                        if (minToMax == n)
                            minToMax = 0;
                        minToMax++;
                        System.out.print(array[i][j] + " ");
                    } else if (i % 2 == 1) {
                        array[i][j] = MaxToMin;

                        if (MaxToMin == 1)
                            MaxToMin = n + 1;
                        MaxToMin--;
                        System.out.print(array[i][j] + " ");

                    }
                }
                System.out.println(" ");
            }
        }
        else {System.out.print("Матрица будет нечетной(не соответствие условию!)");}

    }
}
