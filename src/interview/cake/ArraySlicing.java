package interview.cake;

import java.util.Arrays;

public class ArraySlicing {

    public static void main(String[] args) {
        int[] anArray = {1,2,3,4,5};


        int[] tailOfArray = Arrays.copyOfRange(anArray,1,anArray.length);
        for(int i = 0; i < tailOfArray.length; i++){
            System.out.println(tailOfArray[i]);
        }
    }
}
