package assignments.Lab8.Prob2;

public class Product {
	final String title;
	final double price;
	final int model;

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getModel() {
		return model;
	}

	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Product [title=" + title + ", price=" + price + ", model=" + model + "]";
	}

}

