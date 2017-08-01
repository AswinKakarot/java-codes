import java.io.*;
import java.util.*;
public class GenericSort {
   // generic method printArray
   private static <E> void swap( E[] array, int i, int j){
     if (i != j) {
            E temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
   }
   public static < E > void printArray( E[] inputArray ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }
   public static < E extends Comparable<E> > void sortArray( E[] inputArray ){
      for (int i = 0; i < inputArray.length - 1; i++){
          int smallest = i;
          for (int j = i + 1; j < inputArray.length ; j++){
              if(inputArray[j].compareTo(inputArray[smallest]) <= 0)
              {
                smallest = j;
              }
          }
          swap(inputArray, i, smallest);
      }
      printArray(inputArray);
   }
   public static void main(String args[]) throws IOException {
     System.out.print("Menu\n\t1.[I]nteger\n\t2.[C]haracter\n\t3.[S]tring\nEnter the type of array you want to sort:");
     BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
     char choice = input.readLine().charAt(0);
     System.out.print("Enter the size of array:");
     int length = Integer.parseInt(input.readLine());
     System.out.println("Size:"+length);
     System.out.println("Enter Elements into the array");
     switch(choice){
       case 'I':
       case 'i':
                Integer[] integer_array = new Integer[length];
                for(int i = 0; i < length; i++ ){
                  System.out.print("Element [" + (i+1) + "] ");
                  integer_array[i] = Integer.parseInt(input.readLine());
                }
                System.out.println("Array before Swapping");
                printArray(integer_array);
                System.out.println("Array after Swapping");
                sortArray(integer_array);
                break;
        case 'C':
        case 'c':
                 Character[] char_array = new Character[length];
                 for(int i = 0; i < length; i++ ){
                   System.out.print("Element [" + (i+1) + "] ");
                   char_array[i] = input.readLine().charAt(0);
                 }
                 System.out.println("Array before Swapping");
                 printArray(char_array);
                 System.out.println("Array after Swapping");
                 sortArray(char_array);
                 break;
        case 'S':
        case 's':
                String[] string_array = new String[length];
                for(int i = 0; i < length; i++ ){
                  System.out.print("Element [" + (i+1) +"] ");
                  string_array[i] = input.readLine();
                }
                System.out.println("Array before Swapping");
                printArray(string_array);
                System.out.println("Array after Swapping");
                sortArray(string_array);
                break;
        default:
                System.out.println("Invalid Choice!");
                break;
     }
      // Create arrays of Integer, Double and Character
      // Integer[] intArray = { 1, 2, 3, 4, 5 };
      // Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      // Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
      //
      // System.out.println("Array integerArray contains:");
      // printArray(intArray);   // pass an Integer array
      //
      // System.out.println("\nArray doubleArray contains:");
      // printArray(doubleArray);   // pass a Double array
      //
      // System.out.println("\nArray characterArray contains:");
      // printArray(charArray);   // pass a Character array
   }
}
