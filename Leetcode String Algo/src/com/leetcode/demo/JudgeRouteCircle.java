package com.leetcode.demo;

//Initially, there is a Robot at position (0, 0).
//Given a sequence of its moves, judge if this robot makes a circle,
//which means it moves back to the original place.
//The move sequence is represented by a string. And each move is represent by a character.
//The valid robot moves are R (Right), L (Left), U (Up) and D (down). 
//The output should be true or false representing whether the robot makes a circle.
//
//Example 1:
//Input: "UD"
//Output: true
//Example 2:
//Input: "LL"
//Output: false

public class JudgeRouteCircle {


	private static boolean judgeCircle(String moves) {
		int varU =0 , varL =0 , varR=0, varD=0; 
		for (int i = 0; i < moves.length(); i++) {
			
			if(moves.charAt(i)=='U') varU++; 
			else if(moves.charAt(i)=='D') varD++;
			else if(moves.charAt(i)=='L') varL++; 
			else if(moves.charAt(i)=='R') varR++; 
			else {
				System.out.println("make sure the lettres are L,R,D,ou U");
				return false;
			}
			
		}
		
		
		return ((varU==varD)&&(varL==varR));
	}

	public static void main(String[] args) {
		System.out.println(judgeCircle("DLLDRRUU"));
	}
	
	
//    public boolean judgeCircle(String moves) {
//        int UD = 0;
//        int LR = 0;
//        for(int i = 0; i < moves.length(); i++) {
//            if(moves.charAt(i) == 'U') {
//                UD++;
//            } else if(moves.charAt(i) == 'D') {
//                UD--;
//            } else if(moves.charAt(i) == 'L') {
//                LR++;
//            } else if(moves.charAt(i) == 'R') {
//                LR--;
//            }
//        }
//        
//        return UD == 0 && LR == 0;
//    }
}
