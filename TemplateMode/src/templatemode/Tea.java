package templatemode;

public class Tea {
	private void addLemon() {
		System.out.println("add Lemon ");
	}

	private void boilWater() {
		System.out.println("Boiling water ");
	}

	private void brewTea() {
		System.out.println("Brewing Tea  ");
	}

	private void pourInCup() {
		System.out.println("Pouring into cup ");
	}

	public void prepareRecipe() {
		boilWater();
		brewTea();
		pourInCup();
		addLemon();
	}
}
