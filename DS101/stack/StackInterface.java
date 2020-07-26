package stack;

public interface StackInterface<T>{
     public void  push(T element) throws StackOverflowException;
    //Throws StackoverflowException if stack is full
    //places element on the top of the stack

     public void pop() throws  StackUnderflowException;
     //Throws StackunderflowException if stack is empty
     //removes element on the top of the stack

     public boolean isEmpty();
     //returns true if the stack is empty

     public boolean isFull();
     //returns true if the stack is full

     public T top() throws StackUnderflowException;
     //returns the top element of the stack and not move the index
}
