public class Main {

    public static void main(String[] args) {

        int result = 10 + 20;
        // ' // ' is a single line comment
        // ' = ' is a assignment operator
        System.out.println("The result of 10 + 20 :"+result);
        result *= 10;
        System.out.println("result of ( 10+20 )*10 :"+result);
        result /= 10;
        System.out.println("result of ( 10+20 )/10 :"+result);
        int resultRemainder = result % 10; // this will give us the remainder
        System.out.println("remainder of ( 10+20 )/10 :"+resultRemainder);

    }
}
