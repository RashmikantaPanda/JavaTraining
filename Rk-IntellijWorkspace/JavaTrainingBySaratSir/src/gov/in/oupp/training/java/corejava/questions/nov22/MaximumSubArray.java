package gov.in.oupp.training.java.corejava.questions.nov22;
/*
* Find the maximum subArray */
public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[] = new int[]{-2, 1, -3, 4, - 1, 2, 1, -5, 4};
        int maxSum = 0;
        int sum = 0, indexI = 0, indexJ = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println(indexI);
        System.out.println(indexJ);
        System.out.println(maxSum);
        for (int i = indexI; i <= indexJ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
