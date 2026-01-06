package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test123 {

	public static int lengthOfLongestSubstring(String s) {

		int lengthS = s.length();
		HashSet<Character> set = new HashSet<>();
		int left = 0, longestSubstring = 0;

		for (int r = 0; r < lengthS; r++) {
			while (set.contains(s.charAt(r))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(r));
			longestSubstring = Math.max(longestSubstring, r - left + 1);
		}

		return longestSubstring;

	}

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless=new");
		options.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://admin-demo.nopcommerce.com/login");	
		

	}
}
