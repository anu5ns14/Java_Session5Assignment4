package com.learning.exceptionHandling;

public class NumberFormatExample {
		public static void main(String[] args) {
			try{
				
				String str = "Anurag";
				int num = Integer.parseInt(str);
				
				System.out.println("Number is: "+num);
			}
			
			catch(NumberFormatException e){
				System.out.println("Cannot format string to int "+e);
			}
		}
	}

