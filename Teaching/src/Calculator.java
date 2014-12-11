import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    static int num1=0,num2=0;
    static char operand;

    public static void main(String[] args){
        /*
        Get calculation input
         */
        getInput();

        //int number1 = num1;
        //int number2 = num2;
        /*
        Detect which operand was used.
         */
        double result=0;
        switch (operand){
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                result = add(num1, num2);
                break;
        }
        System.out.println(result);

    }

    /*
     * ADDITION METHOD
     */
    static double add(int x1, int x2){
        double sum = x1 + x2;
        return sum;
    }

    /*
     * SUBTRACTION METHOD
     */
    static double subtract(int x1, int x2){
       double difference = x1 - x2;
        return difference;
    }
    /*
     * MULTIPLICATION METHOD
     */
    static double multiply(int x1, int x2){
        double product = x1 * x2;
        return product;
    }
    /*
     * DIVISION METHOD
     */
    static double divide(int x1, int x2){
        double quotient = (x1 * 1.0) / x2;
        return quotient;
    }

    static void getInput(){
        /*
         * Reads in line input as String variable calculation
         * Ex. calculation = "34 * 4"
         * or "77 / 33"
         */
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter calculation: ");
        String calculation="";
        try{
            calculation = input.readLine();
        } catch (IOException e){
            System.out.println("IO Exception");}

        int posOfSpace=0;
        for(int i = 0; i < calculation.length(); i++){
            if(calculation.charAt(i) == ' '){
                posOfSpace = i;
                break;
            }
        }
        String num1S = calculation.substring(0, posOfSpace);
        operand = calculation.charAt(posOfSpace+1);
        String num2S = calculation.substring(posOfSpace+3, calculation.length());
        num1 = Integer.parseInt(num1S);
        num2 = Integer.parseInt(num2S);

    }
}
