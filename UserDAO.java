package com.niit.ecomshopping.temp;

public class UserDAO {
	public boolean isValidCredentials(String id,String pwd)
	{
		if(id.equals("niit")&&pwd.equals("niit@123"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
