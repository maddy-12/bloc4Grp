import javax.print.attribute.DateTimeSyntax;

public class Order {
	private int id;
	private Product[] products;
	private DateTimeSyntax date_order;
	private Client client;
	public Product[] getArticles() {
		return products;
	}
	public void setArticles(Product[] articles) {
		this.products = articles;
	}
	public DateTimeSyntax getDate_order() {
		return date_order;
	}
	public void setDate_order(DateTimeSyntax date_order) {
		this.date_order = date_order;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public int getId() {
		return id;
	}
}
