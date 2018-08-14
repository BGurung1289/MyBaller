package basketballProject;

public class BasketballCourt extends Address{
	private String postcode;
	private int courtID;

	//have a DB connection here
	//DBC db = new DBC();
	
	public BasketballCourt(String street, String city, String country, String postcode) {
		super(street, city, country);
		this.postcode = postcode;
		//set the courtID as latest plus 1
	}
	
	public String getPostcode(){
		return postcode;
	}
	
	public int getCourtID(){
		return courtID;
	}
	
}
