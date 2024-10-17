import java.util.Scanner;
public class CountWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner("My name is kashish.");
		int count = 0;
		while (sc.hasNext()){
			sc.next();
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}