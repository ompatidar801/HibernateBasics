package sqlHibernate;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeInfo 
{
	
	public static void insertRecordWithUpdate()
	{
		EmployeeDTO emp = new EmployeeDTO();
		emp.setEname("tanmay");
		emp.setEdepartment("OracleDB");
		emp.setSalary(37473);
		
		SessionFactory sf =  new Configuration().configure("empHibernate.cfg.xml").buildSessionFactory();
		Session sn = sf.openSession();
		Transaction trs = sn.beginTransaction();
		sn.save(emp);
		trs.commit();
		sn.close();
	}
	public static void getAllColumn()
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
		
		Query qr = sn.createSQLQuery("select emp_id,emp_name,emp_department from EmployeeTable");
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
		Query qr = sn.createQuery("select distinct e.ename,e.edepartment from EmployeeDTO e");
		
		
		//Query qr = sn.createSQLQuery("select distinct emp_name,emp_department from EmployeeTable");		
		//Query qr = sn.createQuery("select distint e.ename from EmployeeDTO e");
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
		
		
				
		
		trs.commit();
		sn.close();
	}
	public static void main(String[] args) 
	{
		
		//insertRecordWithUpdate();
		//getAllColumn();
		//getSpecificColumn();
		getDistinctRecord();
	}

}
