import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainProgram {


    //Constructors
    //Methods
    public static int smallest(int[] arr){
        int ini = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < ini){
                ini = arr[i];
            }
        }

        return ini;
    }

    public static int indexOfSmallest(int[] arr){
        int ini = arr[0], index = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < ini){
                ini = arr[i];
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] arr, int start){
        int ini = arr[start], index = start;

        for (int i = start; i < arr.length; i++){
            if (arr[i] < ini){
                ini = arr[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp;

        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    swap(arr,i,j);
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }

    public static void sortArr(int[] array){
        Arrays.sort(array);
    }

    public static void sortStr(String[] array){
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
}
