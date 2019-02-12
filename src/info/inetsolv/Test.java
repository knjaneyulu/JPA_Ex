package info.inetsolv;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setId(30);
		emp.setDesignation("chetta");
		emp.setName("ZZZ");
		emp.setSalary(60000d);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String query="select * from employee";
		entityManager.getTransaction().begin();
		entityManager.persist(emp);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("successs...............");

	}

}
