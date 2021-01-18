package com.userreg.userregis;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserReg {
	
		

		
		    public static void main(String[] args) throws Exception {
		        Scanner scanner = new Scanner(System.in);
		        UserReg userReg = new UserReg();

		        System.out.println("Welcome All");
		        System.out.println("Enter First Name: ");
		        userReg.nameVal(scanner.next());
		        System.out.println("Enter Last Name: ");
		        userReg.nameVal(scanner.next());
		        System.out.println("Enter Email id: ");
		        userReg.emailVal(scanner.next());
		        scanner.nextLine();
		        System.out.println("Enter Phone Number: ");
		        userReg.mobileNumVal(scanner.nextLine());
		        System.out.println("Enter Password: ");
		        userReg.pwdVal(scanner.next());
		        scanner.close();
		    }

		    public String nameVal(String name) {
		        if (Pattern.matches("[A-Z][a-z]{2}[a-z]*", name)) {
		            System.out.println("The given name is valid");
		            return "Valid";
		        } else {
		            System.out.println("The given name is Invalid");
		            return "Invalid";
		        }
		    }

		    public String emailVal(String name) {
		        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
		        if (Pattern.matches(regex, name)) {
		            System.out.println("The given email id is valid");
		            return "Valid";
		        } else {
		            System.out.println("The given email id is not valid");
		            return "Invalid";
		        }
		    }

		    public String mobileNumVal(String num) {
		        if (Pattern.matches("^[1-9]{1,3}[ ]{1}[1-9]{1}[0-9]{9}$", num)) {
		            System.out.println("The given phone number is valid.");
		            return "Valid";
		        } else {
		            System.out.println("The given phone number is not valid.");
		            return "Invalid";
		        }
		    }

		    public String pwdVal(String pwdString) {
		        if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-d+=()])(?=\\S+$).{8,20}$", pwdString)) {
		            System.out.println("The given Password is valid");
		            return "Valid";
		        } else {
		            System.out.println("The given password is invalid");
		            return "Invalid";
		        }
		    }
		}



