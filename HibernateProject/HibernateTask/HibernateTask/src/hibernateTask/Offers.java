package hibernateTask;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Offers")
public class Offers implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="offerID")
	private int offerID;
	
	@Column(name="BasePrice")
	private double basePrice;
	
	@Column(name="offersPrice")
	private double offers;

	//one to one for ProductOffer 
	@OneToOne(targetEntity=Product.class ,cascade=CascadeType.ALL)
	@JoinColumn(name="prod_ID" ,referencedColumnName="prod_ID")
		private Product product;
		
	public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

	public double getBasePrice() {
			return basePrice;
		}

		public void setBasePrice(double basePrice) {
			this.basePrice = basePrice;
		}

	public int getOfferID() {
		return offerID;
	}

	public void setOfferID(int offerID) {
		this.offerID = offerID;
	}

	public double getOffers() {
		return offers;
	}

	public void setOffers(double offers) {
		this.offers = offers;
	}

	
}
