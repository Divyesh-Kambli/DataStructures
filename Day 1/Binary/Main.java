import java.util.Scanner;

public class Main {
 static int s[]=new int[100];
static int tos;
static int MaxSize;
private static boolean isFull() {
	// TODO Auto-generated method stub
	if(tos==MaxSize-1)
	{
		return false;
	}
	return true;
}
private static void push(int i) {
	// TODO Auto-generated method stub

	if(isFull())
	{
	tos++;
	s[tos]=i;
	}
	else
		System.out.println("full");

	
}
  
static void initStack(int size)
 {
	 MaxSize=size;
	tos=-1;
 }
	private static boolean isEmpty() {
	// TODO Auto-generated method stub
		if(tos>-1)
		{
			return true;
		}
	return false;
}
  private static void pop() {
		// TODO Auto-generated method stub
	  if(isEmpty())
	  {
	 
	  tos--;
	  }
	  else
	  {
		  System.out.println("empty");
	  }
		
	}
  private static void atTop() {
		// TODO Auto-generated method stub
	  if(tos==-1)
	  {
		  System.out.println("Out of bound");
	  }
	  System.out.println(s[tos]);
		
	}
  private static void printStack() {
		// TODO Auto-generated method stub
	  for(int i=tos;i>-1;i--)
	  {
		  System.out.println(s[i]);
	  }
		
	}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,no;
	
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size");
		size=sc.nextInt();
		initStack(size);
		no=sc.nextInt();
		for(int i=0;i<4;i++)
		{
			
			push(no%2);
			no=no/2;
		}
		printStack();
	
		
		
		
		




	}
	}
	
	
	




