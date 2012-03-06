package au.com.ejb.entity.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="phone_no")	
	private Long phoneno;
	
	@Column(name="city")
	private String city;
	
	public Address() {
	}
	public Address(Long phone_no,String city) {
		this.phoneno=phone_no;
		this.city=city;
	}
	public Address(String city) {
		this.city=city;
	}
	
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneNo) {
		this.phoneno = phoneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
