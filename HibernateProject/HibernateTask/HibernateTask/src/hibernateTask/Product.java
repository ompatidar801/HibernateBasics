package hibernateTask;

import java.io.Serializable;
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
@Table(name="Product")
public class Product implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="prod_ID")
	private int prod_id;
	
	@Column(name="prod_Name")
	private String prod_name;

	@Column(name="prod_Price")
	private float prod_price;
	
	@Column(name="BrandName")
	private String BrandName;
	
	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public float getProd_price() {
		return prod_price;
	}

	public void setProd_price(float prod_price) {
		this.prod_price = prod_price;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	
	//for ProductUserDetails
	@ManyToMany(targetEntity=UserDetails.class ,cascade=CascadeType.ALL)
	@JoinTable(name="Product_Users" ,joinColumns=@JoinColumn(name="Product_ID" ,referencedColumnName="prod_ID") ,inverseJoinColumns=@JoinColumn(name="User_ID" ,referencedColumnName="userID"))
	private Set<UserDetails> users;

	public Set<UserDetails> getUsers() {
		return users;
	}

	public void setUsers(Set<UserDetails> users) {
		this.users = users;
	}
	
	//for ProductSellerInformation
	@ManyToMany(targetEntity=SellerInformation.class ,cascade=CascadeType.ALL)
	@JoinTable(name="Product_Seller" ,joinColumns=@JoinColumn(name="Product_ID" ,referencedColumnName="prod_ID") ,inverseJoinColumns=@JoinColumn(name="Seller_ID" ,referencedColumnName="SellerID"))
	private Set<SellerInformation> seller;

	public Set<SellerInformation> getSeller() {
		return seller;
	}

	public void setSeller(Set<SellerInformation> seller) {
		this.seller = seller;
	}
	
}
