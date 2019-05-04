public class handshake{

	public static int total_number(int num){
		int sum;
		if(num==0)
			sum=0;
		else
			sum = (num-1) + total_number(num-1);

		return sum;
	}

	public static void main(String[] args) {
		int num_people=4;
		int total=0;
		total = total_number(num_people);
		System.out.println("There are a total of " + total + " handshakes for "
			+ num_people + " people.");
	}
}