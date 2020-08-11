package stack;

public class LinkedStack<T> implements StackInterface<T> {
   LLNode<T> top;

   LinkedStack(){
       top = null;
   }


    @Override
    public void push(T element) throws StackOverflowException {
        LLNode<T> node = new LLNode(element);
        node.setLink(top);
        top = node;
    }

    @Override
    public void pop() throws StackUnderflowException {
       if(isEmpty()) throw new StackUnderflowException("STACK IS EMPTY");

        LLNode<T> nextNode = top.getNode();
        top = nextNode;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public T top() throws StackUnderflowException {
       if(isEmpty()) {throw new StackUnderflowException("Stack is empty");}
       else { return top.getInfo();}
    }


    @Override
    public String toString(){
       LLNode<T> currNode = top;
        StringBuilder string = new StringBuilder();

       while(currNode != null){
           if(string.length() !=0) string.append(":");
           string.append(currNode);

           currNode = currNode.getNode();
       }
       return string.toString();
    }
}
