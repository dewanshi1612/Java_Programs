package Day1;

public class demononstatic {

    public void display(){
        System.out.println("This is Non Static Method ");
    }

    public static void main(String[] args) {
        demononstatic obj = new demononstatic();
        obj.display();
    }
}
