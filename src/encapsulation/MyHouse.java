package encapsulation;

public class MyHouse {
	
	public static void main(String[] args) {
		FriendHouse f = new FriendHouse();
		
		
		int amount = f.getAmount();
		
		System.out.println(amount);
		
		//f.amount = 1000;
		
		f.setAmount(20000);
		
		System.out.println(f.getAmount());
	
	}

}
