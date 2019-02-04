/**
 * This version:
 * @author Ricky Chu and Kiran Khambhla
 * @version February 2019
 */
public class Team0SortCompetition extends SortCompetition {

    @Override
    public int challengeOne(int[] arr) {
        return 0;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        // selection sort?
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        // use insertion sort
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return "We are team zero!";
    }

    public void mergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, n - 1, temp);
    }

    public void mergeSortHelper(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right)/2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    public void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int k = right;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                i++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = left; k <= right; k++) {
            arr[k] = temp[k];
        }
    }

    public static int[] randomIntsArr(int count) {
        int[] randomArr = new int[count];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = (int) (Math.random() * 10001);
        }
        return randomArr;
    }


    public static String[] randomStringArr(int num, int length){
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while(i < length){
                char c= (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    public static void insertionSort(String[] list1){
        for(int i = 1; i < list1.length; i++){
            String temp = list1[i];
            int j =i-1;
            while(j>=0 && list1[j].compareTo(temp) > 0){
                list1[j+1] = list1[j];
                j--;
            }
            list1[j+1] = temp;

        }
    }

    public static void printArr(int[] arr) {
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    public static void printArr(String[] arr){
        String total = "";
        for(int i = 0; i < arr.length; i++){
            total += arr[i] + ", ";
        }
        System.out.println(total);
    }
    
    public static int binarySearch(String[] elements, String target){
        
        int left = 0;
        int right = elements.length-1;
        while(left <= right){
            int middle = (left+right)/2;
            if (target.compareTo(elements[middle]) < 0){
                right = middle - 1;
            }
            else if(target.compareTo(elements[middle]) > 0){
                left = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
    
    public static String insertionSort(int[] a){
        int num = a.length; 
        for (int i = 0; i < n-1; i++) 
        { 
            int min = i; 
            for (int j = i+1; j < n; j++) 
                if (a[j].compareTo(a[min]) < 0) 
                    min = j; 
            
            int temp = a[min]; 
            a[min] = a[i]; 
            a[i] = temp; 
        } 
    }
}
