package stack;

public class ArrayListStackDriver {
    public static void main(String[] args){
        ArrayListStack<String> stack = new ArrayListStack<String>();
        stack.push("a");stack.push("b");
        stack.push("c");stack.push("d");
        stack.push("e");
        System.out.println(stack);
        stack.pop();stack.pop();
        stack.pop();stack.pop();
        stack.pop();

    }
}
