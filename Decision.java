/**
 * 
 */

/**
 * @author m_white
 *
 */
import java.io.*;
public class Decision {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 simpleif();
		 System.out.print("\n");
		 simpleIfElse();
		 System.out.print("\n");
		 simpleIfElseIf();
	}
	
	public static void simpleif(){
		
		int x = 10;

	      if( x < 20 ){
	         System.out.print("This is if statement boo ya");
	      }
	}
	
	public static void simpleIfElse(){
		
		int x = 30;

	      if( x < 20 ){
	         System.out.print("This is if statement");
	      }else{
	         System.out.print("This is else statement");
	      }
	   }		
	
	public static void simpleIfElseIf() {
		
		int x = 30;

	      if( x == 10 ){
	         System.out.print("Value of X is 10");
	      }else if( x == 20 ){
	         System.out.print("Value of X is 20");
	      }else if( x == 30 ){
	         System.out.print("Value of X is 30 I got here");
	      }else{
	         System.out.print("This is else statement");
	      }
	   }		
	}
	
	

