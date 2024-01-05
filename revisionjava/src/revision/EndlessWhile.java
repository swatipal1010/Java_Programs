package revision;

public class EndlessWhile {

	public static void main(String[] args) {
		int n = 1, sum = 0;
		
		while(true)		//ENDLESS WHILE LOOP
		{
			sum += n;
			if(sum>50)
				break;		//EXIT FROM LOOP
			n = n+1;
		}
		System.out.println("n = "+ n + " sum = "+ sum);
	}

}
