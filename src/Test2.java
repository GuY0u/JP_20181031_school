
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int[] list;
		int sum = 0, count;
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ ����: ");
			count = sc.nextInt();
			list = new int[count];
			
			for(int i=0; i<count; i++) {
				System.out.print("������ �Է��Ͻÿ�: ");
				list[i] = sc.nextInt();
			}
			for(int i=0; i<count; i++) {
				sum += list[i];
			}
			System.out.println("�����: " + sum/count);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(NegativeArraySizeException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
}
	
	
	
	
	
	/*Scanner sc = new Scanner(System.in);
	System.out.print("������ ����: ");
	count = sc.nextInt();
	list = new int[count];
	
	for(int i = 0; i < count; i++) {
		System.out.print("������ �Է��Ͻÿ�: ");
		list[i] = sc.nextInt();
	}
	for(int i=0; i<count; i++) {
		sum += list[i];
	}
	System.out.println("�����: " + sum/count);
	}

}
*/