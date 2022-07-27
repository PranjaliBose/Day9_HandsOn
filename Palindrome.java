
public class Palindrome 
{
	public boolean palindromeCheck(String s)
	{
		s=s.toLowerCase();
		int count=s.length();
		boolean isPalindrome=true;
		
		int range=count/2;
		if(count%2==0)
			range--;
		
		for(int i=0;i<=range;i++)
		{
			if(s.charAt(i)!=s.charAt(count-i-1)) isPalindrome=false;
		}
		return isPalindrome;
	}
}
