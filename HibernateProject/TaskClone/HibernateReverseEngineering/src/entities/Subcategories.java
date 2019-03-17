package entities;
// Generated Feb 20, 2018 6:22:04 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * Subcategories generated by hbm2java
 */
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

	public String getSubCatName() {
		return this.subCatName;
	}

	public void setSubCatName(String subCatName) {
		this.subCatName = subCatName;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getSubCatId() {
		return this.subCatId;
	}

	public void setSubCatId(Integer subCatId) {
		this.subCatId = subCatId;
	}

}