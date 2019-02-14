package NewPackage;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class TC_001_FIFO_Reading_Excel_Data {
	
	public static void main(String[] args) throws FilloException {
		
		//String filePath=System.getProperty("user.dir") + "//TestData//CustomerData.xlxs"));
		String filePath=System.getProperty("user.dir") + "//TestData//CustomerData.xlsx";
		System.out.println(filePath);
		Fillo fillo = new Fillo();
		
		Connection connection=fillo.getConnection(filePath);
		 String strQuery="Select * from Data where Customer_ID in ('CUST_001','CUST_002')";
		 Recordset recordset=connection.executeQuery(strQuery);
		 
		 while(recordset.next()){
			  System.out.println(recordset.getField("Department"));
			  System.out.println(recordset.getField("Customer_ID"));
			  System.out.println(recordset.getField("Customer_Name"));
			  System.out.println(recordset.getField("Salary"));
			 }

			  recordset.close();
			 connection.close();
			}
		
	

}
