import java.util.*;

class PostfixExpression {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    // TODO: Implement this method
    static int postfixExpression(String exp) {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);

            if(Character.isDigit(c))
                stack.push(c - '0');

            else{
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c){
                    case '+':
                        stack.push(val1+val2);
                        break;
                    case '-':
                        stack.push(val1-val2);
                        break;
                    case '/':
                        stack.push(val1/val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;           
                }
            }    
        }
        return stack.pop();
    }
}
