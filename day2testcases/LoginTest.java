
package com.capgemini.day2testcases;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import com.day2.LoginCheck;


class LoginTest {

		@Test
		void testLogin() {
			assertEquals("Welcome", LoginCheck.checkLoginDetails("Manju", "3333abc"));
			assertEquals("Invalid Credentials, Contact the Admin", LoginCheck.checkLoginDetails("Manju", "33332abc"));
			
		}

	}