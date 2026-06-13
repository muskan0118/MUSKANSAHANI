public class MySelctionSort {
    public static void main(String[] args) {
        int[] array = {52, 18, 37, 9, 64};
        int count = 0;

        System.out.print("Before sorting: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        for(int i = 0; i<array.length; i++)
        {
            System.out.println("\n----Pass "+(i+1)+"----");
            int minimum = i;
            System.out.println("Assumed minimum: " + array[minimum] +" at index "+ i);

            for(int j = i+1; j<array.length; j++)
            {
                if(array[minimum]>array[j])
                {
                    count++;
                    minimum = j;
                    System.out.println("New minimum found: " + array[minimum] + " at index " + j);
                }
            }
            if(minimum != i)
                {
                    System.out.println("Swapped " + array[minimum] + " to " + i);
                    int temp = array[i];
                    array[i] = array[minimum];
                    array[minimum] = temp;
                }
                else
                {
                    System.out.println("No Swap");

                }
            System.out.println("After Pass "+(i+1)+ ": ");
            for (int element : array) {
                System.out.print(element + " ");
            }
        }

        System.out.println("\nTotal Swaps: " + count);
        System.out.print("After sorting: ");
        for (int element : array) {
            System.out.print(element + " ");
        }


    }
}
