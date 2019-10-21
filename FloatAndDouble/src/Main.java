public class Main {

    public static void main(String[] args) {
        // FLOAT data type
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value :"+myMinFloatValue);
        System.out.println("Float maximum value :"+myMaxFloatValue);
        // DOUBLE float data type
        // double data type is taken as default data type
        double myMinDoubleFloatValue = Double.MIN_VALUE;
        double myMaxDoubleFloatValue = Double.MAX_VALUE;
        System.out.println(" Double Float minimum value :"+myMinDoubleFloatValue);
        System.out.println(" Double Float maximum value :"+myMaxDoubleFloatValue);

        int myIntValue = 45/2;
        //float myFloatValue = 15.55;  // by default it will take double as a default data type value
        double myDoubleFloatValue = 45d/2;
        // so to convert double to float, we have to do type casting
        float myFloatValue = 45f/2;
        System.out.println("Int number :"+myIntValue);
        System.out.println("Float number :"+myFloatValue);
        System.out.println("Double FLoat number :"+myDoubleFloatValue);

        double poundWeight = 2d;
        double kilogramWeight = (poundWeight*0.45359237);
        System.out.println("kilogram weight:"+kilogramWeight+" kg");


    }
}
