import java.util.*;
/*

I WAS GOING TO USE 'retainAll' but realised that in case of elements like [1, 2, 3, 1, 2, 4, 1] and [2, 1, 3, 1, 5, 2, 2]
'retainAll' does not remove the extra elements in both the arrays.

For instance if :-

l1 = [1, 2, 3, 1, 2, 4, 1]
l2 = [2, 1, 3, 1, 5, 2, 2]

l1.retainAll(l2) = [1, 1, 1, 2, 2, 3]

Sorry, for the spaghetti code :p    ----- VATSAL UPPAL @ CHITKARA @ SECTION 6L


*/
public class Intersection {
	private static final Scanner sc = new Scanner(System.in);
	private static List<Integer> intersection(int arr1[], int arr2[]) {
		List<Integer> intersect1 = new ArrayList<Integer>();
		List<Integer> intersect2 = new ArrayList<Integer>();
		List<Integer> intersect3 = new ArrayList<Integer>();
		for (int i: arr1) {
			intersect1.add(i);
		}
		for (int i: arr2) {
			intersect2.add(i);
		}
		for (int i: arr2) {
			int occ1 = Collections.frequency(intersect1,i);
			int occ2 = Collections.frequency(intersect2,i);
			if (occ1 != 0 && !(intersect3.contains(i))) { 
				if (occ1 < occ2)
					while (occ1-- != 0)
						intersect3.add(i);
				else if (occ2 < occ1)
					while (occ2-- != 0)
						intersect3.add(i);
				else if (occ2 == occ1)
					while (occ1-- != 0)
						intersect3.add(i);
			}
		}
		Collections.sort(intersect3);
		return intersect3;
	}
	public static void main(String []args) {
		int i;
		final int n1 = sc.nextInt();
		final int arr1[] = new int[n1];
		for (i=0;i<n1;i++)
			arr1[i] = sc.nextInt();
		final int n2 = sc.nextInt();
		final int arr2[] = new int[n2];
		for (i=0;i<n2;i++)
			arr2[i] = sc.nextInt();
		System.out.println(intersection(arr1,arr2).toString());
	}
}