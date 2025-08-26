package com.BasicData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader extends BRMSCommonMethods {
	
	private static Properties properties;
	private String propath = "C:\\Users\\vaishnavi.t\\eclipse-workspace\\BRMS2.0\\Resources\\BRMS.properties";

	public ConfigurationReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propath);
		}		
		
	}
	
	public static String geturl() {
		
		String url = properties.getProperty("url");
		if(url!=null)
		return url;
		else 
			throw new RuntimeException("the url is not found in configured file ");	
	}
    public static String getadmin() {
		
		String admin = properties.getProperty("admin");
		if(admin!=null)
		return admin;
		else 
			throw new RuntimeException("the admin is not found in configured file ");	
	}
    public static String getinitiator() {
		
		String initiator = properties.getProperty("initiator");
		if(initiator!=null)
		return initiator;
		else 
			throw new RuntimeException("the initiator is not found in configured file ");	
	}
    public static String getQAHOD() {
		
		String QAHOD = properties.getProperty("QAHOD");
		if(QAHOD!=null)
		return QAHOD;
		else 
			throw new RuntimeException("the QAHOD is not found in configured file ");	
	}
    
    public static String getQADoccell() {
		
		String QADoccell = properties.getProperty("QADoccell");
		if(QADoccell!=null)
		return QADoccell;
		else 
			throw new RuntimeException("the QADoccell is not found in configured file ");	
	}
    public static String getpassword() {
		
		String password = properties.getProperty("password");
		if(password!=null)
		return password;
		else 
			throw new RuntimeException("the password is not found in configured file ");	
	}
   public static String getpasswordexp() {
		
		String passwordexp = properties.getProperty("passwordexp");
		if(passwordexp!=null)
		return passwordexp;
		else 
			throw new RuntimeException("the passwordexp is not found in configured file ");	
	}
   public static String getinvalidattempts() {
		
		String invalidattempts = properties.getProperty("invalidattempts");
		if(invalidattempts!=null)
		return invalidattempts;
		else 
			throw new RuntimeException("the invalidattempts is not found in configured file ");	
	}
   
   public static String getpasswordexpalert() {
		
		String passwordexpalert = properties.getProperty("passwordexpalert");
		if(passwordexpalert!=null)
		return passwordexpalert;
		else 
			throw new RuntimeException("the passwordexpalert is not found in configured file ");	
	}
   public static String getminlength() {
		
		String minlength = properties.getProperty("minlength");
		if(minlength!=null)
		return minlength;
		else 
			throw new RuntimeException("the minlength is not found in configured file ");	
	}
   public static String getenforcepasswordhistory() {
		
		String enforcepasswordhistory = properties.getProperty("enforcepasswordhistory");
		if(enforcepasswordhistory!=null)
		return enforcepasswordhistory;
		else 
			throw new RuntimeException("the enforcepasswordhistory is not found in configured file ");	
	}
   public static String getminuppercase() {
		
		String minuppercase = properties.getProperty("minuppercase");
		if(minuppercase!=null)
		return minuppercase;
		else 
			throw new RuntimeException("the minuppercase is not found in configured file ");	
	}
   public static String getminlowercase() {
		
		String minlowercase = properties.getProperty("minlowercase");
		if(minlowercase!=null)
		return minlowercase;
		else 
			throw new RuntimeException("the minlowercase is not found in configured file ");	
	}
   public static String getmindigits() {
		
		String mindigits = properties.getProperty("mindigits");
		if(mindigits!=null)
		return mindigits;
		else 
			throw new RuntimeException("the mindigits is not found in configured file ");	
	}
   public static String getminspecial() {
		
		String minspecial = properties.getProperty("minspecial");
		if(minspecial!=null)
		return minspecial;
		else 
			throw new RuntimeException("the minspecial is not found in configured file ");	
	}
   public static String getcomments() {
		
		String comments = properties.getProperty("comments");
		if(comments!=null)
		return comments;
		else 
			throw new RuntimeException("the comments are not found in configured file ");	
	}
   public static String getreturncomments() {
		
		String returncomments = properties.getProperty("returncomments");
		if(returncomments!=null)
		return returncomments;
		else 
			throw new RuntimeException("the returncomments are not found in configured file ");	
	}
   public static String getapprovalcomments() {
		
		String approvalcomments = properties.getProperty("approvalcomments");
		if(approvalcomments!=null)
		return approvalcomments;
		else 
			throw new RuntimeException("the approvalcomments are not found in configured file ");	
	}
   public static String getrejectedcomments() {
		
		String rejectedcomments = properties.getProperty("rejectedcomments");
		if(rejectedcomments!=null)
		return rejectedcomments;
		else 
			throw new RuntimeException("the rejectedcomments are not found in configured file ");	
	}
   public static String getdepartment() {
		
		String department = properties.getProperty("department");
		if(department!=null)
		return department;
		else 
			throw new RuntimeException("the department is not found in configured file ");	
	}
   public static String getrole() {
		
		String role = properties.getProperty("role");
		if(role!=null)
		return role;
		else 
			throw new RuntimeException("the role is not found in configured file ");	
	}
   public static String getQAIncharge() {
		
		String QAIncharge = properties.getProperty("QAIncharge");
		if(QAIncharge!=null)
		return QAIncharge;
		else 
			throw new RuntimeException("the QAIncharge is not found in configured file ");	
	}
   public static String getproductionincharge() {
		
		String productionincharge = properties.getProperty("productionincharge");
		if(productionincharge!=null)
		return productionincharge;
		else 
			throw new RuntimeException("the productionincharge is not found in configured file ");	
	}
   public static String getproductionhod() {
		
		String productionhod = properties.getProperty("productionhod");
		if(productionhod!=null)
		return productionhod;
		else 
			throw new RuntimeException("the productionhod is not found in configured file ");	
	}
   public static String getTechtransfer() {
		
		String Techtransfer = properties.getProperty("Techtransfer");
		if(Techtransfer!=null)
		return Techtransfer;
		else 
			throw new RuntimeException("the Techtransfer is not found in configured file ");	
	}
   public static String getRA() {
		
		String RA = properties.getProperty("RA");
		if(RA!=null)
		return RA;
		else 
			throw new RuntimeException("the RA is not found in configured file ");	
	}
   public static String getQAOfficer() {
		
		String QAOfficer = properties.getProperty("QAOfficer");
		if(QAOfficer!=null)
		return QAOfficer;
		else 
			throw new RuntimeException("the QAOfficer is not found in configured file ");	
	}
   public static String getvalidationincharge() {
		
		String validationincharge = properties.getProperty("validationincharge");
		if(validationincharge!=null)
		return validationincharge;
		else 
			throw new RuntimeException("the validationincharge is not found in configured file ");	
	}
   public static String getprodexe() {
		
		String prodexe = properties.getProperty("prodexe");
		if(prodexe!=null)
		return prodexe;
		else 
			throw new RuntimeException("the prodexe is not found in configured file ");	
	}
   public static String getIPQA() {
		
		String IPQA = properties.getProperty("IPQA");
		if(IPQA!=null)
		return IPQA;
		else 
			throw new RuntimeException("the IPQA is not found in configured file ");	
	}
   public static String getinitiatorcomments() {
		
		String initiatorcomments = properties.getProperty("initiatorcomments");
		if(initiatorcomments!=null)
		return initiatorcomments;
		else 
			throw new RuntimeException("the initiatorcomments is not found in configured file ");	
	}
   public static String getissuedcomments() {
		
 		String issuedcomments = properties.getProperty("issuedcomments");
 		if(issuedcomments!=null)
 		return issuedcomments;
 		else 
 			throw new RuntimeException("the issuedcomments is not found in configured file ");	
 	}
   public static String getprintcomments() {
		
 		String printcomments = properties.getProperty("printcomments");
 		if(printcomments!=null)
 		return printcomments;
 		else 
 			throw new RuntimeException("the printcomments is not found in configured file ");	
 	}
   public static String getdepartment1() {
		
		String department1 = properties.getProperty("department1");
		if(department1!=null)
		return department1;
		else 
			throw new RuntimeException("the department1 is not found in configured file ");	
	}
   public static String getrole1() {
		
		String role1 = properties.getProperty("role1");
		if(role1!=null)
		return role1;
		else 
			throw new RuntimeException("the role1 is not found in configured file ");	
	}
   public static String getrole2() {
		
		String role2 = properties.getProperty("role2");
		if(role2!=null)
		return role2;
		else 
			throw new RuntimeException("the role2 is not found in configured file ");	
	}
   public static String getprocesstype() {
		
		String processtype = properties.getProperty("processtype");
		if(processtype!=null)
		return processtype;
		else 
			throw new RuntimeException("the processtype is not found in configured file ");	
	}
   public static String getformatnumber1() {
		
		String formatnumber1 = properties.getProperty("formatnumber1");
		if(formatnumber1!=null)
		return formatnumber1;
		else 
			throw new RuntimeException("the formatnumber1 is not found in configured file ");	
	}

   public static String getformatgroup() {
		
		String formatgroup = properties.getProperty("formatgroup");
		if(formatgroup!=null)
		return formatgroup;
		else 
			throw new RuntimeException("the formatgroup is not found in configured file ");	
	}
   public static String getformattitle() {
		
		String formattitle = properties.getProperty("formattitle");
		if(formattitle!=null)
		return formattitle;
		else 
			throw new RuntimeException("the formattitle is not found in configured file ");	
	}
   public static String getformatnumber() {
		
		String formatnumber = properties.getProperty("formatnumber");
		if(formatnumber!=null)
		return formatnumber;
		else 
			throw new RuntimeException("the formatnumber is not found in configured file ");	
	}
    
}
