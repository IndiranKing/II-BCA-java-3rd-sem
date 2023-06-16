PROGRAM :// 7. BREADTH FIRST SEARCH
import java.util.*;
class BFS
{
 public static void main(String args[])
 {
 int i,j,k,m,n,rear=0,front=0,v;
 int cost[][]=new int[10][10];
 int qu[]=new int[10];
 int visited[]=new int[10];
 System.out.println("BREADTH FIRST SEARCH");
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the no. of Vertices : ");
 n=s.nextInt();
 System.out.println("Enter the no. of Edges: ");
 m=s.nextInt();
 System.out.println("Enter the edges : ");
 for (k=1; k<=m; k++)
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
for(j=1;j<=n;j++)
 if(cost[v][j]!=0&&visited[j]!=1)
 {
qu[rear++]=j;
 }
 v=qu[front++];
 System.out.print(v + " ");
 k++;
 visited[v]=1;
 
 }
 }
}
