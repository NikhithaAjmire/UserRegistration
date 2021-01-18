package com.userreg.userregis;
import org.junit.Assert;
import org.junit.Test;
public class UserRegTestCases {
	
	    UserReg userReg = new UserReg();
	    @Test
	    public void valFirstName(){
	        String Str1 = userReg.nameVal("Nikhitha");
	        String Str2 = userReg.nameVal("Nikhil");
	        String Str3 = userReg.nameVal("Pradeep");
	        String Str4 = userReg.nameVal("@Pranay");
	        
	        Assert.assertEquals("Valid",Str1);
	        Assert.assertEquals("Valid",Str2);
	        Assert.assertEquals("Valid",Str3);
	        Assert.assertEquals("Invalid",Str4);
	        

	    }

	    @Test
	    public void valLastName(){
	        String Str1 = userReg.nameVal("Gali");
	        String Str2 = userReg.nameVal("Kalwakunta");
	        String Str3 = userReg.nameVal("Kulkarni");
	        String Str4 = userReg.nameVal("$ista");
	       
	        Assert.assertEquals("Valid",Str1);
	        Assert.assertEquals("Valid",Str2);
	        Assert.assertEquals("Valid",Str3);
	        Assert.assertEquals("Invalid",Str4);
	        
	    }

	    @Test
	    public void valEmail(){
	        String valStr1 = userReg.emailVal("nikki@gmail.com");
	        String valStr2 = userReg.emailVal("nikki121@yahoo.com");
	        String valStr3 = userReg.emailVal("nikki-198@yahoo.com");
	        String valStr4 = userReg.emailVal("nikki@ajm.com");
	        String valStr5 = userReg.emailVal("nikki-111@sunshine.com");
	        

	        String invalStr1 = userReg.emailVal("nikki@com.s");
	        String invalStr2 = userReg.emailVal("nikki@.com.");
	        String invalStr3 = userReg.emailVal("nikki123@gmail..");
	        String invalStr4 = userReg.emailVal("nikki333-123@.com");
	        String invalStr5 = userReg.emailVal("nikki123@..com.com");
	        String invalStr6 = userReg.emailVal(".nikki.com");
	        

	        Assert.assertEquals("Valid",valStr1);
	        Assert.assertEquals("Valid",valStr2);
	        Assert.assertEquals("Valid",valStr3);
	        Assert.assertEquals("Valid",valStr4);
	        Assert.assertEquals("Valid",valStr5);
	       

	        Assert.assertEquals("Invalid",invalStr1);
	        Assert.assertEquals("Invalid",invalStr2);
	     
	        Assert.assertEquals("Invalid",invalStr3);
	        Assert.assertEquals("Invalid",invalStr4);
	        Assert.assertEquals("Invalid",invalStr5);
	        Assert.assertEquals("Invalid",invalStr6);
	       
	    }

	    @Test
	    public void valPhno(){
	        String String1 = userReg.mobileNumVal("91 7523419667");
	        String String2 = userReg.mobileNumVal("376 776921547");
	        String String3 = userReg.mobileNumVal("1 7525988111");
	        String String4 = userReg.mobileNumVal("92 09045 598");
	        String String5 = userReg.mobileNumVal("886 95555 444751");

	        Assert.assertEquals("Valid",String1);
	        Assert.assertEquals("Valid",String2);
	        Assert.assertEquals("Valid",String3);
	        Assert.assertEquals("Invalid",String4);
	        Assert.assertEquals("Invalid",String5);
	    }

	    @Test
	    public void valPwd(){
	        String testString1 = userReg.pwdVal("namaslay$1333");
	        String testString2 = userReg.pwdVal("Nolanjourney@444");
	        String testString3 = userReg.pwdVal("kumarsambhav&789");
	        String testString4 = userReg.pwdVal(".Kalyan87@");
	        String testString5 = userReg.pwdVal("fqyu#12####We");

	        Assert.assertEquals("Valid",testString1);
	        Assert.assertEquals("Valid",testString2);
	        Assert.assertEquals("Valid",testString3);
	        Assert.assertEquals("Invalid",testString4);
	        Assert.assertEquals("Invalid",testString5);
	    }
	}

