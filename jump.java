public class jump{

	public static int get_path(int[] A){
		int index=0;
		int total_path=0;


		if(A.length > 3)
		{
			int next_col = A[index+1];
			int next_col2 = A[index+2];

			if(next_col < next_col2)
			{
				index+=1;
				total_path+=next_col;
			}

			else if(next_col2 < next_col)
			{
				index+=2;
				total_path+=next_col2;
			}

			int[] new_A = new int[A.length - index];
			for(int i=0; i<new_A.length; i++)
				new_A[i] = A[index+i];

			return total_path + get_path(new_A);
		}
		else
		{
			int last_el = A[A.length-1];
			return total_path = last_el;
		}
	}

	public static void main(String[] args) {
		int[] A = {0, 3, 80, 6, 57, 10};

		int total_cost = get_path(A);

		System.out.println("The total cost of this board is " + total_cost);
	}
}