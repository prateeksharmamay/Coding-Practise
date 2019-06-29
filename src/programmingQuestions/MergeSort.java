// https://www.youtube.com/watch?v=TzeBrDU-JaY&t=977s
// https://www.youtube.com/watch?v=0nlPxaC2lTw&list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U&index=7&t=556s

package com.company;

public class MergeSort {
    public void mergeSortedArrays(int[] left, int[] right, int[] arr) {
        final int llen = left.length;
        final int rlen = right.length;
        final int alen = arr.length;
        int i = 0; // counter for left
        int j = 0; // counter for right
        int k = 0; // counter for arr

        while(i < llen && j < rlen) {
            if(left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while(i < llen) {
            arr[k++] = left[i++];
        }
        while(j < rlen) {
            arr[k++] = right[j++];
        }
    }

    public void mergeSort(int[] arr) {
        if(arr.length < 2) return;

        int mid = arr.length/2;

        int left[] = new int[mid];
        int right[] = new int[arr.length-mid];

        System.arraycopy(arr, 0, left, 0, mid);

        System.arraycopy(arr, mid, right, 0, arr.length-mid);

        mergeSort(left);
        mergeSort(right);

        mergeSortedArrays(left,right,arr);
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] arr = new int[]{5,2,5,6,10,1};
        m.mergeSort(arr);

        for (int a : arr){
            System.out.println(a);
        }
    }
}
