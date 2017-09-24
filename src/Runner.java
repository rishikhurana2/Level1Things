
public class Runner {
	public static void main(String[] args) {
		Smurfs HandySmurf = new Smurfs("Handy Smurf");
		Smurfs PapaSmurf = new Smurfs("Papa Smurf");
		Smurfs Smurfette = new Smurfs("Smurfette");
		HandySmurf.eat();
		System.out.println(HandySmurf.getName());
		System.out.println(PapaSmurf.getName());
		System.out.println(PapaSmurf.getHatColor());
		System.out.println(PapaSmurf.isGirlOrBoy());
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
	}
}
