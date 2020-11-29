//Program for the polymorphism

class Demo {

    void add(int x, int y) {
        System.out.println(x + y);
        System.out.println("Int Method Called...");
    }

    void add(float x, float y) {
        System.out.println(x + y);
        System.out.println("Float Method Called...");
    }
}

public class polymorphismDemo {

    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.add(100, 200);
        ob.add(1.2f, 3.2f);
    }

}
