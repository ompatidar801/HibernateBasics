package entities;
// Generated Feb 20, 2018 6:52:46 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Productdetails generated by hbm2java
 */
@Entity
@Table(name = "productdetails", catalog = "HibernateTask")
public class Productdetails implements java.io.Serializable {

	private int prDetId;
	private String brand;
	private String colour;
	private String model;
	private Float price;
	private String productName;
	private String warranty;
	private Integer productId;

	public Productdetails() {
	}

	public Productdetails(int prDetId) {
		this.prDetId = prDetId;
	}

	public Productdetails(int prDetId, String brand, String colour, String model, Float price, String productName,
			String warranty, Integer productId) {
		this.prDetId = prDetId;
		this.brand = brand;
		this.colour = colour;
		this.model = model;
		this.price = price;
		this.productName = productName;
		this.warranty = warranty;
		this.productId = productId;
	}

	@Id

	@Column(name = "pr_det_Id", unique = true, nullable = false)
	public int getPrDetId() {
		return this.prDetId;
	}

	public void setPrDetId(int prDetId) {
		this.prDetId = prDetId;
	}

	@Column(name = "Brand")
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name = "colour")
	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Column(name = "Model")
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "price", precision = 12, scale = 0)
	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Column(name = "ProductName")
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "Warranty")
	public String getWarranty() {
		return this.warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	@Column(name = "ProductID")
	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}
