package builderPatternProblem;

public class App {
	
	

	public static void main(String [] args)
	{
		OnlineAccount account=new OnlineAccount(1, "Sagar Patil", "India", 50L);
		OnlineAccount account2 =new OnlineAccount(2, "Sachin Patil", "India", 100L);
		
		
		
		System.out.println(account2.toString());

	}
	
}
