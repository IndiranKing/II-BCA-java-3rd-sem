PROGRAM : // 8.Depth First Search
import java.util.*;
class DFS
{
public static void main(String args[])
{
int i,j,k,m,n,top=0,v;
int cost[][] = new int[10][10];
int stk[] = new int[10];
int visited[] = new int[10];
System.out.println("DEPTH FIRST SEARCH");
System.out.println("==================");
Scanner s = new Scanner(System.in);
System.out.println("Enter the no. of vertices");
n=s.nextInt();
System.out.println("Enter the no. of edges");
m=s.nextInt();
System.out.println("Enter the Edges: ");
for(k=1;k<=m;k++)
 {
i=s.nextInt();
j=s.nextInt();
cost[i][j]=1;
 }
System.out.println("Enter the initial vertex: ");
v=s.nextInt();
System.out.println("Order of the visited vertices: ");
System.out.print(v + " ");
visited[v]=1;
k=1;
while(k<n)
{
 for(j=n;j>=1;j--)
if(cost[v][j]!=0&&visited[j]!=1)
{
stk[top]=j;
top++;
}
v=stk[--top];
System.out.print(v + " ");
k++;
visited[v]=1;
 }
}
}
