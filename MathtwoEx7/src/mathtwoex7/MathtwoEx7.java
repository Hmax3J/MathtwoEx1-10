package mathtwoex7;
import java.io.*;
import java.util.*;

public class MathtwoEx7 {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		int[] coord_1 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine()," ");
		int[] coord_2 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine()," ");
		int[] coord_3 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
 
		
		
		int x;
		int y;
 
		// x ��ǥ ��
		// 1�� x��ǥ�� 2�� x��ǥ ��
		if (coord_1[0] == coord_2[0]) 
		{
			x = coord_3[0];
		}
		// 1�� x��ǥ�� 3�� x��ǥ ��
		else if (coord_1[0] == coord_3[0]) 
		{
			x = coord_2[0];
		}
		// 2�� x��ǥ�� 3�� x��ǥ ��
		else 
		{
			x = coord_1[0];
		}
 
		// y ��ǥ ��
		// 1�� x��ǥ�� 2�� x��ǥ ��
		if (coord_1[1] == coord_2[1]) 
		{
			y = coord_3[1];
		}
		// 1�� x��ǥ�� 3�� x��ǥ ��
		else if (coord_1[1] == coord_3[1]) 
		{
			y = coord_2[1];
		}
		// 2�� x��ǥ�� 3�� x��ǥ ��
		else 
		{
			y = coord_1[1];
		}
		
		System.out.println(x + " " + y);

	}

}