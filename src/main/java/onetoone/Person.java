package onetoone;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Only applicable for int long only
	private int pid;
	private String name;
	private String gender;
	private int age;
	
	@OneToOne
	private Pancard p;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Pancard getP() {
		return p;
	}
	public void setP(Pancard p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", gender=" + gender + ", age=" + age + ", p=" + p + "]";
	}
	
}
