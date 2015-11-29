import java.util.ArrayList;

public class Quick {

	public void q_sort(){
		 int[] S_temp = {85, 24, 63, 45, 17, 31, 96, 50};
         ArrayList<Integer> S = new ArrayList<Integer>();
        
         for(int i = 0; i < S_temp.length; i++) {
                 S.add(S_temp[i]);
         }
        
         System.out.print("ArrayList before quick-sort: ");
         print_ar(S);
         quick_sort(S);
         System.out.print("ArrayList after quick-sort: ");
         print_ar(S);
	}
	
	public static void quick_sort (ArrayList S) {
        if (S.size() < 2) return; // Nothing needs to be done if S has zero or one element)
       
        // Divide: If S has at least two elements, select a specific element x from S, which is called the pivot.
        ArrayList<Integer> L = new ArrayList<Integer>(); // L, storing the elements in S less than pivot
        ArrayList<Integer> E = new ArrayList<Integer>(); // E, storing the elements in S equal to pivot
        ArrayList<Integer> G = new ArrayList<Integer>(); // G, storing the elements in S greater than pivot
        int pivot = (int)S.get(S.size() - 1);
        E.add(pivot);
        S.remove(S.size() - 1);
        while (S.size() > 0) {
                if ((int)S.get(0) < pivot) {
                        L.add((int)S.get(0));
                } else if ((int)S.get(0) == pivot) {
                        E.add((int)S.get(0));
                } else {
                        G.add((int)S.get(0));
                }
                S.remove(0);
        }
       
        // Divide result
        System.out.print("L = ");
        print_ar(L);
        System.out.print("E = ");
        print_ar(E);
        System.out.print("G = ");
        print_ar(G);
        System.out.println();
       
        // Conquer: Recursively sort sequences L and G.
        quick_sort(L);
        quick_sort(G);
       
        // Combine: Put back the element into S in order by first inserting the elements of L, then those of E, and finally those of G.
        for (int i = 0; i < L.size(); i++) {
                S.add((int)L.get(i));
        }
        for (int i = 0; i < E.size(); i++) {
                S.add((int)E.get(i));
        }
        for (int i = 0; i < G.size(); i++) {
                S.add((int)G.get(i));
        }
       
        // Combine S result
        System.out.print("S = ");
        print_ar(S);
        System.out.println();
	}

	public static void print_ar(ArrayList S) {
	        for(int i = 0; i < S.size(); i++) {
	                System.out.print(S.get(i) + " ");
	        }
	        System.out.println();
	}
}
