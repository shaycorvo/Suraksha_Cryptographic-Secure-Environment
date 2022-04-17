 import javax.swing.*;
 import java.io.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.util.*;
 import javax.swing.event.*;
 import javax.swing.colorchooser.*;
 import javax.swing.text.*;
 import java.awt.print.*;
 import java.applet.*;
 import java.net.*;	  
 							  






 public class Kpad extends JFrame
 {
  // constructor ends



 public boolean hasRepeatedCharacters(String key)
  	{
 		//System.out.println(key);
  		boolean repeated = false;
  		key = key.toUpperCase();
  		for(int i=0;i<(key.length()-1);i++)
  		 {
  			 for(int j=i+1;j<key.length();j++)
  			 {
  				 if(key.charAt(i)==key.charAt(j))
  				 {
  				 repeated = true;
  			 	}
  			 }
  		 }
  		 return repeated;
	}

 private void doVigenereCipher()
 {
	 
 }


 private void doVigenereDecipher()
 {

 }


 private void doMonoSubstitutionCipher()
 {
	 
 }

 private void doMonoSubstitutionDecipher()
 {
	
 }


 private void playChimesSound()
 {

 }


 private void doCeaserAnalysis()
 {
	
 }
 
public static void main(String args[])
{
	

}
}

