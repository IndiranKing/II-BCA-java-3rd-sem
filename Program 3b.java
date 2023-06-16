PROGRAM 3B:// Postfix Expression Evaluation
import java.util.*;
class PFEval
{
 static boolean isOperator(char ch)
 {
 if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
 return true;
 return false;
 }
static void evaluatePostfix(String exp)
 {
 Stack<Integer> pf = new Stack<Integer>(); // Create postfix stack
int n = exp.length();
for(int i=0;i<n;i++)
 {
 if(isOperator(exp.charAt(i)))
 {
 // pop top 2 operands.
int op1 = pf.pop();
int op2 = pf.pop();
 // evaluate in reverse order i.e. op2 operator op1.
switch(exp.charAt(i))
 {
case '+': pf.push(op2 + op1);
 break;
case '-': pf.push(op2 - op1);
 break;
case '*': pf.push(op2 * op1);
 break;
case '/': pf.push(op2 / op1);
 break;
 }
 }
 // Current Char is Operand simple push into stack
 else
 {
 // convert to integer
int operand= Character.getNumericValue(exp.charAt(i));
pf.push(operand);
 }
 }
 // Stack at End will contain result.
System.out.println(pf.pop());
 }//evaluatePostfix
public static void main(String args[])
 {
 String exp = "745*+";
 System.out.print("The PostFix Evaluation for the Given Expression "+exp+" is: ");
 evaluatePostfix(exp);
 }
}//PFEval
