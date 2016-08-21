package javaAssignment;

public class VideoGameProductDriver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an object of videoGamePublisher class.
		videoGamePublisher pub1 = new videoGamePublisher("Blizzard Activsion", 2016);
		videoGamePublisher pub2 = new videoGamePublisher("Dice EA", 2016);
		
		// Create object of the VideoGameProduct class.
		VideoGameProduct p1 = new VideoGameProduct();
		p1.setName("World of Warcraft Legion Collector's Edition");
		p1.setPrice(149.00);
		p1.setVGP(pub1);
		
		// Print the details of p1
		System.out.println("First video game title:");
		System.out.println(p1.toString());
		
		// Create p2 object using constructor
		VideoGameProduct p2 = new VideoGameProduct ("Battlefield 1 Collector's Edition", 129.00, pub2);
		
		
		// Print the details of p2
		System.out.println("Second video game title:");
		System.out.println("Name of video game:"+p2.getName());
		System.out.println("Price of video game:"+p2.getPrice());
		System.out.println(p2.getVGP());
	}

}

