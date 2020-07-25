package Vishesh_Java8.Epam_assignment;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class FindString {

	public static void main(String[] args) {
		int n;
		ArrayList<String> arr=new ArrayList<String>();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Strings : ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)	
			arr.add(sc.next());
		List<String> result=search(arr);
		System.out.println("The list containing strings of length 3 and starting with a:"+result);
		sc.close();
		
	}
	static List<String> search(List<String> arr)
    {
		ArrayList<String> res=new ArrayList<String>();
		res=(ArrayList<String>) arr.stream().filter(ele-> ele.charAt(0)=='a' && ele.length()==3).collect(Collectors.toList());
		return res;
    }
}
