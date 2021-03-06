/*
		Name: Gazi Sakib
		SBU ID - 109849940
		Course No. - CSE 114
		Assignment Name - : Sugary Goodness (Problem 1)(Homework 7) 

 */
public class DessertCafe {

	public static void main(String[] args) {

		Dessert[] desserts = new Dessert[8];

		Cake cake1 = new Cake("Cake 1", 3);
		Cake cake2 = new Cake("Cake 2", 2);
		desserts[0] = cake1;
		desserts[1] = cake2;

		CookiePack cookiePack1 = new CookiePack("CookiePack1", 5, 2);
		CookiePack cookiePack2 = new CookiePack("CookiePack2", 10, 4);
		desserts[2] = cookiePack1;
		desserts[3] = cookiePack2;

		IceCream iceCream1 = new IceCream(5);
		IceCream iceCream2 = new IceCream(10);
		desserts[4] = iceCream1;
		desserts[5] = iceCream2;

		Sundae sundae1 = new Sundae(4, 1);
		Sundae sundae2 = new Sundae(5, 5);
		desserts[6] = sundae1;
		desserts[7] = sundae2;

		for (int i = 0; i < desserts.length; i++) {

			System.out.println(desserts[i].getName() + ": $"
					+ desserts[i].getCost());
			// System.out.println(desserts[i].toString());

		}

		// System.out.println(desserts[5].equals(desserts[7]));

	}

}

abstract class Dessert {
	private String name;
	private int cost;

	public Dessert(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return this.name;

	}

	public int getCost() {

		return this.cost;

	}

}

class Cake extends Dessert {

	private int layer;

	public Cake(String name, int layer) {
		super("Cake " + name, 15);
		this.layer = layer;

	}

	public String getName() {
		return super.getName();
	}

	public int getCost() {
		return (super.getCost() + 2 * this.layer);
	}

	public String toString() {

		return super.getName() + " is " + " $ " + this.getCost();
	}

	public boolean equals(Object object) {

		if (object instanceof Cake) {
			return ((Cake) object).getCost() == this.getCost()
					&& ((Cake) object).getName() == this.getName();

		} else {

			return false;
		}

	}

}

class CookiePack extends Dessert {
	private int noCookies;

	public CookiePack(String name, int costPer, int noCookies) {
		super("CookiePack " + name, costPer);
		this.noCookies = noCookies;

	}

	public String getName() {

		return super.getName();
	}

	public int getCost() {

		return (super.getCost() * this.noCookies);
	}

	public String toString() {

		return super.getName() + " is " + " $ " + this.getCost();
	}

	public boolean equals(Object object) {

		if (object instanceof CookiePack) {
			return ((CookiePack) object).getCost() == this.getCost()
					&& ((CookiePack) object).getName() == this.getName();

		} else {

			return false;
		}

	}
}

class IceCream extends Dessert {

	public IceCream(int cost) {
		super("Ice-Cream", cost);
	}

	public IceCream(String name, int cost) {
		super("Ice-Cream " + name, cost);
	}

	public String getName() {

		return super.getName();

	}

	public int getCost() {

		return super.getCost();
	}

	public String toString() {

		return super.getName() + " is " + " $ " + this.getCost();
	}

	public boolean equals(Object object) {

		if (object instanceof IceCream) {
			return ((IceCream) object).getCost() == this.getCost()
					&& ((IceCream) object).getName() == this.getName();

		} else {

			return false;
		}

	}

}

class Sundae extends IceCream {

	private int topping;

	public Sundae(int cost, int topping) {
		super("Sundae", cost);
		this.topping = topping;
	}

	public Sundae(String name, int cost, int topping) {
		super("Sundae " + name, cost);
		this.topping = topping;
	}

	public String getName() {

		return super.getName();

	}

	public int getCost() {

		return super.getCost() + this.topping;
	}

	public String toString() {

		return this.getName() + " is " + " $ " + this.getCost();
	}

	public boolean equals(Object object) {

		if (object instanceof Sundae) {
			return ((Sundae) object).getCost() == this.getCost()
					&& ((Sundae) object).getName() == this.getName();

		} else {

			return false;
		}

	}

}
