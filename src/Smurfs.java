
public class Smurfs {
	private String name;

	Smurfs(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + ".";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if (name.equals("Handy") || name.equals("Smurfette")) {
			return name + "'s" + " hair color is white";
		}
		if (name.equals("Papa")) {
			return name + "'s" + " hair color is red";
		}
		return "none";
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if (name.equals("Handy") || name.equals("Papa")) {
			return name + " is a boy";
		}
		if (name.equals("Smurfette")) {
			return name + " is a girl";
		}
		return "None";
	}
}

