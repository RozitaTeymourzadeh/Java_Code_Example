/**
 * 
 */
package easy;

import java.util.HashMap;

/**
 * Find First Recurring Character
 * @input ABBCA
 * @output B
 * @author rozitateymourzadeh
 *
 */
public class FirstRecurringCharacter {

	public Character findRecurringChar(Character[] input) {
		if (input == null || input.length == 0) {
			return null;
		}
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
		Character character = null;
		for(int i = 0; i < input.length ; i++) {
			if(result.containsKey(input[i])) {
				character = (Character) input[i];
				return character;
			} else {
				result.put(input[i], 1);
			}
		}
		return character;
	}
	
	public static void main(String[] args) {
		Character[] input = {'A','B','d','D'};
		FirstRecurringCharacter frc = new FirstRecurringCharacter();
		System.out.println(frc.findRecurringChar(input));
	}
}
