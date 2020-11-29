//Program for variable no of arguments

class Test { 
void show(String... S1)
{
 for(String x: S1)
 {
     System.out.println(x);
 }
 System.out.println("--------------------");
}
}

public class VariableNoOfArgs {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.show("A");
        t2.show("A","B","C");
    }
    
}
