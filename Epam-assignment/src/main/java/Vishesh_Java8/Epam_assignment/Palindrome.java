package Vishesh_Java8.Epam_assignment;

import java.util.*;
import java.util.stream.*;

public class Palindrome {
	public static void main(String[] args) {
		int n;
		ArrayList<String> arr=new ArrayList<String>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Strings : ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)	
			arr.add(sc.next());
		List<String> result=palindromeList(arr);
		System.out.println("The list containing palindromes:"+result);
		sc.close();

}
	static List<String> palindromeList(List<String> arr)
    {
		ArrayList<String> res=new ArrayList<String>();
		res=(ArrayList<String>) arr.stream().filter(ele->ele.equals(((new StringBuffer(ele)).reverse()).toString() ) ).collect(Collectors.toList());
		return res;
    }
}
