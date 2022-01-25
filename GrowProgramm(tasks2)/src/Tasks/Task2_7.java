package Tasks;

public class Task2_7 {
    public static void countOfPositive(int n){
        int pos=0;
        double a;
        double [][] array = new double[n][n];
        for (double i = 0; i < n; i++) {
            for (double j = 0; j < n; j++) {

                a=Math.sin((Math.pow(i,2)-Math.pow(j,2)/n));
                double roundOff = (double) Math.round(a * 10) / 10;    //округление до 0.0
                array[(int) i][(int) j]=roundOff;
                System.out.print(array[(int) i][(int) j] + " ");
                if(array[(int) i][(int) j]>0){
                    pos++;
                }
            }
            System.out.println(" ");
        }
        System.out.println("Количество положительных чисел: " + pos);
    }
}
