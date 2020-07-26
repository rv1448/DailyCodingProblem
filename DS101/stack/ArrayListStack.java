package stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStack<T> implements StackInterface<T> {
    private  List<T> container;
    private int top;
    public ArrayListStack(){
        container = new ArrayList<T>();
    }


    public void push(T element){
        container.add(top++,element);
    }
    public void pop(){
        if(isEmpty()) {
            T element = container.get(--top);
            container.add(top, null);
        } else {
            throw new StackUnderflowException("STACK IS EMPTY");
        }
    }
    public T top(){
        if(!isEmpty()) return  container.get(top -1);
        else throw new StackUnderflowException("STACK IS EMPTY");
    }

    public boolean isFull(){
        return false;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public String toString(){
       return  container.toString();
    }


}
