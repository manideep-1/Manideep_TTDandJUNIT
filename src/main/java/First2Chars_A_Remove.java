
public class First2Chars_A_Remove {
	
	public String removeFirst2Chars_A(String s) {
		StringBuilder result=new StringBuilder(s);
		if(s.length()>0 && s.charAt(0)=='A')
		{
			result.deleteCharAt(0);
			if(s.length()>1 && s.charAt(1)=='A')
			{
				result.deleteCharAt(0);
			}
		}
		
		else if(s.length()>1 && s.charAt(1)=='A')
		{
			result.deleteCharAt(1);
		}
		return result.toString();
	}

}
