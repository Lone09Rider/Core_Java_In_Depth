package Call_By_Value_And_Reference;

public class Pass_By_Reference {
    
    // making a public member variable
    public int a;
     
    public Pass_By_Reference() {
        a = 10;
    }
     
    public static void main(String[] args) {
 
        Pass_By_Reference eg = new Pass_By_Reference();
         
        // Before calling the add() method
        System.out.println("Before calling method: " +eg.a);
         
        // calling method
        add(eg);
         
        // After calling the add() method
        System.out.println("after calling method: " +eg.a);
         
    }
     
    // add() method starts here that increments 'a' by 1
    public static void add(Pass_By_Reference obj) {
        obj.a++;
    }
     
}
