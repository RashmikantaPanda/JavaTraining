package gov.in.oupp.training.java.corejava.arrays;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{55, 65, 75}, {10, 15, 20}, {78, 89, 82}};
        displayMatrix(matrix);
        int maxElementInMatrix=findMaxElement(matrix);
        System.out.println("Maximum element in the matrix is : "+maxElementInMatrix);
    }

    private static int findMaxElement(int[][] arr) {
        if(arr.length==0){
            throw new IllegalArgumentException("Empty Matrix");
        }
        int maxElement=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
              if(arr[i][j]>maxElement)
                  maxElement=arr[i][j];
            }
        }
        return maxElement;
    }

    private static void displayMatrix(int[][] matrix) {
        System.out.println("The matrix is : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
