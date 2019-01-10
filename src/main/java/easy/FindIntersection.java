/**
 * 
 */
package easy;

import java.util.Arrays;

/**
 * Find Intersection between 3 arrays
 * @param arr1 = {1, 5, 6, 7}
 * @param arr2 = {3, 4, 5, 6}
 * @param arr3 = {5, 6, 7, 8}
 * @return result = {5, 6}
 * 
 * @author Rozita Teymourzadeh
 *
 */
public class FindIntersection {

	private int i = 0;
	private int j = 0;
	private int z = 0;

	public int[] findIntersection(int[] arr1, int[] arr2, int[] arr3) {
		int k = 0;
		if(arr1 == null || arr2 == null || arr3 == null) {
			return null;
		}
		if(arr1.length == 0 || arr2.length == 0 || arr3.length == 0) {
			return null;
		}
		int[] result = new int[10];

		while(!arrayEnd(arr1, arr2, arr3)) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[z]) {
				result[k] = arr1[i];
				k++;
				i++;
				j++;
				z++;
			}
			if(i < arr1.length && j < arr2.length && z < arr3.length) {
				if(arr1[i] < arr2[j]) {
					i++;
				} else if(arr2[j] < arr3[z]) {
					j++;
				} else if(arr3[z] < arr1[i]) {
					z++;
				}
			}
		}
		return result;
	}
	/* To indicate end element of array */
	public boolean arrayEnd(int[] arr1, int[] arr2, int[] arr3) {
		return (i >= arr1.length || j >= arr2.length || z >= arr3.length);
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 5, 6, 7};
		int[] arr2 = {3, 4, 5, 6};
		int[] arr3 = {5, 6, 7, 8};
		int[] result;
		FindIntersection fi = new FindIntersection();
		result = fi.findIntersection(arr1, arr2, arr3);
		System.out.println("These values exist in 3 arrays");
		System.out.println(Arrays.toString(result));
	}

}
