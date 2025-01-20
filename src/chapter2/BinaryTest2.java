package chapter2;

public class BinaryTest2 {

	public static void main(String[] args) {
		
		int num1 = 0B00000000000000000000000000000101; // 이진수 5
		
		// 1의 보수를 취한 후, 1을 더해야 해당 양수를 음수로 바꿀 수 있다.
		
		int num2 = 0B11111111111111111111111111111011; // 이진수 -5
		
		int sum = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
		
	}

}
