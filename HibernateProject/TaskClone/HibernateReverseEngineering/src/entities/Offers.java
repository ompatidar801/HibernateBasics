package entities;
// Generated Feb 20, 2018 6:22:04 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * Offers generated by hbm2java
 */
public class Offers implements java.io.Serializable {

	private int offerId;
	private Double basePrice;
	private Double offersPrice;
	private Integer prodId;

	public Offers() {
	}

	public Offers(int offerId) {
		this.offerId = offerId;
	}

	public Offers(int offerId, Double basePrice, Double offersPrice, Integer prodId) {
		this.offerId = offerId;
		this.basePrice = basePrice;
		this.offersPrice = offersPrice;
		this.prodId = prodId;
	}

	public int getOfferId() {
		return this.offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public Double getBasePrice() {
		return this.basePrice;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}

	public Double getOffersPrice() {
		return this.offersPrice;
	}

	public void setOffersPrice(Double offersPrice) {
		this.offersPrice = offersPrice;
	}

	public Integer getProdId() {
		return this.prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

}
