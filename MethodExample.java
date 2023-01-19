package Methods;

public class MethodExample
{
    // creating a method
    public int addNumbers(int x, int y)
    {
        return x + y;
    }

    public static void main(String[] args)
    {
        int i = 10;
        int j = 25;
        MethodExample obj = new MethodExample();
        int result = obj.addNumbers(i, j);
        System.out.println("Sum of x+y = "+result);
    }
}
