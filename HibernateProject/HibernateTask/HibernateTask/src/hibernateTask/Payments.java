package hibernateTask;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Payments")
public class Payments implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="payID")
	private int payID;
	
	@Column(name="Amount")
	private double amount;
	
	//many to one for OrdersDetailsPayments
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Order_ID",referencedColumnName="OrderID")
	private OrdersDetails ordersDetails; 
	
	public OrdersDetails getOrdersDetails() {
		return ordersDetails;
	}

	public void setOrdersDetails(OrdersDetails ordersDetails) {
		this.ordersDetails = ordersDetails;
	}

	public int getPayID() {
		return payID;
	}

	public void setPayID(int payID) {
		this.payID = payID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	//many to one for OrdersDetailsPayments
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="User_ID",referencedColumnName="userID")
	private UserDetails usersDetails;

	public UserDetails getUsersDetails() {
		return usersDetails;
	}

	public void setUsersDetails(UserDetails usersDetails) {
		this.usersDetails = usersDetails;
	}
	
	//one to many for PaymentsPaymentOptions
	@OneToMany(targetEntity=PaymentOptions.class ,cascade=CascadeType.ALL)
	@JoinColumn(name="Pay_ID" ,referencedColumnName="payID")
	private Set<PaymentOptions> pay_option;
	
	public Set<PaymentOptions> getPay_option() {
		return pay_option;
	}

	public void setPay_option(Set<PaymentOptions> pay_option) {
		this.pay_option = pay_option;
	}
	
}
