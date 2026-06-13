public class MyLinearSearch {
    public static void main(String[] args) {
        int[] array = {33, 8, 71, 19, 56, 44, 27};
        int target = 56;

        for(int i =0; i<array.length; i++)
        {
            System.out.println("Checking index " + i + " value " + array[i]);
            if(array[i]==target)
            {
                System.out.println("Found at index " + i);
                System.out.println("Total Steps  = " + (i+1));
                break;
            }
        }
    }
}
