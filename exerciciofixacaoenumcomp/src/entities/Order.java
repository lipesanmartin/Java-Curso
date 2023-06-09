package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime moment;
	private OrderStatus status;
	private List<OrderItem> order = new ArrayList<OrderItem>();
	private Client client;

	public Order() {

	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(OrderItem item) {
		order.add(item);
	}

	public void removeItem(OrderItem item) {
		order.remove(item);
	}

	public Double total() {
		double total = 0;
		for (OrderItem item : order) {
			total += item.subTotal();
		}
		return total;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + dtf.format(getMoment()) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.toString() + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : order) {
			sb.append(item.toString() + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();

	}

}
