package com.test.choose;

import java.util.ArrayList;
import java.util.HashMap;

public class EnumOne {
	
	public static void main(String[]args)
    {
        System.out.println(AccountType.FIXED);
    }
	
	
	enum AccountType
	{
	    SAVING, FIXED, CURRENT;
	    private AccountType()
	    {
	        System.out.println("It is a account type");
	    }
	}
}
