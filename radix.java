public class radix {
    public static void main(String[] args) {
        int[] arr = {120, 45, 9, 632, 78, 211};
        System.out.println("Radix sort");
        radixSort(arr);
        System.out.println("sorted array");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int element : arr)
        {
            System.out.print(element + " ");
        }
    }

    static void radixSort(int[]arr){
        int max = arr[0];
        for(int num : arr){
            if(num>max)max= num;
        }

        for(int palce = 1; max/palce>0; palce*=10)
        {
            countingSortByDigit(arr,palce);
        }
    }

    static void countingSortByDigit(int[] arr, int palce){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            int digit = (arr[i]/palce)%10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i-1];
        }

        for (int i = n-1; i >=0; i--) {
            int digit = (arr[i]/palce) % 10;
            output[count[digit]-1] = arr[i];
            count[digit]--;
        }
        for (int i =0;i<n;i++){
            arr[i] = output[i];
        }

    }
}
