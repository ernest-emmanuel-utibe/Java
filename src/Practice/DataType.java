package Practice;

public class DataType {
    public static void main(String[] args) {
        char C ='M';
        char a = 65535;
        byte b1 = -128;
        byte b2 = 127;
        int i1 = - 2147483648;
        int i2 = 2147483647;
        short s1 = -32768;
        short s2 = 32767;
        long l2 = 9223372036854775807L;
        long l1 = -92233720368547L;
        float f1 = 3.40282346638528860e+38f;
        float f2=1.40129846432481707e-45f;
        double d=4.37346473;

        System.out.println("char is: " + C);
        System.out.println("int low range is: " + i1);
        System.out.println("int high range is: " + i2);
        System.out.println("byte is: " + b1);
        System.out.println("short low range: " + s1);
        System.out.println("short high range: " + s2);
        System.out.println("Long high range is: " + l2);
        System.out.println("Long Low range is: " + l1);
        System.out.println("double is: " + d);
    }
}
