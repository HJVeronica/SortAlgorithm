import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		Scanner in = new Scanner(System.in);
		Bubble b = new Bubble();
		Merge m = new Merge();
		Quick q = new Quick();
		Selection s = new Selection();
		Insertion i = new Insertion();
		
		while(true){
			menu();
			
			choice = in.nextInt();
			
			switch(choice){
				case 1: b.b_sort(); break;
				case 2: s.s_sort(); break;
				case 3: i.i_sort(); break;
				case 4: m.m_sort(); break;
				case 5: q.q_sort(); break;
				case 6: System.out.println("프로그램을 종료합니다.");
						System.exit(0); break;
				default: System.out.println("1~6 사이의 번호를 입력하세요");
						 menu();
			}
		}
		

	}
	
	public static void menu(){
		System.out.println("************ Menu ************");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Selection Sort");
		System.out.println("3. Insertion Sort");
		System.out.println("4. Merge Sort");
		System.out.println("5. Quick Sort");
		System.out.println("6. Quit");
		
		System.out.print("\n원하시는 정렬을 선택하세요: ");
	}

}
