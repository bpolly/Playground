/**
 * Created by Braden on 12/10/14.
 */
public class ArrayPractice {
    public static void main(String[] args){

        /*
        This is called an ARRAY. It holds multiple values in one variable.
        Values are accessed with an index.
        IE:
        integerArray[0] = 1
        integerArray[1] = 2
        integerArray[4] = 5
         */
        int[] integerArray = {1,2,3,4,5};

        int i = 0;

        /*
        This is a WHILE LOOP. It does something while the condition inside the parentheses is true
        In this case, it checks whether the integer variable i is less than 5. If it is, it prints out the value
        at index i of the integerArray. Then it adds 1 to i. The wHILE LOOP will continue to check this value until
        i equals 5. This prints the array out in ascending order.
         */
        while(i < 5){
            System.out.println(integerArray[i]);
            i = i + 1;
        }

        /*
        Now do the same thing, but print the array out in DESCENDING order
         */




    }
}
