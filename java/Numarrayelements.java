/*
*   Given an array of integers, return a new array where each element in the new
*   array is the count of smaller elements to the right of that element in the orginal
*   input array
*    ex: [3,4,9,6,1]
*   ans: [1,1,2,1,0]
*
*/
import java.util.Arrays;
public class Numarrayelements {

    public static int[] numberofelements(int[] arr){

        int[] target = new int[arr.length];
        int index =    arr.length-1;

        for(int i=0;i <=index ;i++){
               int comp = arr[i];
               int result = 0;

               for(int j = i+1; j<=index;j++){
                if ( arr[j] < comp) ++result;
               }
               target[i] = result;
               result =0;
        }
        Arrays.toString(target);
        return target;
    }

    public static void main(String[] args){
        Numarrayelements.numberofelements(new int[]{5,4,3,2,1});
    }
}

