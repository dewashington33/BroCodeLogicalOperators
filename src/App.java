
public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Logical operators = used to connect two or more expressions
         * && = (AND) Returns true if both expressions are true
         * || = (OR) Returns true if one of the expressions is true
         * ! = (NOT) Reverse the result, returns false if the result is true
         * 
         */

        int temp = 25;
        if (temp > 30) {
            System.out.println("It is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside");
        } else {
            System.out.println("It is cold outside");
        }

    }
}
