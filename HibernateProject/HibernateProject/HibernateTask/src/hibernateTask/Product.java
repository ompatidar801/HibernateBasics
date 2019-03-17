package hibernateTask;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="prod_ID")
	private int prod_id;
	
	@Column(name="prod_Name")
	private String prod_name;

	@Column(name="prod_Price")
	private float prod_price;
	
	
	public float getProd_price() {
		return prod_price;
	}

	public void setProd_price(float prod_price) {
		this.prod_price = prod_price;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	
	//for SubCategories
	private String sub_Cat_Name;


	public String getSub_Cat_Name() {
		return sub_Cat_Name;
	}

	public void setSub_Cat_Name(String sub_Cat_Name) {
		this.sub_Cat_Name = sub_Cat_Name;
	}
	
	
}
