package pilasColas;

import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Queue;
import java.util.Stack;

public class Pila {
	
	public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Pila: " + stack);

        Queue<Integer> cola = new ArrayDeque<Integer>();
        
        stack.push(42);
        stack.push(43);
        stack.push(44);
          
        System.out.println(stack.pop());
        System.out.println("Pila: " + stack);
        System.out.println(stack.peek());
        
        try {
             stack.pop();
        } catch (EmptyStackException e) {
             System.out.println("Pila vacía");
        }
   }

}
