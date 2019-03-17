package sqlHibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertIntoQuery {

	public static void main(String[] args) 
	{
		SessionFactory sf =  new Configuration().configure("empHibernate.cfg.xml").buildSessionFactory();
		Session sn = sf.openSession();
		Transaction trs = sn.beginTransaction();
		
		Query qr = sn.createSQLQuery("select * from EmployeeTable").addEntity(EmployeeDTO.class);		
		//Query qr = sn.createQuery("from EmployeeDTO");
		List ls = qr.list();
		Iterator itr = ls.iterator();
		EmployeeDTO emp1;
		while(itr.hasNext())
		{
			emp1 = (EmployeeDTO) itr.next();
			System.out.println(emp1.getEid()+" ");
			System.out.print(emp1.getEname()+" ");
			System.out.print(emp1.getEdepartment()+" ");
			System.out.print(emp1.getSalary()+" ");
			
			System.out.println("");
		}
		
		trs.commit();
		sn.close();
	}
	
	public static void getSpecificColumn()
	{
		SessionFactory sf =  new Configuration().configure("empHibernate.cfg.xml").buildSessionFactory();
		Session sn = sf.openSession();
		Transaction trs = sn.beginTransaction();
		
		Query qr = sn.createSQLQuery("insert into EmployeeTable values(11,'jayram','Linux',55000)");
		//Query qr = sn.createQuery("select e.eid,e.ename,e.edepartment from EmployeeDTO e");
		
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
		
		trs.commit();
		sn.close();
	}
	public static void getDistinctRecord()
	{
		SessionFactory sf =  new Configuration().configure("empHibernate.cfg.xml").buildSessionFactory();
		Session sn = sf.openSession();
		Transaction trs = sn.beginTransaction();

		//Query qr = sn.createSQLQuery("select distinct emp_name,emp_department from EmployeeTable");		
		Query qr = sn.createQuery("select count(distinct e.ename),e.edepartment from EmployeeDTO e");
		
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
		
		//Query qr = sn.createSQLQuery("select distinct emp_name,emp_department from EmployeeTable");		
		//Query qr1 = sn.createQuery("select count(*) from EmployeeDTO e");
				
		
		trs.commit();
		sn.close();


	}

}
