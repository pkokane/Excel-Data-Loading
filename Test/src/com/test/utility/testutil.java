package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class testutil {
	
	static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel() {
	
		ArrayList<Object[]> myData =new ArrayList<Object[]>();
		
		try {
			reader = new Xls_Reader("D:\\Eclipse\\Workspace\\Test\\src\\com\\excel\\file\\Test.xlsx");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
				
		for(int rowNum=2;rowNum<=reader.getRowCount("Data");rowNum++)
		{
		
			String firstname=reader.getCellData("Data", "firstname", rowNum);
			String lastname=reader.getCellData("Data", "lastname", rowNum);
			String email=reader.getCellData("Data", "email", rowNum);
			
			Object ob[]= {firstname,lastname,email};
			myData.add(ob);
		}
		return myData;
		}
		
	}
	


