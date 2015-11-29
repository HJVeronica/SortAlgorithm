// 삽입정렬
// 정렬되어 있는 배열에 하나의 원소를 더하여 i+1개짜리 배열을 만드는것을 반복한다.
// 최선의 경우 수행시간은 n
// 최악의 경우 n제곱
// 배열이 거의 정렬된 상태라면 효율적이다.
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
