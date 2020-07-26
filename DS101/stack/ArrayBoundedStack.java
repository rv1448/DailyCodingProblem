/*
 * Stack Implementation using T[]
 * @Instance variables: T[] container
 * @Instance variable: int top -> pointer to the end of the stack, Used to pop elements of the stack
 * @Methods
 *      size() return container.length
 *      isEmpty()
 *      isFull()
 *      push()
 *      pop()
 */


package stack;



import java.util.Arrays;

public class ArrayBoundedStack<T> implements StackInterface<T> {
   public T[] container;
   private int top;


    public int size(){
        return container.length;
    }

    public ArrayBoundedStack(int size) {
       container = (T[]) new Object[size];
       top = 0;
   }

   public   ArrayBoundedStack() {
       int DECAP = 100;
       new ArrayBoundedStack(DECAP);
   }

    public  void push(T element)   {
        if(!isFull())  { container[top++] = element; }
        else { throw new StackOverflowException("STACK is FULL"); };

    }
    @Override
    public void pop() {
        if(!isEmpty()) {
            T element = container[--top];
            container[top] = null;
        }
        else {
            throw new StackUnderflowException("STACK Is EMPTY");
        }
    }


    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull(){
        return top == size();
    }

    public T top() throws StackUnderflowException {
        if(!isEmpty()){
            return container[top -1];
        }
        else {
            throw new StackUnderflowException("STACK is Empty");
        }
     }

     @Override
     public String toString(){
        return Arrays.toString(container);
     }
}
