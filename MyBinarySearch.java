public class MyBinarySearch {
    public static void main(String[] args) {
        int[] array = {9, 21, 34, 48, 57, 66, 83};
        int target = 66;
        boolean found = false;
        int count = 0;

        int left = 0;
        int right = array.length-1;
        int mid = 0;

        while(left<=right)
        {
            mid = (left+right)/2;
            System.out.println("Left = " + left + " Right = " + right + " Mid = " + mid + " Value = " + array[mid]);
            if(target == array[mid])
            {
                found = true;
                count++;
                break;
            }
            else if(target> array[mid])
            {
                left = mid +1;
            }
            else
            {
                right = mid -1;
            }
            count ++;
        }

        if(found)
        {
            System.out.println("Found at index " + mid);
            System.out.println("Total steps = "+ count );
        }
        else
        {
            System.out.println("Not found");
        }

    }
}
