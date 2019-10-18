package com.leetcode.demo;
public class ValidPalindrome {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("ACDA"));
	}
	
	private static boolean isPalindrome(String s) {
		
		if(s.length()<2 || s==null) return true;
		
		
		for(int i=0 ; i<= (s.length()/2)+1;i++) {
			if(s.charAt(i)==s.charAt(s.length()-1-i))
				return true;
			
		}
		return false; 
		
	}
	
	
//    private static boolean isPalindrome(String s) {
//    	
//        int left = 0;
//        int right = s.length() - 1;
//        
//        while(left < right) {
//            while(!Character.isLetterOrDigit(s.charAt(left)) && left < right) {
//                left++;
//            }
//
//            while(!Character.isLetterOrDigit(s.charAt(right)) && right > left) {
//                right--;
//            }
//            
//            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                return false;
//            }
//            
//            left++;
//            right--;
//        }
//        
//        return true;
//    }
}
