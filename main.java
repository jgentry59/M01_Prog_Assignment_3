import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list 1: "); //Prompts user to input the first 3x3 array
        int[][] m1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter list 2: "); //Prompts user to input the second 3x3 array
        int[][] m2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = scanner.nextInt();
            }
        }
        if (equals(m1, m2)) {                 //Compares arrays and displays if they are identical or not
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
        scanner.close();
    }
    public static boolean equals(int[][] m1, int[][] m2) {      //Define a method to compare the 2D arrays
        if (m1.length != m2.length || m1[0].length != m2[0].length) {  //Compare array dimensions
            return false;
        }
        for (int i = 0; i < m1.length; i++) {            //Compare array contents  
            for (int j = 0; j < m1[0].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
