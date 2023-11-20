package edu.depaul.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.depaul.Catalog;
import edu.depaul.Product;
import edu.depaul.ProductFactoryConcrete;

//Test for Catalog class
public class CatalogTest {

	private Catalog catalog;
	private Product test;

	@Before
	public void setUp() {
		test = new Product("test", 1);
		catalog = new Catalog(new ProductFactoryConcrete());
	}

	@Test
	public void addProductTest() {
		catalog.addProduct(test);
		assertTrue(catalog.productExist("test"));
	}

	@Test
	public void existsTest() {
		catalog.addProduct(test);
		assertTrue(catalog.productExist("test"));
	}

	@Test
	public void byNameTest() {
		catalog.addProduct(test);
		Product retrievedProduct = catalog.getProductByName("test");
		assertEquals("test", retrievedProduct.getName());
		assertNotNull(retrievedProduct);
	}
}
