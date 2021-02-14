package builderPatternSolution;

public class App {
	
	

	public static void main(String [] args)
	{
		OnlineAccount account=new OnlineAccount.Builder(1L).
				withName("Sagar Patil").
				withAddress("India").
				withBudget(50L).
				build();
		
		
		System.out.println(account.getAddress());

	}
	
}
