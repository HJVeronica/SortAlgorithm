
public class Selection {
	
	public void s_sort(){
		int[] list = {15,11,37,49,35,47,20,27};
		
		selectionSort(list);
		
		for(int i : list)
			System.out.print(i+" ");
		System.out.println();
	}
	
	void selectionSort(int[] list) {
	    int indexMin, temp;

	    for (int i = 0; i < list.length - 1; i++) {
	        indexMin = i;
	        for (int j = i + 1; j < list.length; j++) {
	            if (list[j] < list[indexMin]) {
	                indexMin = j;
	            }
	        }
	        temp = list[indexMin];
	        list[indexMin] = list[i];
	        list[i] = temp;
	    }
	}

}
