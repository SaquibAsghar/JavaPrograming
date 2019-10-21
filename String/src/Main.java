public class Main {

    public static void main(String[] args) {

        String myString = "This is  my string";
        System.out.println(myString+". This is not my string");
        myString = myString + ". Appending another string here";
        System.out.println("After appending the myString : "+ myString );
        String anotherString = "Another string defined using String";
        String stringNumber = "45";
        int a = 45;
        System.out.println("Adding a string and a number: "+(a+stringNumber));
        // the string and a int cannot be added. the java intelligently converts the int into string and append it with the string


    }
}
