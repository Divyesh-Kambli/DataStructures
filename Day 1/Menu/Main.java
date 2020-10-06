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
	  System.out.println(s[tos]);
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
		int ch;
		System.out.println("enter size");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println(size);
		initStack(size);
		do {
			System.out.println("1.Push  2.Pop  3.Top Element  4.Print Elements 0.Exit");
			ch=sc.nextInt();
			System.out.println(ch);
			switch (ch) {
			  case 1://push
			    System.out.println("enter data to push");
			    push(sc.nextInt());
			    break;
			  case 2://
				  pop();
			    
			    break;
			  case 3:
			   atTop();
			    break;
			  case 4:
			    printStack();
			    break;
			  case 0:
				  break;
			  default:
				  System.out.println("please enter a valid no");
			}

		}
		while(ch!=0);




	}
	
	
	



}
