package Methods;

public class Example extends AbstractMethod {
    void show() {
        System.out.println("This is an abstract method example!");
    }

    public static void main(String[] args) {
        AbstractMethod obj = new Example();
        obj.show();
    }
}
