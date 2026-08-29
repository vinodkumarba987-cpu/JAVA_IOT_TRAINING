
import java.util.Stack;

public class stack_perform2 {
    public static void main(String[] args) {
        Stack <Integer> stack =  new Stack<>();
        stack.push(2);
        stack.push(3);
        int a=stack.pop();
        int b = stack.pop();
        stack.push(a+b);
        stack.push(4);
        b=stack.pop();
        System.out.println("Result : "+b);
        a= stack.pop();
        System.out.println("Result = "+a);
        System.out.println("Result = "+stack.push(a*b));
        System.out.println("Subtract : "+stack.push(b-a));
        System.out.println("Division : "+stack.push(b/a));
        System.out.println("Result : "+stack.push(a++));
        System.out.println("Result : "+stack.push(b--));
        System.out.println("Result : "+stack.push(89208*b));
        System.out.println(stack.push(823698542*b));
    }
    
}
