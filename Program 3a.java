//PROGRAM 3A: INFIX TO POSTFIX CONVERSION
import java.io.*; 
class Stack1 
{ 
char a[]=new char[100]; 
int top=-1; 
void push(char c) 
{ 
try 
{ 
a[++top]= c; 
} 
catch(StringIndexOutOfBoundsException e) 
{ 
System.out.println("Stack full, no room to push, size=100"); 
System.exit(0); 
} 
} 
char pop() 
{ 
return a[top--]; 
} 
boolean isEmpty() 
{ 
return (top==-1)?true:false; 
} 
char peek() 
{ 
return a[top]; 
} 
} 
class InfixToPostfix
{ 
 static Stack1 operators = new Stack1(); 
 public static void main(String argv[]) throws IOException 
 { 
 String infix; 
 BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
 System.out.print("\nEnter the infix expression you want to convert: "); 
 infix = br.readLine(); 
 System.out.println("Postfix expression for the given infix expression is:" + toPostfix(infix)); 
} 
private static String toPostfix(String infix) 
{ 
 char symbol; 
 String postfix = ""; 
 for(int i=0;i<infix.length();++i) 
 { 
 symbol = infix.charAt(i); 
 //if it's an operand, add it to the string 
 if (Character.isLetter(symbol)) 
 postfix = postfix + symbol; 
 else if (symbol=='(') 
 //push ( 
 { 
operators.push(symbol); 
 } 
 else if (symbol==')') 
//push everything back to ( 
{ 
 while (operators.peek() != '(') 
 { 
postfix = postfix + operators.pop(); 
 }
 operators.pop(); //remove '(' 
} 
else 
//print operators occurring before it that have greater precedence 
{ 
while (!operators.isEmpty() && !(operators.peek()=='(') && prec(symbol) <= 
prec(operators.peek())) 
 postfix = postfix + operators.pop(); 
operators.push(symbol); 
} 
 } //for 
 while (!operators.isEmpty()) 
postfix = postfix + operators.pop(); 
 return postfix; 
} 
static int prec(char x) 
{ 
if (x == '+' || x == '-') 
return 1; 
if (x == '*' || x == '/' || x == '%') 
return 2; 
return 0; 
} 
}