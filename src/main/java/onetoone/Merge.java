package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Merge {
	public static void main(String[] args) {

		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=em.find(Person.class,1);
		
		if(p!=null) {
			p.setAge(27);
			
			et.begin();
			em.merge(p);
			et.commit();
//			Pancard p1=p.getP();
//			System.out.println(p1);
		}
		else {
			System.out.println("Data Not found");
		}
	}
}
