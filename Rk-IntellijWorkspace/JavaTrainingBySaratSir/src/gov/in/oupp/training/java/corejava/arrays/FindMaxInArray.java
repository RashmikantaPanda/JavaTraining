package gov.in.oupp.training.java.corejava.arrays;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr={45,78,65,22,35,79};
        displayArr(arr);
        int maxElement=findMax(arr);
        System.out.println("Maximum element in the array is : "+maxElement);
    }

    private static void displayArr(int[] arr) {
        System.out.print("Given array is : [ ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println("");
    }

    private static int findMax(int[] arr) {
        if(arr.length==0){
            throw new IllegalArgumentException("Empty Array");
        }
        int maxElement=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[0]){
                maxElement=arr[i];
            }
        }
        return maxElement;
    }
}
