package entities;
// Generated Feb 20, 2018 6:22:04 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * Feedback generated by hbm2java
 */
public class Feedback implements java.io.Serializable {

	private int fdsno;
	private String aboutDelievery;
	private String aboutProduct;
	private String aboutSeller;
	private Integer userId;

	public Feedback() {
	}

	public Feedback(int fdsno) {
		this.fdsno = fdsno;
	}

	public Feedback(int fdsno, String aboutDelievery, String aboutProduct, String aboutSeller, Integer userId) {
		this.fdsno = fdsno;
		this.aboutDelievery = aboutDelievery;
		this.aboutProduct = aboutProduct;
		this.aboutSeller = aboutSeller;
		this.userId = userId;
	}

	public int getFdsno() {
		return this.fdsno;
	}

	public void setFdsno(int fdsno) {
		this.fdsno = fdsno;
	}

	public String getAboutDelievery() {
		return this.aboutDelievery;
	}

	public void setAboutDelievery(String aboutDelievery) {
		this.aboutDelievery = aboutDelievery;
	}

	public String getAboutProduct() {
		return this.aboutProduct;
	}

	public void setAboutProduct(String aboutProduct) {
		this.aboutProduct = aboutProduct;
	}

	public String getAboutSeller() {
		return this.aboutSeller;
	}

	public void setAboutSeller(String aboutSeller) {
		this.aboutSeller = aboutSeller;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
