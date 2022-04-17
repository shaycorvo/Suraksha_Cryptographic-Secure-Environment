import java.io.*;
public class MonoSubstitutionCipher
{
	private String key;
	private String referenceString;
	private String alphabets ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public MonoSubstitutionCipher(String key)
	{
		this.key = key.trim();
		referenceString = getReferenceString();
	}
	private String getReferenceString()
	{
		String ref = "";
		key = key.toUpperCase();
		key = removeAllCharacters(key,' ');
		final char upperA = 'A';
		final char upperZ = 'Z';
		// removing repeated characters from the key
		while(hasRepeatedCharacters(key))
		 key = removeRepeatedChars(key);
		System.out.println(key);
		ref = key;

		char first = ref.charAt(ref.length() -1);

		int len = key.length();
		len = 26 - len;
		for(int i=0;ref.length()<27;i++)//i<=len
		{
			if(ref.indexOf(first) < 0)// if it is not a repeated character
			{						  // add it to the string ref.
				if(first > upperZ)
				{
				first = (char) (first - upperZ);
				first = (char) ((upperA + first)-1);
				ref += first;
				}
				else// adjust it to repeat characters after Z
				{
				 ref += first;
				}
			}
			first ++; // increment first

		}//for

		return removeRepeatedChars(ref);
	}


	public String code(String message)
	{
		return message;
		
	}

	public String decode(String coded)
	{
		return coded;
		
	}


	private boolean hasRepeatedCharacters(String key)
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

   private String removeRepeatedChars(String message)
   {
	return message;
	  
   }

   public static void main(String [] args)
   {
	   MonoSubstitutionCipher mc = new MonoSubstitutionCipher("ALIALONGLEGS");
	   String coded = mc.code("This text is to demonstrate the working of this class:");
	   System.out.println(coded);
	   String decoded = mc.decode(coded);
	   System.out.println(decoded);


   }

   private String removeCharacter(String message,char ch,int index)
     {
		return message;
   	     
     }

     private String removeAllCharacters(String message,char ch)
	 {
		return message;
	    	  
     }

  private int[] indexesOf(String message,char ch,int fromIndex)
  {
	return null;
	  
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

}