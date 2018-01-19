package com.pratik.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pratik.domain.BankAccount;
import com.pratik.utility.HibernateUtil;

public class DAO_IMPL implements DAO_Interface {
		
	@Override
	public void saveCustomer() {
		Session ses=null;
		//get the session
		ses=HibernateUtil.getSession();
		//create the entity class obect and set the values
		BankAccount acc=new BankAccount();
		
		acc.setId(101);
		acc.setName("Pratik");
		acc.setBalance(50000);
		//save objs (parent to child)
				Transaction tx=null;
				try{
				 tx=ses.beginTransaction();
				   ses.save(acc);
				 tx.commit();
				 System.out.println("Objects are saved....");
				  }//try
				  catch(Exception e){
				    tx.rollback();
				    }
				//close the session
				HibernateUtil.closeSession(ses);
	}
	
@Override
	public void user1() {
	Session ses=null;
	Transaction tx=null;
	boolean flag=false;
	//get the session
	ses=HibernateUtil.getSession();
	//create the domain class object
		BankAccount acc=new BankAccount();
		//load the object
		acc=ses.get(BankAccount.class, 101);
			if(acc!=null)
				System.out.println(acc);
			//update the object
			try {
				Thread.sleep(30000);
					tx=ses.beginTransaction();
						acc.setBalance(70000);
						tx.commit();
				System.out.println("\n\t**Object Is Upadated**");
			}catch (Exception e) {
				tx.rollback();
				System.out.println("\n\t**Object Is not Upadated**");
				e.printStackTrace();
			}
		
		
	}//user1

@Override
public void user2() {
	Session ses=null;
	Transaction tx=null;
	boolean flag=false;
	//get the session
	ses=HibernateUtil.getSession();
	//create the domain class object
		BankAccount acc=new BankAccount();
		//load the object
		acc=ses.get(BankAccount.class, 101);
			if(acc!=null)
				System.out.println(acc);
			//update the object
			try {
				Thread.sleep(30000);
					tx=ses.beginTransaction();
						acc.setBalance(100000);
						tx.commit();
				System.out.println("\n\t**Object Is Upadated**");
			}
			catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			catch (Exception e) {
				tx.rollback();
				System.out.println("\n\t**Object Is not Upadated**");
				e.printStackTrace();
			}
		
}//user2
	
	
	
	
}//class close
