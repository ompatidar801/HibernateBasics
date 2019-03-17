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
@Table(name="RefoundOrReplace")
public class RefundOrReplace implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="reID")
	private int reID;
	
	@Column(name="ReplaceProduct")
	private String replaceProduct;
	
	@Column(name="RefoundAmount")
	private double refoundAmount;
	
	@OneToOne(targetEntity=PaymentOptions.class ,cascade=CascadeType.ALL)
	@JoinColumn(name="Pay_Options_ID" ,referencedColumnName="Pay_Options_ID")
	private PaymentOptions pay_option;
	
	public PaymentOptions getPay_option() {
		return pay_option;
	}

	public void setPay_option(PaymentOptions pay_option) {
		this.pay_option = pay_option;
	}

	public int getReID() {
		return reID;
	}

	public void setReID(int reID) {
		this.reID = reID;
	}

	public String getReplaceProduct() {
		return replaceProduct;
	}

	public void setReplaceProduct(String replaceProduct) {
		this.replaceProduct = replaceProduct;
	}

	public double getRefoundAmount() {
		return refoundAmount;
	}

	public void setRefoundAmount(double refoundAmount) {
		this.refoundAmount = refoundAmount;
	}
	
}
