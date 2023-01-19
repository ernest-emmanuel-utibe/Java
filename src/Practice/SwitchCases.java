package Practice;

public class SwitchCases {
    public static void main(String[] args) {

        int item = 8;
        String product;

        switch (item) {
            case 1: product = "Iphone 27";
            break;
            case 2: product = "Samsung Galaxy S5";
            break;
            case 3: product = "Apple iPhone 11";
            break;
            case 4: product = "Samsung Galaxy S6";
            break;
            case 5: product = "Apple iPhone 12";
            break;
            case 6: product = "Samsung Galaxy S7";
            break;
            case 7: product = "Apple iPhone 13";
            break;
            case 8: product = "Samsung Galaxy S8";
            break;
            default: product = "motoG";
            break;
        }
        System.out.println(product);
    }
}
