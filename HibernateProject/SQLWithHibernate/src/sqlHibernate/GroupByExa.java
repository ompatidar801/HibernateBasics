package sqlHibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GroupByExa {

	public static void main(String[] args)
	{
		SessionFactory sf =  new Configuration().configure("empHibernate.cfg.xml").buildSessionFactory();
		Session sn = sf.openSession();
		Transaction trs = sn.beginTransaction();

		/*//Query qr = sn.createSQLQuery("select count(emp_name) from EmployeeTable group by emp_salary");		
		Query qr = sn.createQuery("select max(e.salary) from EmployeeDTO e group by e.salary ");
		
		List ls = qr.list();
		for(int i=0; i<ls.size(); i++) {
			Object[] row = (Object[]) ls.get(i);
			System.out.println(row[0]+", "+ row[1]);
		}
		
		/*Iterator itr = ls.iterator();
		Object[] ob;
		
		while(itr.hasNext())
		{
			ob = (Object[]) itr.next();
			
			
			
		
			System.out.println(ob[0]+"   "+ob[1]);
			
			System.out.println("");
		}*/
		
		
		//Query qr3 = sn.createSQLQuery("select  count(*) from EmployeeTable group by emp_salary");		
		Query qr3 = sn.createQuery("select count(*)from EmployeeDTO e group by e.name ");
		List ls3 = qr3.list();
		Long ld = (Long) ls3.get(0);
		System.out.println(ld);
		/*Iterator itr3 = ls3.iterator();
		EmployeeDTO emp1;
		while(itr3.hasNext())
		{
			emp1 = (EmployeeDTO) itr3.next();
			System.out.println(emp1.getEid()+" ");
			System.out.print(emp1.getEname()+" ");
			System.out.print(emp1.getEdepartment()+" ");
			System.out.print(emp1.getSalary()+" ");
			
			System.out.println("");
		}*/
		trs.commit();
		sn.close();

	}

}
