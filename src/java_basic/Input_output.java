package java_basic;
import java.util.Scanner;
public class Input_output {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int i = sc.nextInt();
		System.out.println("입력된 정수는 "+i+"입니다.");
		sc.close();
	}

}
