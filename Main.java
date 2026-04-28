import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //EXAMPLE 1: A Generic print method
        System.out.print("\nEXAMPLE 1: Print a list");  
        Integer[] intList1 = {1,2,3,4,5};
        String[] strList1 = {"Alvin","Theodore","Simon"};
        Functions.print(intList1);
        Functions.print(strList1);

        
        //EXAMPLE 2: Calculate the area of a circle  
        System.out.print("\nEXAMPLE 2: Calculate the area of a circle");   	
        System.out.printf("\narea with radius 5   = %5.2f\n",Functions.circleArea(5));
        System.out.printf("area with radius 5.0 = %5.2f\n", Functions.circleArea(5.0));   


        //EXAMPLE 3: A generic sum function using wildcards
        System.out.print("\nEXAMPLE 3: Calculate the sum of an ArrayList");   
        ArrayList<Integer> intList2 = new ArrayList<>(Arrays.asList(7,3,8,4,9));
        ArrayList<Double> intList3 = new ArrayList<>(Arrays.asList(7.1,3.1,8.1,4.1,9.1));
        ArrayList<Number> intList4 = new ArrayList<>(Arrays.asList(7.1,3.1,8.1,4,9));
        System.out.printf("\nthe sum of list2 (Integer) = %5.2f\n", Functions.sum(intList2));   
        System.out.printf("the sum of list3 (Double)  = %5.2f\n", Functions.sum(intList3));   
        System.out.printf("the sum of list4 (Number)  = %5.2f\n", Functions.sum(intList4));   
        
        //EXAMPLE 4:  Creating a generic SelectionSort
        System.out.print("\nEXAMPLE 4: Using a generic SelectionSort");  
        ArrayList<Character> intList5 = new ArrayList<>(Arrays.asList('z','e','b','r','a'));       
        Functions.SelectionSort(intList2);
        //Functions.<Double> SelectionSort(intList3);
        //Functions.<Character> SelectionSort(intList5);

        //EXAMPLE 5: Creating a generic stack structure
        System.out.println("\nEXAMPLE 5: Creating a generic class (stack)");  
        StackList myStack1 = new StackList();
        myStack1.push("Alvin");
        myStack1.push("Theodore");
        myStack1.push("Simon");
        System.out.println(myStack1);

        //StackList<Double> myStack2 = new StackList<>();
        //myStack2.push(1.5);
        //myStack2.push(2.8);
        //myStack2.push(3.14);
        //System.out.println(myStack2);

        //EXAMPLE 6: Creating a generic pair structure (similar to map)
      
        System.out.println("\nEXAMPLE 6: Creating a generic class (pair with 2 variables)"); 
        List<Pair<Integer, String>> studentList = new ArrayList<>(List.of(
            new Pair<Integer, String>(1, "Bubba"),
            new Pair<Integer, String>(9, "Fred"),
            new Pair<Integer, String>(18, "Wilma"),
            new Pair<Integer, String>(4, "Betty")));

        Collections.sort(studentList);
        for (Pair<Integer, String> p : studentList){
            System.out.println(p.getKey() + " " + p.getValue());
        }


        System.out.println();
        List<Pair<Double, String>> studentList2 = new ArrayList<>(List.of(
            new Pair<Double, String>(1.1, "Bubba"),
            new Pair<Double, String>(9.2, "Fred"),
            new Pair<Double, String>(18.3, "Wilma"),
            new Pair<Double, String>(4.4, "Betty")));

        Collections.sort(studentList2);
        for (Pair<Double, String> p : studentList2){
            System.out.println(p.getKey() + " " + p.getValue());
        }
        
    }
}

