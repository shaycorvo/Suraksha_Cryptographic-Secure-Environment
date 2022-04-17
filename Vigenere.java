
import java.io.*;

public class Vigenere
{
  String key; // string to hold the key
  public Vigenere(String key)
  {
	  this.key = key;
  }
 public String doVigenereCipher(String messageString)
 {
	 String kmap  = setKeyMap(key,messageString);
	 char[] keyArray = key.toCharArray();
	 char[] messageArray = messageString.toCharArray();
	 char[] keymapArray = kmap.toCharArray();
	 char[] codedArray = new char[messageArray.length];
	 for(int i=0;i<messageArray.length;i++)
	 {
		 if(Character.isUpperCase(messageString.charAt(i))||Character.isLowerCase(messageString.charAt(i)))
		  codedArray[i] = getCodedChar(messageArray[i],keymapArray[i]);
		 else
		  codedArray[i] = messageArray[i];
	 }
	 return new String(codedArray);
 }
 public String doVigenereDecipher(String coded)
 {
	 char[] codedArray = coded.toCharArray();
	 char[] keyArray = key.toCharArray();
	 String kmap = setKeyMap(key,coded);
	 char[] keymapArray = kmap.toCharArray();
	 char[] decodedArray = new char[coded.length()];
	 for(int i=0;i<codedArray.length;i++)
	 {
		if(Character.isUpperCase(coded.charAt(i))||Character.isLowerCase(coded.charAt(i)))
		  decodedArray[i] = getDecodedChar(codedArray[i],keymapArray[i]);
		 else
		  decodedArray[i] = codedArray[i];
	  }
	  return new String(decodedArray);
  }
  

 private char getCodedChar(char a,char b)
 {
	return b;										
	 
 }


 private char getDecodedChar(char a, char b) {
	return b;
	 
 }

 private String setKeyMap(String key,String message)
 {
	return message;
	 
 }
	 

 public static void main(String[] args)
 {

  String key = "ASADALI";
  System.out.println("The key is :"+ key +"\n");
  String message = "Hello This Text is to demonstrate the working of this class:";
  System.out.println("The message to encript is :\n" + message + "\n");
  Vigenere encriptor = new Vigenere(key);
  String coded = encriptor.doVigenereCipher(message);
  System.out.println("The coded message is : \n " + coded + " \n");
  String decoded = encriptor.doVigenereDecipher(coded);
  System.out.println("The decoded message is " + decoded + " \n");
 }
/**this function takes a String and a File object as arguments and write the string
*to the File as ASCII code bytes.
*/
 public void writeBytes(String s,File file) throws FileNotFoundException,IOException
 {
 	FileOutputStream fos = new FileOutputStream(file);
 	try{
 		fos.write(s.getBytes("ASCII"));
 		fos.close();
 	}
 	catch(UnsupportedEncodingException ex)
 	{
 		 try{
 			 fos.write(s.getBytes());
 			 fos.close();
 			 }
 		 catch(UnsupportedEncodingException ee){}

 	 }

 }

 public String readBytes(File file)throws FileNotFoundException,IOException
 {

 	byte[] theData;

 	FileInputStream fis = new FileInputStream(file);
 	theData  = new byte[fis.available()];
 	fis.read(theData);
 	fis.close();
   	 return new String(theData);
 }

}
