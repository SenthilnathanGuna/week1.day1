package week1.day1;

public class Assignment1
{

	public void fibonacci()
	{
		 int a=1,b=0,c=0;
		 int i;
		 
		 System.out.println("First 10 Fibonacci numbers are : ");
		
		for(i=0;i<=10;i++)
		 {
			
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
		 }
		  
	}
	
	public void listOddNum()
	{
		 int i;
		 
		System.out.println("\n"+"Odd numbers between 1->10 are : ");
		
		for(i=0;i<=10;i++)
		 {
			
			if(i%2 == 1)
			{
			System.out.println(i);
			}
		 }						 			 

	}
	
	public void CalFactorial(int j)
	{
		 int i,fact=1;
		 
		for(i=1;i<=j;i++)
		 {
			fact = fact*i;
		 }
		 
		System.out.println("\n"+"Factorial is : "+fact);
		
		}

	public static void main(String[] args) 
	{
		
		Assignment1 obj1 = new Assignment1();
			 
				//Fibonacci series 0,1,1,2,3,5,8,13,21,34,55,89
		
				obj1.fibonacci();
		
				//To list odd numbers in 1->10
		 
				obj1.listOddNum();
				
				//To find factorial
				 
				obj1.CalFactorial(12);

	}

}
