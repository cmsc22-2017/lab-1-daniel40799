import tester.*;

interface iMenu{

}
class Soup implements iMenu{
	String name;
	int price;
	boolean isVegan;
	Soup(String name, int price, boolean isVegan){
		this.name = name;
		this.price = price;
		this.isVegan = isVegan;
	}
}

class Salad implements iMenu{
	String name;
	int price;
	boolean isVegan;
	String dressing;
	Salad(String name, int price, boolean isVegan, String dressing){
		this.name = name;
		this.price = price;
		this.isVegan = isVegan;
		this.dressing = dressing;
	}
}

class Sandwich implements iMenu{
	String name;
	int price;
	String breadKind;
	String filling1;
	String filling2;
	Sandwich(String name, int price, String breadKind, String filling1, String filling2){
		this.name = name;
		this.price = price;
		this.breadKind = breadKind;
		this.filling1 = filling1;
		this.filling2 = filling2;
	}
}

class ExampleMenu{
	iMenu cabbageSoup = new Soup("Cabbage Soup", 100, true);
	iMenu meatSalad = new Salad("Meat Salad", 270, false, "French Dressing");
	iMenu burgerSandwich = new Sandwich("Burger Sandwich", 500, "Baguette", "Tomato", "Burger");
	iMenu chickenSoup = new Soup("Chicken Soup", 400, false);
	iMenu fruitSalad = new Salad("Fruit Salad", 300, true, "Salad Cream");
	iMenu angelSandwich = new Sandwich ("Angel's Sandwich", 1000, "Wheat Bread", "Cheese", "Burger");
	
	
}