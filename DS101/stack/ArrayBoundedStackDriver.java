package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

public class ArrayBoundedStackDriver {

    public static void main(String[] args) throws Exception {
        ArrayBoundedStack<Integer> cont = new ArrayBoundedStack(5);
        cont.push(0);
        cont.push(1);
        cont.push(2);
        cont.push(3);
        cont.push(4);

        cont.top();cont.top();cont.top();cont.top();
        System.out.println(cont.toString());



    }
}
