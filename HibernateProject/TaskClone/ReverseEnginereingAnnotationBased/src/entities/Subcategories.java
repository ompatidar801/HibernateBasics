package entities;
// Generated Feb 20, 2018 6:52:46 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Subcategories generated by hbm2java
 */
@Entity
@Table(name = "subcategories", catalog = "HibernateTask")
public class Subcategories implements java.io.Serializable {

	private String subCatName;
	private String categoryName;
	private Integer subCatId;

	public Subcategories() {
	}

	public Subcategories(String subCatName) {
		this.subCatName = subCatName;
	}

	public Subcategories(String subCatName, String categoryName, Integer subCatId) {
		this.subCatName = subCatName;
		this.categoryName = categoryName;
		this.subCatId = subCatId;
	}

	@Id

	@Column(name = "sub_cat_Name", unique = true, nullable = false)
	public String getSubCatName() {
		return this.subCatName;
	}

	public void setSubCatName(String subCatName) {
		this.subCatName = subCatName;
	}

	@Column(name = "Category_Name")
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "sub_cat_ID")
	public Integer getSubCatId() {
		return this.subCatId;
	}

	public void setSubCatId(Integer subCatId) {
		this.subCatId = subCatId;
	}

}
