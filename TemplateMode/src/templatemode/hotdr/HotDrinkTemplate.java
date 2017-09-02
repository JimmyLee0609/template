package templatemode.hotdr;

public abstract class HotDrinkTemplate {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (wantCondimentsHook()) {
			addCondiments();
		} else {
			System.out.println("No Condiments");
		}
	}

	public abstract void addCondiments();

	private void pourInCup() {
		System.out.println("Pouring into cup");
	}

	public abstract void brew();

	public final void boilWater() {
		System.out.println("Boiling water");
	}

	public boolean wantCondimentsHook() {
		return true;
	}

}
