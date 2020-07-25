package Vishesh_Java8.Epam_assignment;
import java.util.*;
import java.util.stream.*;

public class Listaverage {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the List:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int numArray[]=new int[n];
		for(int i=0;i<n;i++)
			numArray[i]=sc.nextInt();
		double average=getAverage(numArray);
		System.out.println("Average of list is:"+average);
		sc.close();
	}
	public static double getAverage(int numArray[]){
		IntStream numStream=Arrays.stream(numArray);
		return numStream.average().getAsDouble();
	}

}
