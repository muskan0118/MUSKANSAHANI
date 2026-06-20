public class MyInterPolationSearch {
     public static void main(String[] args) {
        int[] array = {10,18,26,34,42,50,58,66,74,82};
        int target = 18;

        int low = 0;
        int high = array.length - 1;
        boolean found = true;

        while (low <= high){
            int pos = low + ((target - array[low]) *  (high - low)) / (array[high] - array[low]);
            System.out.println("Checking index " + pos + " = " + array[pos]);

            if (array[pos]==target){
                System.out.println("Found at index " + pos);
                found = true;
                break;
            }else if (array[pos]<target){
                low = pos + 1;
            }else {
                high = pos - 1;
            }

        }
        if (!found){
            System.out.println("NOT FOUND");
        }

    }

}
