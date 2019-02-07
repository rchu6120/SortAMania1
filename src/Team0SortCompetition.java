/**
 * This version:
 * @author Ricky Chu and Kiran Khambhla
 * @version February 2019
 */
public class Team0SortCompetition extends SortCompetition {

    @Override
    public int challengeOne(int[] arr) {
        mergeSort(arr);
        return median(arr);
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        selectionSort(arr);
        return binarySearch(arr, query);
    }

    @Override
    public int challengeThree(int[] arr) {
        insertionSort(arr);
        return median(arr);
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

    //Challenge One Code
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, n - 1, temp);
    }

    public static void mergeSortHelper(int[] arr, int from, int to, int[] temp) {
        if (from < to) {
            int mid = (from + to) / 2;
            mergeSortHelper(arr, from, mid, temp);
            mergeSortHelper(arr, mid + 1, to, temp);
            merge(arr, from, mid, to, temp);
        }
    }

    public static void merge(int[] arr, int from, int mid, int to, int[] temp) {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= to) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++) {
            arr[k] = temp[k];
        }
    }

    //Challenge Two Code
    public static void selectionSort(String[] a){
        int num = a.length;
        for (int i = 0; i < num - 1; i++) {
            int min = i;
            for (int j = i+1; j < num; j++)
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            String temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public static int binarySearch(String[] elements, String target){
        int left = 0;
        int right = elements.length-1;
        while (left <= right){
            int middle = (left+right)/2;
            if (target.compareTo(elements[middle]) < 0){
                right = middle - 1;
            }
            else if (target.compareTo(elements[middle]) > 0){
                left = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

    //Challenge Three Code
    public static void insertionSort(int[] a) {
        int num = a.length;
        for (int i=1; i < num; ++i) {
            int max = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > max) {
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = max;
        }
    }

    //Challenge Four Code

    //Challenge Five Code
    public static int partition (thejuice[] a, int min, int max)
    {
        thejuice pivot = a[max];
        int i = (min - 1);

        for (int j = min; j <= max- 1; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (a[j].compareTo(pivot) <= 0)
            {
                i++;    // increment index of smaller element
                thejuice temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        thejuice t2 = a[i + 1];
        a[max] = a[i+1];
        a[i+1] = t2;

        return (i + 1);
    }

    public static void quickSort(thejuice a[], int low, int high)
    {
        if (low < high)
        {
            int p = partition(a, low, high);

            quickSort(a, low, p - 1);
            quickSort(a, p + 1, high);
        }
    }
    //Helper Methods
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
        arr[0] = "asdf";
        return arr;
    }

    public static int[] mostlySortedBigArray(int num, int[] arr) {
        arr[0] = (int)(Math.random () * 10) + 1;
        for (int a = 1; a < arr.length; a++) {
            arr[a] = arr[a-1] + (int)(Math.random() * 12) - 2;
        }
        return arr;
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
    
    public static void printArr(thejuice[] arr){
        String total = "";
        for(int i = 0; i < arr.length; i++){
            total += "j"+i+": "+arr[i].howmuchjuice + ", ";
        }
        System.out.println(total);
    }

    public int median(int[] arr) {
        int middle = arr.length / 2;
        if (arr.length % 2 == 1) {
            return arr[middle];
        }
        else {
            return (arr[middle] + arr[middle + 1]) / 2;
        }
    }
    public static thejuice[] randomJuiceArr(int num){
        thejuice[] thejuices = new thejuice[num];
        for (int i = 0; i < num; i++){
            thejuices[i] = new thejuice();
        }
        return thejuices;
    }
}

