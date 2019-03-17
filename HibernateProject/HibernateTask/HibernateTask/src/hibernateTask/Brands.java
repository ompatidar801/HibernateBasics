package hibernateTask;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Brands")
public class Brands implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="BrandName")
	private String brandName;
	
	@Column(name="BrandID")
	private int brandID;
	
	@Column(name="subCategories")
	private String subCategories;
	
	public String getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(String subCategories) {
		this.subCategories = subCategories;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getBrandID() {
		return brandID;
	}

	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}
	
	@OneToMany(targetEntity=Product.class ,cascade=CascadeType.ALL)
	@JoinColumn(name="BrandName" ,referencedColumnName="BrandName")
	private Set<Product> product;

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
}
