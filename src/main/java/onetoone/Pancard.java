package onetoone;

import javax.persistence.*;

@Entity
public class Pancard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pno;
	private String address;
	private String dob;
	private long phone;
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Pancard [pno=" + pno + ", address=" + address + ", dob=" + dob + ", phone=" + phone + "]";
	}
	
	
}
