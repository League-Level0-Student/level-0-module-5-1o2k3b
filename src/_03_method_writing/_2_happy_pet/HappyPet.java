package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happynessLevel = 0;
	public static void main(String[] args) {

		
String x = JOptionPane.showInputDialog("what type of pet do you want to get");


		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable

		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
	for(int i = 0; i<7; i++) {
		
	
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "what do you want to do to make your "+x+" happy", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "give food", "pet", "take outside" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
if(happynessLevel==15) {
	JOptionPane.showInputDialog("you are a good pet owner, you win :)(:");
}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
	if(x.equals("dog")){
		if(task==0 ) {
			feedDog();
			System.out.println("0");
		}
	}
	if(x.equals("dog")){
		if(task==1 ) {
			petDog();
			System.out.println("0");
		}
	}
	if(x.equals("dog")){
		if(task==2 ) {
			WalkDog();
			System.out.println("0");
		}
	}
	if(x.equals("guinea pig")){
		if(task==0 ) {
			feedGuineaPig();
			System.out.println("0");
		}
	}
	if(x.equals("guinea pig")){
		if(task==1 ) {
			petGuineaPig();
			System.out.println("0");
		}
	}
	if(x.equals("guinea pig")){
		if(task==2) {
			walkGuineaPig();
			System.out.println("0");
		}
	}
	}
	
	}
public static void feedDog() {
	happynessLevel-=3;
	JOptionPane.showMessageDialog(null, "yum! uh oh, diharrhea, time to get a new brand, again! -3");
}
public static void petDog() {
	happynessLevel+=3;
	JOptionPane.showMessageDialog(null, "ah, that hit the spot, now tummy rub time+3");
}
public static void WalkDog() {
	JOptionPane.showMessageDialog(null, "A nice sunny day, perfect time to forget the pooper scooper, hope the neighbors dont mind, nothing happens.");
}
public static void feedGuineaPig() {
	happynessLevel+=3;
	JOptionPane.showMessageDialog(null, "Squeak squeak, whose our happy little guinea eating her kale better than my child!+3");
}
public static void petGuineaPig() {
	JOptionPane.showMessageDialog(null, "pet, pet, run away!!!!!!, nothing happens");
}
public static void walkGuineaPig() {
	happynessLevel-=3;
	JOptionPane.showMessageDialog(null, "run for the bushes, poop in the roses, run away-3");
}
public static void feedCat() {
	JOptionPane.showMessageDialog(null, "I will not eat that!!!nothing happens");
}
public static void petCat() {
	happynessLevel-=3;
	JOptionPane.showMessageDialog(null, "as you  try and pet, your cat jumps out at you and pites your finger, HARD!!!-3");
}
public static void walkCat() {
	happynessLevel+=3;
	JOptionPane.showMessageDialog(null, "Ahh, the great outdoors, Sunbathe on daddy's lap for the next 3 hours time!+3");
}



	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}