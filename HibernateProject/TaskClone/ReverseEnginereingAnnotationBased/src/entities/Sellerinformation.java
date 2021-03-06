package entities;
// Generated Feb 20, 2018 6:52:46 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Sellerinformation generated by hbm2java
 */
@Entity
@Table(name = "sellerinformation", catalog = "HibernateTask")
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

	@Id

	@Column(name = "SellerID", unique = true, nullable = false)
	public int getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	@Column(name = "SellerName")
	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
