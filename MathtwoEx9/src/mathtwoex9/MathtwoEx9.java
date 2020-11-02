package mathtwoex9;
import java.io.*;

public class MathtwoEx9 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		double R = Double.parseDouble(br.readLine()); // 반지름 R
	
		System.out.println(R * R * Math.PI);	// 유클리드 원의 넓이
		System.out.println(2 * R * R);		// 택시기하학 원의 넓이

	}

}