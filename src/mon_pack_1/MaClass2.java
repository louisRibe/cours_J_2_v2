package mon_pack_1;

public class MaClass2 {

	static String root = "je suis dispo";
	int internalProperty = 0;

	public static void main(String[] args) {
		System.out.println("Hello world!");

		// String monesp = "je suis esp";
		// System.out.println(root);
		// System.out.println(monesp);
		// //System.out.println(Example.text);
		// Example.printText();
		// //System.out.println(Example.internalProperty);
		System.out.println(this.internalProperty);
		// printText();
		// String[] mesargs={"John", "Paul"};
		// ConditionalHello.main(mesargs);

	}

	private static void printText() {
		System.out.println("depuis fonc " + root);
	}
}
