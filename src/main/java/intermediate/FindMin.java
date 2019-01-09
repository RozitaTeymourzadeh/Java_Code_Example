/**
 * 
 */
package intermediate;

import java.util.Arrays;

/**
 * Find m th minimum value in an array
 * @author Rozita Teymourzadeh
 *
 */
public class FindMin {

	public void findMin(int[] input, int m) {
		quickSort(input);
		for(int i = 0; i <= m; i++) {
			System.out.println(i + " minimumm value is : " + input[i]);
		}
	}
	
	public int[] quickSort(int[] input) {
		if (input == null || input.length < 2) {
			return input;
		}

		quickSort(input, 0, input.length - 1);
		return input;
	}
	
	public void quickSort(int[] input, int left, int right) {
		if(left >= right) {
			return;
		}
		int pivotIndex = partition(input, left, right);
		quickSort(input, left, pivotIndex -1);
		quickSort(input, pivotIndex + 1, right);
	}
	
	public int partition(int[] input, int left, int right) {		
		int pivotIndex = (int)(Math.random()*(right-left + 1)) + left;
		int pivot = input[pivotIndex];
		swap(input, pivotIndex, right);
		int i = left;
		int j = right-1;
		while (i <= j) {
			if (input[i] <= pivot) {
				i++;
			} else if (input[j]> pivot) {
				j--;
			} else {
				swap(input, i++, j--);
			}
		}
		swap(input,i, right);
		return i;
	}
	
	public void swap(int[] input, int left, int right) {
		int temp;
		temp = input[right];
		input[right] = input[left];
		input[left] = temp;
	}
	public static void main(String[] args) {
		
		int[] input = {10, 13, 15, 8, 0 , 8};
		System.out.println("unsorted input is:"+ Arrays.toString(input));
		FindMin fm = new FindMin();
		input = fm.quickSort(input);
		System.out.println("sorted output is:"+ Arrays.toString(input));
		fm.findMin(input, 3);
	}
}
