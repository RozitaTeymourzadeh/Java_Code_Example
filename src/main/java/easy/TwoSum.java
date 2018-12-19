/**
 * 
 */
package easy;

/**
 * LeetCode Example
 * Given an array of integers, return indices of the two numbers such that they add up 
 * to a specific target.
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * 
 * @author Rozita Teymourzadeh
 *
 */
public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        int firstInd = 0;
        int temp;
        int[] result = new int[2];
        for (int i= 0; i < nums.length ; i++){
            temp = nums[i] + nums[firstInd];
            if ((temp == target) && (i != firstInd)){
                 result [0]= firstInd;
                 result [1]= i;
                 break;
            }else if (i== nums.length-1){
                 firstInd++;
                 i = 0;
            }
        }
        
        return result;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] nums = {3, 2, 4};
		int [] results;
		int target = 6;

		TwoSum twoSum = new TwoSum();
		results = twoSum.twoSum(nums, target);
		System.out.println("result is: " + results[0] + " and " + results[1]);

	}

}
