
public class Bubble {
	int[] arr = {5,1,4,2,3,6,7,9,10,8};
	int numOfElement = arr.length;
	int cnt=0;
	
	public void b_sort(){
		System.out.print("\n처음 배열: ");
		Print();
		System.out.println();
		for(int step=0;step<numOfElement;step++){
			for(int index = 0;index<(numOfElement-step)-1;index++){
				if(arr[index]>arr[index+1]){
					int temp = arr[index];
					arr[index] = arr[index+1];
					arr[index+1] = temp;
				}
			}
			System.out.print("Step "+step+": ");
			Print();
		}
		System.out.print("\n최종 결과: ");
		Print();
		System.out.println();
	}	
	
	public void Print(){
		for(int i=0;i<arr.length;i++)				
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}


