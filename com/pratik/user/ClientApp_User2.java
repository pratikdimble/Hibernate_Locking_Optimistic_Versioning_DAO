package com.pratik.user;

import com.pratik.DAO.DAO_Factory;
import com.pratik.DAO.DAO_Interface;
import com.pratik.utility.HibernateUtil;

public class ClientApp_User2 {

	public static void main(String[] args) {

			//use DAO
		DAO_Interface dao=DAO_Factory.getInstance();
		//get the DAO
			dao.user2();
			//close the session factory
			HibernateUtil.closeFactory();
	}
	

}
