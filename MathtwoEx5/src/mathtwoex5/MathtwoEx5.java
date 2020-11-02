package mathtwoex5;
import java.io.*;

public class MathtwoEx5 {
	
	/* false : �Ҽ�
	range : 0 ~ 10000 */
	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		get_prime();
 
		int T = Integer.parseInt(br.readLine());	// �׽�Ʈ���̽�
 
		while (T-- > 0) 
		{
			int n = Integer.parseInt(br.readLine());
			int first_partition = n / 2;
			int second_partition = n / 2;
 
			while (true) 
			{
            
				// �� ��Ƽ���� ��� �Ҽ��� ���
				if (!prime[first_partition] && !prime[second_partition]) 
				{
					sb.append(first_partition).append(' ').append(second_partition).append('\n');
					break;
				}
				first_partition--;
				second_partition++;
			}
		}
		System.out.print(sb);

	}
	
	// �����佺�׳׽��� ü
		public static void get_prime() 
		{
			prime[0] = prime[1] = true;
	 
			for (int i = 2; i <= Math.sqrt(prime.length); i++) 
			{
				if (prime[i])
					continue;
				for (int j = i * i; j < prime.length; j += i) 
				{
					prime[j] = true;
				}
			}
		}

}