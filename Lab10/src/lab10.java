import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class lab10 {
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
       int i = 0, j = 0; 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2; 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    } 
    // Driver code
    public static void main(String args[])
    {
        System.out.print("Enter list1: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] valueString = line.split(" ");
        int[] list1 = new int[valueString.length];
        for(int i=0;i<valueString.length;i++){
            list1[i] = Integer.parseInt(valueString[i]);
        }

        System.out.print("Enter list2: ");
        line = scanner.nextLine();
        valueString = line.split(" ");
        int[] list2 = new int[valueString.length];
        for(int i=0;i<valueString.length;i++){
            list2[i] = Integer.parseInt(valueString[i]);
        }
        int[] sortedList = merge(list1, list2);
        lab10 ob = new lab10();
        ob.sort(sortedList, 0, sortedList.length - 1);

        System.out.print("The merged list is ");
        for(int i : sortedList){
            System.out.print(i+" ");
        }
        System.out.println();
    }
public static int[] merge(int[] list1, int[] list2)
{
        int leftLen = list1.length;
        int rightLen = list2.length;
        int[] sortedList = new int[leftLen+rightLen];
        int sortedIndex = 0, left=0, right=0;
        
        while(left < leftLen && right < rightLen){
            if(list1[left] < list2[right]){
                sortedList[sortedIndex] = list1[left];
                left++;
            }
            else{
                sortedList[sortedIndex] = list2[right];
                right++;
            }
            sortedIndex++;
        }

        while(left < leftLen){
            sortedList[sortedIndex] = list1[left];
            left++;
            sortedIndex++;
        }
        while(right < rightLen){
            sortedList[sortedIndex] = list2[right];
            right++;
            sortedIndex++;
        }
        return sortedList;
}
}
