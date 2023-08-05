package collection_framwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
    public int compareTo(Product other) {
        // Implement the comparison logic based on the price
        // This will sort the products in ascending order of price
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price;
    }
}

public class Product_HashMap {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
        products.add(new Product("mera ghar", 10.50));
        products.add(new Product("Tera ghar", 5.75));
        products.add(new Product("baap ka ghar", 8.20));
        products.add(new Product("Chacha ka ghar", 15.30));

        // Sort the products based on price using the compareTo method
        Collections.sort(products);

        // Printing the sorted products
        for (Product product : products) {
            System.out.println(product);
        }

	}
}



