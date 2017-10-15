
public class Pan {
	String steelNoneOrLots;
	String foodInPan;
	int heatinF;
	String sizeBigOrSmall;
	static int Counter = 0;
	String PanName;
	int panHands;
	public Pan(String name) {
		this.PanName = name;
		Counter++;
	}
	public static int resetCount() {
		Counter = 0;
		return Counter;
	}
	public void hands() {
		System.out.println("There are " + panHands + " hand(s) on " + PanName);
	}
	public void foodReset() {
		System.out.println("The food of " + PanName + " has been released");
	}
}	
