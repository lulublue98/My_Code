public interface Product {
    
    private double price;
    
    public Product( double p ) {
	price = p;
    }

    public void setPrice( double p ) {
	price = p;
    }

    public double getPrice() {
	return price;
    }

}
