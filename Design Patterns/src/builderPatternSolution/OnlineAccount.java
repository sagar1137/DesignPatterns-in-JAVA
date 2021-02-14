package builderPatternSolution;

public class OnlineAccount {
	
	private Long id;
	private String name;
	private String address;
	private Long budget;
	
	public static class Builder{
		
		private Long id;
		private String name;
		private String address;
		private Long budget;
		
		
		public Builder(Long id) {
			this.id=id;
			
		}
		
		public Builder withName(String name) {
			this.name = name;
			
			return this;
		}
		
		public Builder withAddress(String address) {
			
			this.address=address;
			return this;
			
		}
		public Builder withBudget(Long budget) {
			this.budget=budget;
			return this;
		}
		
		public OnlineAccount build() {
			OnlineAccount onlineAccount=new OnlineAccount();
			onlineAccount.id=this.id;
			onlineAccount.name=this.name;
			onlineAccount.address=this.address;
			onlineAccount.budget=this.budget;
			return onlineAccount;
			
		}
		
		
		
	}
	
	private OnlineAccount() {
		super();
	}
	
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Long getBudget() {
		return budget;
	}



	public void setBudget(Long budget) {
		this.budget = budget;
	}



	@Override
	public  String toString()
	{
		
		
		return id + " " + name+ " "+ address+" "+ budget;
		
		
	}

	
}
