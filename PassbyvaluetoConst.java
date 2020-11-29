//Program to pass by value to Constructor

class Test 
{
void add(int x, int y)
{
    System.out.println(x+y);
}
}
public class PassbyvaluetoConst {
    public static void main(String[] args) {
        int a,b;
        a=100;
        b=200;
        Test t1 = new Test();
        t1.add(a, b);
    }
}
