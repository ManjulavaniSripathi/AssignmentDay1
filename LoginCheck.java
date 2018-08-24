package com.day2;

	public class LoginCheck {
		public static String checkLoginDetails(String userId, String Password) {
			String name="Manju" , passwd = "3333abc";
			String valid ="";
			String notValid="";
			if(userId.equals(name) && Password.equals(passwd)) {
				valid = "Welcome";
				return valid;
			}
			notValid = "Invalid Credentials, Contact the Admin";
			return notValid;
					
		}

	}


