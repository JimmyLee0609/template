package templatemode;

public class Coffee {
	private void addSugarMilk() {
		System.out.println("add Sugar and Milk ");
	}

	private void boilWater() {
		System.out.println("Boiling water ");
	}

	private void brewCoffee() {
		System.out.println("Brewing Coffee  ");
	}

	private void pourInCup() {
		System.out.println("Pouring into cup ");
	}

	public void prepareRecipe() {
		boilWater();
		brewCoffee();
		pourInCup();
		addSugarMilk();
	}
}
