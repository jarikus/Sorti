
import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Random rand = new Random(); 
		int n = rand.nextInt(30); //���������� ������ ������� � ������� 30 ��������
		System.out.println ("������ ������� " + n); 

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(n); //��������� ������
			System.out.println(array[i]);
		}

	}

}
