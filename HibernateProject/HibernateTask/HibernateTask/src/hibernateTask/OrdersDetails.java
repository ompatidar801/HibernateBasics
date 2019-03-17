package hibernateTask;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="OrdersDetails")
public class OrdersDetails implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="OrderID")
	private int orderID;
	
	@Column(name="ProductName")
	private String productName;
	
	@Column(name="orderDate")
	private Date orderDate;
/*
	@Column(name="User_ID")
	private int UserID;
	*/
	@Column(name="Location")
	private String location;
	
	@Column(name="State")
	private String state;
	
	@Column(name="Country")
	private String country;
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
/*
	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}*/

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	@ManyToMany(targetEntity=Delievery.class ,cascade=CascadeType.ALL)
	@JoinTable(name="Orders_Delievery" ,joinColumns=@JoinColumn(name="Order_ID" ,referencedColumnName="OrderID") ,inverseJoinColumns=@JoinColumn(name="Delievery_ID" ,referencedColumnName="DelieveryID"))
	private Set<?> delievery;

	public Set<?> getDelievery() {
		return delievery;
	}

	public void setDelievery(Set<?> delievery) {
		this.delievery = delievery;
	}
	
}
