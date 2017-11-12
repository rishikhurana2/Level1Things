import javax.swing.JOptionPane;

public class Methods {
	public static void main(String[] args) {
		iRock();
		String singerName = JOptionPane.showInputDialog("What is your favorite singer's name");
		String whatDoYouWantToEmphasize = JOptionPane.showInputDialog("What do you want to emphasize");
		Singer(singerName);
		repeat(whatDoYouWantToEmphasize, 5);
		System.out.println(evenOrNot(2));
	}
	public static void iRock() {
		String name = JOptionPane.showInputDialog("What is your name");
		System.out.println(name + " Rocks");
	}
	public static String Singer(String Singer) {
		if (Singer.equals("Justin Bieber") || Singer.equals("justin bieber")) {
			System.out.println(Singer + " is annoying");
		}
		else {
			System.out.println(Singer + " is ok");
		}
		return Singer;
	}
	public static void repeat(String thing, int number) {
		for (int i = 0; i < number; i++) {
			System.out.println(thing);
			}
	}
	public static boolean evenOrNot(int number) {
		if (number % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
