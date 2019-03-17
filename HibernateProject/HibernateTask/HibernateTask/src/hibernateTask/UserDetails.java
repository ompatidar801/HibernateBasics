package hibernateTask;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
public class UserDetails implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="userID")
	private int userId;
	
	@Column(name="userName")
	private String username;
	
	@Column(name="Password")
	private String password;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	//many to many ProductUser
	@ManyToMany(targetEntity=Product.class ,mappedBy="users")
	private Set<Product> product;

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
	//one to many UserOrder
	@OneToMany(targetEntity=Feedback.class ,cascade=CascadeType.ALL)
	@JoinColumn(name="User_ID" ,referencedColumnName="userID")
	private Set<OrdersDetails> orders;

	public Set<OrdersDetails> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrdersDetails> orders) {
		this.orders = orders;
	}
	
	//one to many UserFeedback
	@OneToMany(targetEntity=Feedback.class ,cascade=CascadeType.ALL)
	@JoinColumn(name="User_ID" ,referencedColumnName="userID")
	private Set<?> feedback;

	public Set<?> getFeedback() {
		return feedback;
	}

	public void setFeedback(Set<?> feedback) {
		this.feedback = feedback;
	}
	
	//one to many UserComplain
	@OneToMany(targetEntity=Complain.class ,cascade=CascadeType.ALL)
	@JoinColumn(name="User_ID" ,referencedColumnName="userID")
	private Set<?> complain;

	public Set<?> getComplain() {
		return complain;
	}

	public void setComplain(Set<?> complain) {
		this.complain = complain;
	}
	
}
