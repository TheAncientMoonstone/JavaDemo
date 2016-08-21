package javaAssignment;


public class VideoGameProduct {
	// Attributes of video game
	private String name;
	private double GameRelease;
	private videoGamePublisher VGP;


	// Create a blank constructor
	public VideoGameProduct() {
		name ="";
		GameRelease = 0;
		VGP = null;
	}

	// Second constructor
	public VideoGameProduct(String n, double p, videoGamePublisher c) {
		name = n;
		GameRelease = p;
		VGP = c;
	}

	// Get and Set methods for name
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	// Get and Set methods for GamePrice.
	public double getPrice() {
		return GameRelease;
	}

	public void setPrice(double p) {
		GameRelease = p;
	}

	// Get and Set methods for videoGamePublisher
	public videoGamePublisher getVGP() {
		return VGP;
	}

	public void setVGP(videoGamePublisher c) {
		VGP = c;
	}

	public String toString() {
		String temp = "Name of video game:" +name+"\n"+
					  "Price of video game:" +GameRelease +"\n" +VGP;
		return temp;
	}
}
