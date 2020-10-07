package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public DaoFactory() {
	}
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
