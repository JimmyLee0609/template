package templatemode;

public abstract class HotDrink {
	public abstract void prepareRecipe();

	public void boildWater() {
		System.out.println("Boiling water");
	}

	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
