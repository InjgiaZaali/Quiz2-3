package oop.q2;
import java.util.ArrayList;
import java.util.List;

/**
 * This program demonstrates the solution to the puzzle where:
 * 1. A list of integers is given (list1)
 * 2. A list of strings is given (list2)
 * 3. For each integer in list1, we calculate a string from list2 using the formula:
 *    String Index = Integer Value × 2 - 1
 * The program implements the algorithm: For each integer value in list1,
 * multiply by 2, subtract 1, and use the result as an index to retrieve a string from list2.
 *
 * @author Zaali Injgia
 *
 */



public class Quiz2 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(9);
        list1.add(7);
        list1.add(5);
        list1.add(6);
        list1.add(8);
        list1.add(6);
        list1.add(8);
        list1.add(5);
        list1.add(3);
        list1.add(5);
        list1.add(9);
        list1.add(3);


        List<String> list2 = new ArrayList<>();
        list2.add("CzD");
        list2.add("zSz34");
        list2.add("MTF6");
        list2.add("Th14Q");
        list2.add("1nY");
        list2.add("HQC");
        list2.add("NqckV");
        list2.add("YEC1");
        list2.add("WsR");
        list2.add("jgtQ");
        list2.add("P8r");
        list2.add("fd00");
        list2.add("eYR5");
        list2.add("VlITy");
        list2.add("pqi");
        list2.add("FWS");
        list2.add("oE7");
        list2.add("tU1a");

        System.out.println("Initial List1 (integers):");
        System.out.println(list1);

        System.out.println("\nInitial List2 (strings):");
        System.out.println(list2);

        List<String> resultList = applyFormula(list1, list2);

        System.out.println("\nResult after applying the formula (String Index = Integer Value × 2 - 1):");
        for (int i = 0; i < list1.size(); i++) {
            int value = list1.get(i);
            int index = value * 2 - 1;
            String result = resultList.get(i);
            System.out.printf("Position %d: Value %d → Index %d → String \"%s\"%n",
                    i, value, index, result);

        }
    }
    public static List<String> applyFormula(List<Integer> list1, List<String> list2) {
        List<String> result = new ArrayList<>();

        for (Integer value : list1) {
            int index = value * 2 - 1;
            try {
                result.add(list2.get(index));
            } catch (IndexOutOfBoundsException e) {
                result.add("Index " + index + " out of bounds");
            }
        }

        return result;
    }

    public static void printList(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }
    }
}