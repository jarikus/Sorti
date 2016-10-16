
import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Random rand = new Random(); 
		int n = rand.nextInt(30); //Генерируем размер массива в пределе 30 значений
		System.out.println ("Размер массива " + n); 

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(n); //Заполняем массив
			System.out.println(array[i]);
		}

	}

}
