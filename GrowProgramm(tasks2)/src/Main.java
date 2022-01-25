import Tasks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        int x, y, z, q, w, e;
        String s;
        double answer;
        int ans;
        Scanner sc = new Scanner(System.in);
        ans = sc.nextInt();
        switch (ans) {
            case 1:
////////////////Task1_1/////////////////////////////////////////////////////////////////
                x=sc.nextInt();
                y=sc.nextInt();
                Task1_1.multiplicity(x,y);
                break;
            case 2:
////////////////Task1_1/////////////////////////////////////////////////////////////////
                x=sc.nextInt();
                Task1_2.changeZ(x);
                break;
            case 3:
////////////////Task1_3/////////////////////////////////////////////////////////////////
                x=sc.nextInt();
                Task1_3.countOfPositive_Negative_Zeros(x);
                break;
            case 4:
////////////////Task1_4////////////////////////////////////////////////////////////////
                Task1_4.minMax();
                break;
                case 5:
////////////////Task1_5////////////////////////////////////////////////////////////////
                Task1_5.aMorei();
                break;
                case 6:
////////////////Task1_6////////////////////////////////////////////////////////////////
                x=sc.nextInt();
                Task1_6.sum(x);
                break;
            case 7:
////////////////Task1_7////////////////////////////////////////////////////////////////
                x=sc.nextInt();
                Task1_7.getMaxSum(x);
                break;
            case 8:
////////////////Task1_8////////////////////////////////////////////////////////////////
                x=sc.nextInt();
                Task1_8.minInArray(x);
                break;
            case 9:
////////////////Task1_9////////////////////////////////////////////////////////////////

                Task1_9.getMostPopularNumber();
                break;
            case 10:
////////////////Task1_10////////////////////////////////////////////////////////////////
                x=sc.nextInt();
                Task1_10.div2(x);
                break;
            case 11:
////////////////Task2_1////////////////////////////////////////////////////////////////
                Task2_1.lastEl();
                break;
            case 12:
////////////////Task2_2////////////////////////////////////////////////////////////////
                Task2_2.diag();
                break;
            case 13:
////////////////Task2_3////////////////////////////////////////////////////////////////

                x=sc.nextInt();
                y=sc.nextInt();
                Task2_3.outputMatrix(x,y);
                break;
            case 14:
////////////////Task2_4////////////////////////////////////////////////////////////////
                x=sc.nextInt();
                Task2_4.matrix(x);
                break;
            case 15:
////////////////Task2_5////////////////////////////////////////////////////////////////
                x=sc.nextInt();
                Task2_5.sumOfMax(x);
                break;
            case 16:
////////////////Task2_6//////Не работает//////////////////////////////////////////////
                x=sc.nextInt();
                Task2_6.oneToZero(x);
                break;
            case 17:
////////////////Task2_5////////////////////////////////////////////////////////////////
                x=sc.nextInt();
                Task2_7.countOfPositive(x);
                break;
            case 18:
////////////////Task2_6//////////////////////////////////////////////////////////////
                x=sc.nextInt();
                y=sc.nextInt();
                Task2_8.changeOfRow(x,y);
                break;
            case 19:
////////////////Task2_9//////////////////////////////////////////////////////////////
                x=sc.nextInt();
                y=sc.nextInt();
                Task2_9.sumOfPositive(x,y);
                break;
            case 20:
////////////////Task2_10//////////////////////////////////////////////////////////////
                x=sc.nextInt();
                Task2_10.positiveOnDiagonal(x);
                break;
            case 21:
////////////////Task2_11//////////////////////////////////////////////////////////////
                Task2_11.countMoreFive();
                break;
            case 24:
////////////////Task2_14//////////////////////////////////////////////////////////////
                Task2_14.countOnesChangeZeros();
                break;
            case 25:
////////////////Task2_15//////////////////////////////////////////////////////////////
                Task2_15.changeEvenToMax();
                break;


            default:System.out.print("Выберите задание ");
        }
    }
}
