package War;


public class Card {
	
	private Integer value;
	private String name;
	
	//Card constructor
	public Card(int value, String name) {
		if(value >= 2 && value <=14) {
			this.value = value;
		}
		if(name.equals("Hearts")|| name.equals("Spades")||name.equals("Diamonds")||name.equals("Clubs")) {
			this.name = name;
	    }
	}
		
		
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	public void describe() {
	System.out.println(value + " of " + name);
	
	}

}
