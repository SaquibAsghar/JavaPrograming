public class Main {

    public static void main(String[] args) {
	    // INT data type
	    int myMinInteger = Integer.MIN_VALUE;
	    int myMaxInteger = Integer.MAX_VALUE;
        System.out.println("Minimum number :"+ myMinInteger );
        System.out.println("Maximum number :"+ myMaxInteger );
        System.out.println("Busted Integer maximum value (OverFlow)"+ (myMaxInteger+1));
        System.out.println("Busted Integer minimum value (UnderFlow)"+ (myMinInteger-1));
        // BYTE data Type
        // having range from -128 to 127
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum number :"+ myMinByteValue );
        System.out.println("Byte Maximum number :"+ myMaxByteValue );
        System.out.println("Busted Byte maximum value (OverFlow)"+ (myMaxByteValue+1));
        System.out.println("Busted Byte minimum value (UnderFlow)"+ (myMinByteValue-1));
        // SHORT data type
        // having range from -32768 to 32767
        int myMinShort = Short.MIN_VALUE;
        int myMaxShort = Short.MAX_VALUE;
        System.out.println("Short Minimum number :"+ myMinShort );
        System.out.println("Short Maximum number :"+ myMaxShort );
        System.out.println("Busted Short maximum value (OverFlow)"+ (myMaxShort+1));
        System.out.println("Busted Short minimum value (UnderFlow)"+ (myMinShort-1));
        // LONG data type
        // having range from -9223372036854775808 to 9223372036854775807
        long myLongValue = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long Minimum number :"+ myMinLong );
        System.out.println("Long Maximum number :"+ myMaxLong );
        System.out.println("Busted Long maximum value (OverFlow)"+ (myMaxLong+1));
        System.out.println("Busted Long minimum value (UnderFlow)"+ (myMinLong-1));

    }
}
