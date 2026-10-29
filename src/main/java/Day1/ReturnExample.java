package Day1;

public class ReturnExample {
    public int Square(int number)
    {
        int squarenumber = number * number;
        return squarenumber;
    }

    public static void main(String[] args) {
        ReturnExample obj1 = new ReturnExample();
        int result = obj1.Square(4);
        System.out.println(("Result is:" +result));

        Waits.WaitForSeconds(10);

        Waits obj = new Waits();
        obj.enterUsernamePassword("Dewanshi","1234");
    }
}
