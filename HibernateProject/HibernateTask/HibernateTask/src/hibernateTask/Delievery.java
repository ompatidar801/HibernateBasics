package hibernateTask;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Delievery")
public class Delievery implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @Column(name="DelieveryID")
	 private int delieveryId;
	 
	 @Column(name="DelieveryAddress")
	 private String delieveryAddress;

	 @Column(name="DelieveryDate")
	 private String delieveryDate;
	 
	 @ManyToMany(targetEntity=OrdersDetails.class ,mappedBy="delievery")
	 private Set<?> orders;
	 
	public Set<?> getOrders() {
		return orders;
	}

	public void setOrders(Set<?> orders) {
		this.orders = orders;
	}

	public String getDelieveryDate() {
		return delieveryDate;
	}

	public void setDelieveryDate(String delieveryDate) {
		this.delieveryDate = delieveryDate;
	}

	public int getDelieveryId() {
		return delieveryId;
	}

	public void setDelieveryId(int delieveryId) {
		this.delieveryId = delieveryId;
	}

	public String getDelieveryAddress() {
		return delieveryAddress;
	}

	public void setDelieveryAddress(String delieveryAddress) {
		this.delieveryAddress = delieveryAddress;
	}
	 
	 
}
