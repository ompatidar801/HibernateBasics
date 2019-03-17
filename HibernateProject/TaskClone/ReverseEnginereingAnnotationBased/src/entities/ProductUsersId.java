package entities;
// Generated Feb 20, 2018 6:52:46 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProductUsersId generated by hbm2java
 */
@Embeddable
public class ProductUsersId implements java.io.Serializable {

	private int productId;
	private int userId;

	public ProductUsersId() {
	}

	public ProductUsersId(int productId, int userId) {
		this.productId = productId;
		this.userId = userId;
	}

	@Column(name = "Product_ID", nullable = false)
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Column(name = "User_ID", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProductUsersId))
			return false;
		ProductUsersId castOther = (ProductUsersId) other;

		return (this.getProductId() == castOther.getProductId()) && (this.getUserId() == castOther.getUserId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getProductId();
		result = 37 * result + this.getUserId();
		return result;
	}

}
