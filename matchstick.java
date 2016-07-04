import java.awt.Image;
import java.io.File;
import java.io.IOException;



import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class matchstick {
	private ImageIcon matchIcon;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label15;
	private JLabel label16;
	private JLabel label17;
	private JLabel label18;
	private JLabel label19;
	private JLabel label20;
	
	
	
	

	
	
	public static void main(String Args[]) 
			throws java.io.IOException {
				int c;
				boolean pturn = false;
				for (c = 10; c > 0;) {
					char choice;
					pturn = true;
					for (int i = 1; i <= c; i++)
					{
						System.out.print("|");
					}
					System.out.println();
					if(c >= 3) System.out.print("There are " + c + " matchsticks. Do you want to remove 1, 2, or 3 matchsticks? ");
					else if (c == 2) System.out.print("There are " + c + " matchsticks. Do you want to remove 1 or 2 matchsticks? ");
					else if (c == 1) System.out.print("There is only one matchstick. Type \"1\" to remove it.");
					choice = (char) System.in.read();
					int x = System.in.read();
					int y = System.in.read();
					//System.out.println("this is choice: " + choice);
					//System.out.println("this is x: " + x + ". and this is y: " + y);
					System.out.println("\n");
					switch(choice) {
					case '1': c -= 1;
					break;
					case '2': c -= 2;
					break;
					case '3': c-= 3;
					break;
					default: System.out.println("not a valid choice");
					break;
					}
					if (c <= 0)
						break;
					for (int i = 1; i <= c; i++)
					{
//						imageLabel1.image = "matchstick.png"
						//here i need to just set the label of an image to the corresponding variable i, so basically imageLabel1, imageLabel2, etc
						
						System.out.print("|");
					}
					if(c % 4 == 0) {
						double d = Math.random();
						int com;
						if (d >= 0 && d <= 0.33)
							com = 1;
						else if (d > 0.33 && d <= 0.66)
							com = 2;
						else
							com = 3;
						System.out.println("\n There are now " + c + " matchsticks.\n" +
								"Computer's turn. Computer removes " + com + " matchsticks.\n");
						c -= com;
					}
					else if (c % 4 == 1) {
						System.out.println("\n There are now " + c + " matchsticks.\n" +
								"Computer's turn. Computer removes 1 matchstick.\n");
						c -= 1;
					}
					else if (c % 4 == 2) {
						System.out.println("\n There are now " + c + " matchsticks.\n" +
								"Computer's turn. Computer removes 2 matchsticks.\n");
						c -= 2;
					}
					else if (c % 4 == 3) {
						System.out.println("\n There are now " + c + " matchsticks.\n" +
								"Computer's turn. Computer removes 3 matchsticks.\n");
						c -= 3;
					}
					pturn = false;
				}
				System.out.print("There are no more matchsticks! ");
				if (pturn) {
					System.out.println("You win!!");
				}
				else
					System.out.println("You lose :(");
			}
	
	
	
	public Image getCrossImage() {
		Image im = null;

			File match = new File("match.png");
			
			
			try {
				im = ImageIO.read(match);
				
				int iconWidth = 128;
				matchIcon = new ImageIcon(im.getScaledInstance(iconWidth, iconWidth, Image.SCALE_SMOOTH));
				
			} catch (IOException e) {
				System.out.println("Can't Read File");
				e.printStackTrace();
			}
		
		return im;
	}
}
