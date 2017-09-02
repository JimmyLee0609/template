package templatemode.hotdr;

import java.util.Scanner;

public class TeaWithHook extends HotDrinkTemplate {

	@Override
	public void brew() {
		System.out.println("Brewing tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding lemon");
	}

	@Override
	public boolean wantCondimentsHook() {
		System.out.println("Condiments yes or no? please input(y/n).");
		Scanner scanner = new Scanner(System.in);
		String result = "";
		result = scanner.nextLine();
		scanner.close();
		if ("n".equals(result))
			return false;
		return true;
	}

}
