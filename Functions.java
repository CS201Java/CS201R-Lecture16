import java.util.ArrayList;

public class Functions{
    /*
    //EXAMPLE 0: prints an integer array
    public static void print(Integer[] list) {
        System.out.print("EXAMPLE 0: Printing an Integer List (non-generic):  ");
        for (int i = 0; i < list.length; i ++)
            System.out.print(list[i] + " ");
        System.out.println();    
    }

    //EXAMPLE 0: prints an integer array
    public static void print(String[] list) {
        System.out.print("EXAMPLE 0: Printing an String List (non-generic):   ");
        for (int i = 0; i < list.length; i ++)
            System.out.print(list[i] + " ");
        System.out.println();    
    }
    */
    //EXAMPLE 1: prints an array
    public static <E> void print(E[] list) {
        System.out.print("EXAMPLE 1: Printing a List (generic):               ");
        for (int i = 0; i < list.length; i ++)
            System.out.print(list[i] + " ");
        System.out.println();    
    }


    //EXAMPLE 2: returns the area of a circle
    public static <E extends Number> double circleArea(E radius) {
        double r = radius.doubleValue();
        return Math.PI*r*r;
    }
   
    /*
    //returns the area of a circle
    public static double circleArea(double r) {
        return Math.PI*r*r;
    }
    */

    //EXAMPLE 3: returns the sum of the values of a numeric array
    public static double sum(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number i : list) 
            sum += i.doubleValue(); 
        return sum;
    }


    //EXAMPLE 4: Selection Sort    
    public static <E extends Comparable<E>> void SelectionSort(ArrayList<E> list) {
        int i;
        int j;
        int indexSmallest;
        E temp;      // Temporary variable for swap

        System.out.println("\nThe original list is: " + list);
        
        for (i = 0; i < list.size(); ++i) {

            // Find index of smallest remaining element
            indexSmallest = i;
            for (j = i + 1; j < list.size(); ++j) {

                if (list.get(j).compareTo(list.get(indexSmallest)) < 0) {
                    indexSmallest = j;
                }
            }

            // Swap list[i] and list[indexSmallest]
            temp = list.get(i);
            list.set(i, list.get(indexSmallest));
            list.set(indexSmallest, temp);

        }
        System.out.println("The list sorted is:   " + list);
    }

}