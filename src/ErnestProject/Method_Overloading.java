package ErnestProject;

public class Method_Overloading {
    public String buyPizza(String where) {
        return "I bought pizza at " + where;
    }
    public String buyPizza() {
        return "I bought pizza at some random place";
    }
    public void buyPizza(String where, int price) {
        System.out.printf("I bought pizza at %s for %d", where, price);
    }





    public static void main(String[] args) {
        Method_Overloading method_overloading = new Method_Overloading();
        method_overloading.buyPizza("Chicken Republic",13_000);
        System.out.println();
    }
}
