package javatest1;

public class Food {
	static int count;
	private String flavor = "sweet";

	Food(String s) {
		flavor = s;
	}

	public Food() {
		// TODO Auto-generated constructor stub
	}

	void setFlavor(String s) {
		flavor = s;
	}

	String getFlavor() {
		return flavor;
	}

	static public void main(String[] args) {
		Food pepper = new Food();
		System.out.println(pepper.getFlavor());
	}
}