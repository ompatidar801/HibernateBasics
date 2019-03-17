package sqlHibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SQLAggregateFunctions {

	public static void main(String[] args) 
	{
		SessionFactory sf =  new Configuration().configure("empHibernate.cfg.xml").buildSessionFactory();
		Session sn = sf.openSession();
		Transaction trs = sn.beginTransaction();

		//Query qr = sn.createSQLQuery("select count(emp_salary) from EmployeeTable");		
		/*Query qr = sn.createQuery("select count(e.id) from EmployeeDTO e");
		Query qr1 = sn.createQuery("select max(e.salary) from EmployeeDTO e");
		Query qr2 = sn.createQuery("select min(e.salary) from EmployeeDTO e");
		Query qr3 = sn.createQuery("select sum(e.salary) from EmployeeDTO e");
		Query qr4 = sn.createQuery("select avg(e.salary) from EmployeeDTO e");*/
		Query qr5 = sn.createQuery("select count(*) from EmployeeDTO e");
		
		/*List ls = qr.list();
		System.out.println(ls.get(0));
		List ls1 = qr1.list();
		System.out.println(ls1.get(0));
		List ls2 = qr2.list();
		System.out.println(ls2.get(0));
		List ls3 = qr3.list();
		System.out.println(ls3.get(0));
		List ls4 = qr4.list();
		System.out.println(ls4.get(0));*/
		List ls5 = qr5.list();
		Long obj = (Long)ls5.get(0);
	
		
		System.out.println(obj);

		

	}

}
