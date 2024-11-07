package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
	//Creating object for PanCard class
		Pancard p=new Pancard();
		p.setAddress("Theni");
		p.setPhone(9876543210l);
		p.setDob("28.06.1996");
		
	//Creating object for Person class	
		Person p1=new Person();
		p1.setAge(27);
		p1.setGender("male");
		p1.setName("Sanjay");
		p1.setP(p);
		
		try {
		et.begin();
		em.persist(p1);
		em.persist(p);
		et.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			et.rollback();
		}
		
	}
}
