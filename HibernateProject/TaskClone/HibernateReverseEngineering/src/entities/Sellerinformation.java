package entities;
// Generated Feb 20, 2018 6:22:04 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * Sellerinformation generated by hbm2java
 */
public class Sellerinformation implements java.io.Serializable {

	private int sellerId;
	private String sellerName;

	public Sellerinformation() {
	}

	public Sellerinformation(int sellerId) {
		this.sellerId = sellerId;
	}

	public Sellerinformation(int sellerId, String sellerName) {
		this.sellerId = sellerId;
		this.sellerName = sellerName;
	}

	public int getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
