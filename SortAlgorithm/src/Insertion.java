// ��������
// ���ĵǾ� �ִ� �迭�� �ϳ��� ���Ҹ� ���Ͽ� i+1��¥�� �迭�� ����°��� �ݺ��Ѵ�.
// �ּ��� ��� ����ð��� n
// �־��� ��� n����
// �迭�� ���� ���ĵ� ���¶�� ȿ�����̴�.
public class Insertion {
	public void i_sort(){
		int[] arr = { 8, 31, 48, 74, 4, 75, 20, 29, 11, 15 };
		
		insertionSort(arr);
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int index = i - 1;
			int newItem = arr[i];
			while (index >= 0 && newItem < arr[index]) {
				arr[index + 1] = arr[index];
				index--;
			}
			arr[index + 1] = newItem;
		}
	}
}
