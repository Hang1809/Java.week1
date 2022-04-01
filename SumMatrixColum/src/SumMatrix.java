import java.util.Scanner;

public class SumMatrix {

    public static void main (String[]args){
        int row, col;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number row of Matrix: ");
        row = scanner.nextInt();
        System.out.println("Input the number colum of Matrix: ");
        col = scanner.nextInt();


        int Array[][] = new int[row][col];
        System.out.println("Input value of Index in Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" Array[" + i + "][" + j + "] = ");
                Array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("-------*-------\n The Matrix is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for( col = 0; col < Array[0].length; col++){
            int total = 0;
            for( row = 0; row < Array.length; row++){
                total += Array[row][col];
            }
            System.out.println("Sum for column " + col + " is " + total);
        }
    }
}
