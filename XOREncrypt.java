public class XOREncrypt
{
	static String encypting(String input)
	{
	int length = input.length();
	String Key = "thisisthekeyforhomeworktwo";
	
	char[] keyletter = Key.toCharArray();
	char[] inputletter = input.toCharArray();
	char[] cipherletter;
	
	for(int i = 0; i < length; i++)
		{
		cipherletter[i] = (char) (inputletter[i]^keyletter[i]);
		}
	
	String Ciphertext = new String(cipherletter);
	
	return Ciphertext;
	}
	
	public static void main(String[] args)
	{
		String plaintext = "This is for homework";
		String CipherString = encypting(plaintext);
		System.out.println(CipherString);
	}
}