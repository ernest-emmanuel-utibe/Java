package ErnestProjects;

public class MethodOverloading {

    public int addNumbers(int b, int m) {
        return b + m;
    }

    public int addNumbers(int s, double q) {
        return (int) (s + q);
    }

    public double addNumbers(double a, double s) {
        return a + s;
    }

    public double addNumbers(double w, int p) {
        return w + p;
    }


    public static void main(String[] args) {
        MethodOverloading overload = new MethodOverloading();
        overload.addNumbers(2, 5);
        System.out.printf("Sum is %d\n", overload.addNumbers(59, 84));
        System.out.printf("Addition is %d\n", overload.addNumbers(125, 5));
        System.out.printf("Add number %d\n", overload.addNumbers(124, 678));
        System.out.printf("Sum all numbers to %d\n", overload.addNumbers(23, 3_456));
    }

    public void setName(int money, String wordOfMouth) {

    }

    public void setName(int money) {

    }

    public void setName() {

    }

}
