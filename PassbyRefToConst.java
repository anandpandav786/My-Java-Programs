//Program to pass by reference

class Test
{
    int i,j;
    Test()
    {
        i=10;
        j=20;
        System.out.print("Constructor without agrs...");
    }
    Test(int x, int y)
    {
        i=x;
        j=y;
        System.out.println("Constructor with agrs...");
    }
    Test add(Test ob)
    {
        Test temp = new Test();
        temp.i = this.i + ob.i;
        temp.j = this.j + ob.j;
        return temp;
    }
void show()
{
    System.out.println(i);
    System.out.println(j);
}
}

public class PassbyRefToConst {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(30,40);
        Test t3;
        t3=t1.add(t2);
        t3.show();
        
    }
}
