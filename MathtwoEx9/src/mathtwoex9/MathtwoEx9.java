package mathtwoex9;
import java.io.*;

public class MathtwoEx9 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		double R = Double.parseDouble(br.readLine()); // ������ R
	
		System.out.println(R * R * Math.PI);	// ��Ŭ���� ���� ����
		System.out.println(2 * R * R);		// �ýñ����� ���� ����

	}

}