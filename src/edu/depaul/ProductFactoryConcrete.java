package edu.depaul;

public class ProductFactoryConcrete implements IProductFactory {

	@Override
	public Product createProduct(String name, double price) {
		return new Product(name, price);
	}
}
