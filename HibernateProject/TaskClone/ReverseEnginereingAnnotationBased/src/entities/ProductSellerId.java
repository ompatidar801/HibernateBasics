package entities;
// Generated Feb 20, 2018 6:52:46 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProductSellerId generated by hbm2java
 */
@Embeddable
public class ProductSellerId implements java.io.Serializable {

	private int productId;
	private int sellerId;

	public ProductSellerId() {
	}

	public ProductSellerId(int productId, int sellerId) {
		this.productId = productId;
		this.sellerId = sellerId;
	}

	@Column(name = "Product_ID", nullable = false)
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Column(name = "Seller_ID", nullable = false)
	public int getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProductSellerId))
			return false;
		ProductSellerId castOther = (ProductSellerId) other;

		return (this.getProductId() == castOther.getProductId()) && (this.getSellerId() == castOther.getSellerId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getProductId();
		result = 37 * result + this.getSellerId();
		return result;
	}

}
