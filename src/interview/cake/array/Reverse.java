package interview.cake.array;

import java.util.Arrays;

public class Reverse {

    public static void reverse(char[] arrayOfChars) {
        for(int leftIndex = 0, rightIndex = arrayOfChars.length - 1; leftIndex < rightIndex; leftIndex++, rightIndex--){
            char temp = arrayOfChars[leftIndex];
            arrayOfChars[leftIndex] = arrayOfChars[rightIndex];
            arrayOfChars[rightIndex] = temp;
        }
    }

    public static void main(String[] args) {
        char[] arrayOfChars = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("Original array: " + Arrays.toString(arrayOfChars));
        reverse(arrayOfChars);
        System.out.println("Reversed array: " + Arrays.toString(arrayOfChars));
    }
}
