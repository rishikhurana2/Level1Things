
public class MorePan {
	public static void main(String[] args) {
		Pan pan = new Pan("Bob");
		Pan p2 = new Pan("Sam");
		Pan p3 = new Pan("Man");
		pan.steelNoneOrLots = "lots";
		pan.foodInPan = "chicken and rice";
		pan.heatinF = 80;
		p3.heatinF = 10;
		pan.sizeBigOrSmall = "Big";
		p3.sizeBigOrSmall = "Small";
		p2.sizeBigOrSmall = "Small";
		p2.foodInPan = "chicken";
		p2.panHands = 2;
		p3.panHands = 1000000;
		pan.panHands = 1;
		System.out.println(Pan.Counter);
		int Update = Pan.resetCount();
		p2.foodReset();
		p3.foodReset();
		p2.hands();
		p3.hands();
		pan.hands();
		System.out.println(Update);
	}
}
