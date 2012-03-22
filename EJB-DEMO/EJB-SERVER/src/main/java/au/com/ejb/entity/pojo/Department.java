package au.com.ejb.entity.pojo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
@javax.persistence.Table(name="department")
public class Department {
	@Id	
	@Column(name="dep_id")
	private int depId;
	@Column(name="dep_name")
	private String name;
	/*@OneToOne(mappedBy="depId")	
	private Employee employee;*/
	/*@OneToMany
	@JoinColumn(name="dep_id")
	private List<Employee> employees=new ArrayList<Employee>();*/
	
	public Department(){}
	public Department(String name){
		
		this.name=name;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	/*public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	*/
	/*@Override
	public String toString() {		
		return depId+":::::"+name+"::::"+employees;
	}*/
	/*public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/
	
	
}
