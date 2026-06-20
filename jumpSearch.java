public class jumpSearch {
     public static int jumpSearch(int arr[],int key){
        int n = arr.length;
        int jump = (int) Math.sqrt(n);

        int prev = 0;

        while (prev< n && arr[Math.min(jump,n)-1]<key){
            prev = jump;
            jump += (int) Math.sqrt(n);

            if (prev>=n)
                return -1;
        }

        while (prev< Math.min(jump,n)){
            if (arr[prev]==key)
                return prev;
            prev ++;
        }
        return -1;
    }


    public static void main(String[] args) {
       int arr[] = {2,6,10,14,18,22,26,30,34,38,42,46};
       int key = 34;

       int result = jumpSearch(arr,key);
        if (result != -1){
            System.out.println("Element Found At " + result);
        }
        else {
            System.out.println("element not found");
        }

    }

}
