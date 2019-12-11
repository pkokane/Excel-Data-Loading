package com.test.utility;

import java.io.File;

public class FileDownload {
	
	String downloadPath="C:\\Users\\SONY\\Downloads";
	
	
	//File Download check
	
	  public boolean isFileDownloaded(String downloadPath, String fileName) {
	  boolean flag = false; 
	  File dir = new File(downloadPath); 
	  File[] dir_contents= dir.listFiles();
	  
	  for (int i = 0; i < dir_contents.length; i++) { if
	  (dir_contents[i].getName().equals(fileName)) return flag=true; }
	  
	  return flag; }
	 
	//File Ext check
	  private boolean isFileDownloaded_Ext(String dirPath, String ext){
			boolean flag=false;
		    File dir = new File(dirPath);
		    File[] files = dir.listFiles();
		    if (files == null || files.length == 0) {
		        flag = false;
		    }
		    
		    for (int i = 1; i < files.length; i++) {
		    	if(files[i].getName().contains(ext)) {
		    		flag=true;
		    	}
		    }
		    return flag;
		}
	  
	  
	  
	  /* Get the latest file from a specific directory*/
		private File getLatestFilefromDir(String dirPath){
		    File dir = new File(dirPath);
		    File[] files = dir.listFiles();
		    if (files == null || files.length == 0) {
		        return null;
		    }
		
		    File lastModifiedFile = files[0];
		    for (int i = 1; i < files.length; i++) {
		       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
		           lastModifiedFile = files[i];
		       }
		    }
		    return lastModifiedFile;
		}
	  
	  

}
