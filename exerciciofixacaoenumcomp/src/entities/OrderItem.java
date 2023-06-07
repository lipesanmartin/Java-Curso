package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private String prodName;

	public OrderItem(Product product, int quantity) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.prodName = product.getName();

	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public Double subTotal() {
		return this.quantity * this.price;
	}

	public String toString() {
		return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f", prodName, price, quantity, subTotal());
	}

}
