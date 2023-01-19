package Methods;

public class Multiplication {
    public static void main(String[] args)
    {
        Multiplication obj = new Multiplication();
        System.out.println("The product is "+obj.mul(9,13));
    }
    int m;
    public int mul(int x, int y){
        m = x * y;
        return m;
    }
}

