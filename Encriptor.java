import java.io.*;
import java.util.*;

public class Encriptor
{

	 private char key;
	  private String substitutionKey;
	  private Hashtable codeTable  = new Hashtable(26);
	  private Hashtable decodeTable = new Hashtable(26);

 public Encriptor(char c)//constructor
 {
 
 }

 public void setCharKey(char key)
 {
	 this.key = key;
 }

 public void setSubstitutionKey(String key)
 {
	 this.substitutionKey = key;
 }

public void writeBytes(String s,File file) throws FileNotFoundException
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
		 catch(IOException eeio){}
	 }
	 catch(IOException eio)
	 {
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

public String codeCaeser(String s)
  {
    char[] cArray = s.toCharArray();

	char upperA = 'A';
	char upperKey = Character.toUpperCase(key);
	char offset = (char) (upperKey - upperA);

    for(int i=0;i<cArray.length;i++)
    {
		if(Character.isLowerCase(cArray[i])||Character.isUpperCase(cArray[i]))
		{
			cArray[i] = codeCharacter(cArray[i],offset);

		}

	}

	return new String(cArray);
 }

public String decodeCaeser(String s)
{
	char[] cArray = s.toCharArray();
	char upperA = 'A';
	char upperKey = Character.toUpperCase(key);
	char offset = (char) (upperKey - upperA);


	for(int i=0;i<cArray.length;i++)
	    {
			if(Character.isLowerCase(cArray[i])||Character.isUpperCase(cArray[i]))
			{
				cArray[i] = deCodeCharacter(cArray[i],offset);
			}
		}
		return new String(cArray);
}

private char codeCharacter(char ch,char offset)
 {
	return offset;
	  
}

private char deCodeCharacter(char ch,char offset)
{
	return offset;
	
}

public String codeSubstitutionCipher(String s)
{
	return s;
  
}

public String decodeSubstitutionCipher(String s)
{
	return s;
  
}

private char codeSubstitutionCharacter(char ch)
{
	return ch;
	
}

private char decodeSubstitutionCharacter(char ch)
{
	return ch;
	
}


public boolean hasRepeatedCharacters(String key)
{
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
}// end class









