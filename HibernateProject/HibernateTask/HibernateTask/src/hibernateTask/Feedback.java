
package hibernateTask;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
public class Feedback implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="FDSno")
	private int fdSno;
	
	@Column(name="AboutProduct")
	private String aboutProduct;
	
	@Column(name="AboutSeller")
	private String aboutSeller;

	@Column(name="AboutDelievery")
	private String aboutDelievery;

	public int getFdSno() {
		return fdSno;
	}

	public void setFdSno(int fdSno) {
		this.fdSno = fdSno;
	}

	public String getAboutProduct() {
		return aboutProduct;
	}

	public void setAboutProduct(String aboutProduct) {
		this.aboutProduct = aboutProduct;
	}

	public String getAboutSeller() {
		return aboutSeller;
	}

	public void setAboutSeller(String aboutSeller) {
		this.aboutSeller = aboutSeller;
	}

	public String getAboutDelievery() {
		return aboutDelievery;
	}

	public void setAboutDelievery(String aboutDelievery) {
		this.aboutDelievery = aboutDelievery;
	}
	
}
