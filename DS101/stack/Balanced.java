package stack;

import java.util.Arrays;
import java.util.HashSet;

public class Balanced {

    String openSet;
    String closeSet;
    StackInterface<Integer> stack;



    public Balanced(String openSet, String closeSet){
        this.openSet  = openSet;
        this.closeSet = closeSet;

    }


    public int testV2(String expression){
        // Initialize variables
        int startindex = 0;
        int endindex = expression.length() -1;
        char currentchar;
        int opensetindex;
        int closesetindex;
        boolean isMatch = true;
        stack =  new ArrayBoundedStack<Integer>(expression.length());

        while(startindex <= endindex && isMatch){
            currentchar = expression.charAt(startindex);
            opensetindex = openSet.indexOf(currentchar);
            if(opensetindex != -1){
                stack.push(opensetindex);
            }
            else {
                closesetindex  = closeSet.indexOf(currentchar);
                if(closesetindex != -1){
                   int pop = stack.top();
                   if(closesetindex != pop) isMatch=false;
                   stack.pop();
                }
            }
            startindex++;
            System.out.println(stack);
        }
        // Iterate over the String every character

        if(stack.isEmpty()) return 0;
        else if(!stack.isEmpty()) return 1;
        else return 2;
    }

    public int test(String expression){
        /* Iterate over Characters
         *      for every character
         *          Check if the character in openSet
         *              Stack the index
         *          Else
         *              if the character in closeSet
         *                  Match it top of the stack
         *                      if Match Set isMatch = true
         *                          else Set isMatch = false
         *
         * if stack is Empty and isMatch == true
         *      return "MATCH"
         * else if stack is Not Empty and isMatch == false
         *      return missing termination
         * else return "INVALID Expression"
         */
         int expLength = expression.length();
         int startindex = 0;
         int endindex = expLength-1;
         boolean isMatch = true;
         int top = -1;
        stack =  new ArrayBoundedStack<Integer>((expLength/2)+2);

         while(startindex <= endindex && isMatch){
             char currChar = expression.charAt(startindex);

             if(openSet.indexOf(currChar) != -1){
                 stack.push(openSet.indexOf(currChar));

             }
             else if(closeSet.indexOf(currChar) != -1){
                 try {
                     top = stack.top();
                 } catch (StackUnderflowException e){ System.out.println("TEST");}

                    if (top  != closeSet.indexOf(currChar))
                    { isMatch=false;
                        try {
                            stack.pop();
                        } catch (StackUnderflowException e){isMatch=false;}
                    }

             }
             startindex++;
             System.out.println("*************************************");
             System.out.println(stack);
             System.out.printf("Is there a match yet %b",isMatch);
             System.out.printf("Is the stack empty %b",stack.isEmpty());
             System.out.println("*************************************");

         }

        if(stack.isEmpty() && isMatch ==true) return 0;
        else if(!stack.isEmpty()) return 1;
        else return 2;

    }
    public static void main(String[] args){
        Balanced bal = new Balanced("({[",")}]");
        System.out.println(bal.testV2("[{[]]]"));
    }



}
