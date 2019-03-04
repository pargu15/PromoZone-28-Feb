	package com.PromoZone.Utilities;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	
	public class DatabaseConnection {
	 Connection connection = null;
	 Statement statement = null;
	 ResultSet rs = null;

	 
	 String conUrl = "jdbc:sqlserver://localhost" + "; databaseName=" + "GopadDevelopment"
	   + "; integratedSecurity=true;";
	 
	 public String getOTP() 
	 {
		 String OTP = "";
	  try 
	  {
	
	 //   connection = DriverManager.getConnection("jdbc:sqlserver://zsdb.zippslip.com; databaseName = ZippSlip","parag","Parag15#jain");
	connection = DriverManager.getConnection("jdbc:sqlserver://test.zippslip.com; databaseName = zippslip58","parag","Parag15#jain");
	  // connection = DriverManager.getConnection(conUrl);
	   statement = connection.createStatement();
	   String sql = "select top 1 * from otp order by CreatedOn desc";
	   
	    rs =  statement.executeQuery(sql);
	  
	   while(rs.next()) {
		   OTP= rs.getString("otp");
		   
		//   System.out.println(OTP);
		
		   }
	
	   
	   //	   logger.debug("Enrollment Code inserted successfully: " + enrollmentCode);
	  } 
	  catch (Exception e) 
	  {
		  System.out.println(e);
	//	   logger.debug("Exception Occurred: " + e);
		  }
		  finally 
		  {
		   if (connection != null)
		    try 
		    {
		     connection.close();
		    }
		    catch (Exception e) 
		    {
		    	System.out.println(e);
	  //   logger.debug("Exception Occurred: " + e);
		    }
		  }
	   return OTP;
		 }
	}
