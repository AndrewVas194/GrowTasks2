package Tasks;

public class Task2_8 {
    public static void changeOfRow(int x,int y){
        int count=10;
        int [][] array = new int[count][count];
        for(int i=0;i<count;i++){
            for(int j=0;j<count;j++){
                if(j<count){
                    array[i][j] = j;
                    System.out.print(array[i][j] + " ");

                }
            }
            System.out.println(" ");
        }
        System.out.println("______________________________________");
        for(int i=0;i<count;i++){
            for(int j=0;j<count;j++) {
                array[i][x] = y;
                array[i][y] = x;
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
