package javaAssignment;

public class videoGamePublisher {
	
	// Create the attributes
	private String videoGameName;
	private int videoGameYear;
		
		
	// Create a blank constructor
	public videoGamePublisher() {
		videoGameName = "";
		videoGameYear = 0;
	}
		
	// Create a second constructor
	public videoGamePublisher(String n, int p) {
		videoGameName = n;
		videoGameYear = p;
	}
		
	// Create the set and get methods for NAME
	public String getName() {
		return videoGameName;
	}
		
	public void setName(String n) {
		videoGameName = n;
	}
		
	// Create the set and get methods for VideoGameYear
	public void setVideoGameYear(int p) {
		videoGameYear = p;
	}
		
	// Methods to print the details
	public String toString() {
		String temp = "Name of video game: "+ videoGameName + "\n" + "Year of release: " + videoGameYear;
				return temp;
	}
		
}

