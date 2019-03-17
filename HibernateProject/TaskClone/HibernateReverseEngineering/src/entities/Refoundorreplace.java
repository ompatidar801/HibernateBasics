package entities;
// Generated Feb 20, 2018 6:22:04 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * Refoundorreplace generated by hbm2java
 */
public class Refoundorreplace implements java.io.Serializable {

	private int reId;
	private Double refoundAmount;
	private String replaceProduct;
	private Integer payOptionsId;

	public Refoundorreplace() {
	}

	public Refoundorreplace(int reId) {
		this.reId = reId;
	}

	public Refoundorreplace(int reId, Double refoundAmount, String replaceProduct, Integer payOptionsId) {
		this.reId = reId;
		this.refoundAmount = refoundAmount;
		this.replaceProduct = replaceProduct;
		this.payOptionsId = payOptionsId;
	}

	public int getReId() {
		return this.reId;
	}

	public void setReId(int reId) {
		this.reId = reId;
	}

	public Double getRefoundAmount() {
		return this.refoundAmount;
	}

	public void setRefoundAmount(Double refoundAmount) {
		this.refoundAmount = refoundAmount;
	}

	public String getReplaceProduct() {
		return this.replaceProduct;
	}

	public void setReplaceProduct(String replaceProduct) {
		this.replaceProduct = replaceProduct;
	}

	public Integer getPayOptionsId() {
		return this.payOptionsId;
	}

	public void setPayOptionsId(Integer payOptionsId) {
		this.payOptionsId = payOptionsId;
	}

}
