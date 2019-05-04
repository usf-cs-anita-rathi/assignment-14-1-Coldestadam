public class question3{

	public static boolean contains(String haystack, String needle)
	{
		char[] hay_arr = haystack.toCharArray();
		char[] needle_arr = needle.toCharArray();

		if(needle_arr.length > 1)
		{
			int index = 0;
			boolean match=false;
			String letter = "";
			letter+=needle_arr[0];

			for(int i=0; i<hay_arr.length; i++)
			{
				String letter2 = "";
				letter2 += hay_arr[i];
				if((letter.equals(letter2)) && (match==false))
				{
					index=i;
					match=true;
				}
			}

			if(match)
			{
				char[] new_hay = new char[hay_arr.length-1-index];
				char[] new_need = new char[needle_arr.length-1];

				for(int i=0; i<new_hay.length; i++)
					new_hay[i] = hay_arr[index+1+i];

				for(int i=0; i<new_need.length; i++)
					new_need[i] = needle_arr[i+1];

				String new_haystack = new String(new_hay);
				String new_needle = new String(new_need);

				return true && contains(new_haystack, new_needle);
			}

			else
				return false;
		}

		else
		{
			int index = 0;
			String letter = "";
			letter+=needle_arr[0];
			boolean match=false;
			String letter2 = "";
			letter2+=hay_arr[0];

			if(letter.equals(letter2))
				match=true;

			return match;
		}

	}

	public static void main(String[] args) {
		System.out.println(contains("Java programming", "ogr"));
		System.out.println(contains("Java programming", "grammy"));
	}
}