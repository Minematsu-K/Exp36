public class Main {
	public static void main(String[] args) {
		Drink drink =new Coffee(350);
		
		drink.showPrice();
		
		Coffee coffee=(Coffee)drink;
		coffee.showBeans();
		
		System.out.println(drink==coffee);
	}
}
