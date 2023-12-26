package org.oupp.basics.array;

public class ReverseAnArrayWithGroupWithSizeK {
    public static void main(String[] args) {
        int[] arr={10,18,12,15,11,1,6,4,5,8,6,45,11,12,14,15,12};
        int temp=0,k=5;
        System.out.println("Length is : "+arr.length);
        System.out.println("K is : "+k);
        for(int a=0; a< arr.length; a=a+k){
            if(a > arr.length-k){
                for (int i=a,j= arr.length-1; i<j; i++,j--){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            else {
                for (int i = a, j = a + k - 1; i < j; i++, j--) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
