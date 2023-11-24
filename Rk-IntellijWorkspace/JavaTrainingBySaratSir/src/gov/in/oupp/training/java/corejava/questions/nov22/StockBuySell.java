package gov.in.oupp.training.java.corejava.questions.nov22;

public class StockBuySell {
    public static int minValueIndex(int[] arr){
        int minIndex=-1,minValue=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<minValue){
                minValue=arr[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
    public static int maxValueIndex(int arr[],int startIndex){
        int maxValueIndex=0;
        int maxValue=arr[startIndex];
        for(int i=startIndex; i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
                maxValueIndex=i;
            }
        }
        return maxValueIndex;
    }
    public static void main(String[] args) {
        int arr[]= new int[]{7, 6, 4, 3, 1};
        int minValueIndex=minValueIndex(arr);
        System.out.println(minValueIndex);
        int profit;
        if(minValueIndex==arr.length-1){
            profit=0;
        }
        else {
            int maxValueIndex = maxValueIndex(arr, minValueIndex);
            System.out.println(maxValueIndex);

            profit = arr[maxValueIndex] - arr[minValueIndex];
        }
        System.out.println(profit);


    }
}
