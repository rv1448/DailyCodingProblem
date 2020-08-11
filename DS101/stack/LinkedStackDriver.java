package stack;

public class LinkedStackDriver {

    public static void main(String[] args){
        StackInterface<Integer> test = new LinkedStack<Integer>();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        System.out.println(test);
        test.pop();test.pop();
        System.out.println(test);

        StackInterface<Integer> test1 = new LinkedStack<Integer>();
         try { test1.pop();  } catch (StackUnderflowException e) {System.out.println("Empty"); }



    }
}
