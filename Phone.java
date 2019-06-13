package may09;

public class Phone {
	private String brand;
	private int size;
	
	
	
	public String getBrand() {
		return brand;
	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
	public int getSize() {
		return size;
	}
//	public void setSize(int size) {
//		this.size = size;
//	}
		public Phone(String brand, int size) {
			this.brand = brand;
			this.size = size;
		}
		protected void makeCall() {
			System.out.println("calling");
		}
}
