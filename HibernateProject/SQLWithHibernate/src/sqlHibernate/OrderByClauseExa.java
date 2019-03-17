package sqlHibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OrderByClauseExa {

	public static void main(String[] args) 
	{
		SessionFactory sf =  new Configuration().configure("empHibernate.cfg.xml").buildSessionFactory();
		Session sn = sf.openSession();
		Transaction trs = sn.beginTransaction();

		//Query qr = sn.createSQLQuery("select emp_name,emp_department from EmployeeTable order by emp_name asc");		
		Query qr = sn.createQuery("select e.ename,e.edepartment from EmployeeDTO e");
		
		List ls = qr.list();
		
		Iterator itr = ls.iterator();
		Object[] ob;
		
		while(itr.hasNext())
		{
			ob = (Object[]) itr.next();
			
			String name =(String) ob[0];
			String department =(String) ob[1];
		
			System.out.println(name+" "+department);
			
			System.out.println("");
		}
		
		
		//Query qr3 = sn.createSQLQuery("select * from EmployeeTable order by emp_id desc").addEntity(EmployeeDTO.class);		
		Query qr3 = sn.createQuery("from EmployeeDTO order by emp_salary asc ");
		List ls3 = qr3.list();
		Iterator itr3 = ls3.iterator();
		EmployeeDTO emp1;
		while(itr3.hasNext())
		{
			emp1 = (EmployeeDTO) itr3.next();
			System.out.println(emp1.getEid()+" ");
			System.out.print(emp1.getEname()+" ");
			System.out.print(emp1.getEdepartment()+" ");
			System.out.print(emp1.getSalary()+" ");
			
			System.out.println("");
		}
		trs.commit();
		sn.close();

	}

}
