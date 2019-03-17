package sqlHibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class WhereClause {

	public static void main(String[] args)
	{
		SessionFactory sf =  new Configuration().configure("empHibernate.cfg.xml").buildSessionFactory();
		Session sn = sf.openSession();
		Transaction trs = sn.beginTransaction();
		
		//Query qr = sn.createSQLQuery("select emp_id,emp_name,emp_department from EmployeeTable where emp_salary=37473");
		Query qr = sn.createQuery("select e.eid,e.ename,e.edepartment from EmployeeDTO e where e.salary=40000");
		
		List ls = qr.list();
		Iterator itr = ls.iterator();
		Object[] ob;
	
		while(itr.hasNext())
		{
			ob = (Object[]) itr.next();
			
			Integer id = (Integer)ob[0];
			String name =(String) ob[1];
			String department =(String) ob[2];
			/*Float salary = (Float) ob[3];*/
			System.out.println(id+" "+name+" "+department);
			
			System.out.println("");
		}
		
		//Query qr1 = sn.createSQLQuery("select * from EmployeeTable where emp_salary=40000").addEntity(EmployeeDTO.class);		
		//Query qr1 = sn.createQuery("from EmployeeDTO where emp_salary<40000");

		Query qr1 = sn.createSQLQuery("select * from EmployeeTable where emp_department='OracleDB' and emp_salary=40000").addEntity(EmployeeDTO.class);		
		//Query qr1 = sn.createQuery("from EmployeeDTO where emp_salary>20000 and emp_salary<50000");
		List ls2 = qr1.list();
		Iterator itr2 = ls2.iterator();
		EmployeeDTO emp1;
		while(itr2.hasNext())
		{
			emp1 = (EmployeeDTO) itr2.next();
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
