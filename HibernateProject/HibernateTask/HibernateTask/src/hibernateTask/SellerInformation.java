package hibernateTask;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="SellerInformation")
public class SellerInformation implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SellerID")
	private int sellerID;
	
	@Column(name="SellerName")
	private String sellerName;
	
	//many to many ProductUser
		@ManyToMany(targetEntity=Product.class ,mappedBy="seller")
		private Set<?> product;

		public int getSellerID() {
			return sellerID;
		}

		public void setSellerID(int sellerID) {
			this.sellerID = sellerID;
		}

		public String getSellerName() {
			return sellerName;
		}

		public void setSellerName(String sellerName) {
			this.sellerName = sellerName;
		}

		public Set<?> getProduct() {
			return product;
		}

		public void setProduct(Set<?> product) {
			this.product = product;
		}
		
	
}
