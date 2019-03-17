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
@Table(name="SubCategories")
public class SubCategories implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="sub_cat_Name")
	private String subCatName;
	
	@Column(name="sub_cat_ID")
	private int subCatID;
	
	@Column(name="Category_Name")
	private String Category_Name;
	
	public String getCategory_Name() {
		return Category_Name;
	}

	public void setCategory_Name(String category_Name) {
		Category_Name = category_Name;
	}

	public int getSubCatID() {
		return subCatID;
	}

	public void setSubCatID(int subCatID) {
		this.subCatID = subCatID;
	}

	public String getSubCatName() {
		return subCatName;
	}

	public void setSubCatName(String subCatName) {
		this.subCatName = subCatName;
	}
	
	//for BrandsClass
	@OneToMany(targetEntity=Brands.class ,cascade=CascadeType.ALL)
	@JoinColumn(name="subCategories" ,referencedColumnName="sub_cat_Name")
	private Set<Brands> brands;

	public Set<Brands> getBrands() {
		return brands;
	}

	public void setBrands(Set<Brands> brands) {
		this.brands = brands;
	}
	
}
