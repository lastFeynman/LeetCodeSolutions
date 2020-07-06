package hard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution65 {
	public boolean isNumber(String s) {
		String reg = "^[+-]?(\\.\\d+|\\d+\\.?\\d*)(e[+-]?\\d+)?$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(s);
		if(matcher.find())
			return true;
		else
			return false;
    }

	public static void main(String[] args) {
		Solution65 solution65 = new Solution65();
		System.out.println(solution65.isNumber(""));
	}
}
