package hibernateTask;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PaymentOptions")
public class PaymentOptions implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="Pay_Options_ID")
	private int pay_options_ID;
	
	@Column(name="creaditCardNo")
	private String creaditCardNo;
	
	@Column(name="CVVNO")
	private int CVVNo;
	
	@Column(name="CheckNo")
	private String checkNo;
	
	@Column(name="Bank")
	private String bank;

	public int getPay_options_ID() {
		return pay_options_ID;
	}

	public void setPay_options_ID(int pay_options_ID) {
		this.pay_options_ID = pay_options_ID;
	}

	public String getCreaditCardNo() {
		return creaditCardNo;
	}

	public void setCreaditCardNo(String creaditCardNo) {
		this.creaditCardNo = creaditCardNo;
	}

	public int getCVVNo() {
		return CVVNo;
	}

	public void setCVVNo(int cVVNo) {
		CVVNo = cVVNo;
	}

	public String getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}
	
}
