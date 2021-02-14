package builderPatternProblem;

public class OnlineAccount {
	
	private int id;
	private String name;
	private String address;
	private Long budget;
	
	public OnlineAccount(int id, String name, String address, Long budget) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.budget = budget;
	}
	
	@Override
	public  String toString()
	{
		
		
		return id + " " + name+ " "+ address+" "+ budget;
		
		
	}

	
}
