package org.tnsif.singledimentionalarray;

import java.util.Arrays;
import java.util.Scanner;
//Program to demonstrate on array using runtime input values and to find largest element in an array
public class ArrayRunTimeMax {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size array elements: ");
		int n=s.nextInt();
		
		//array declaration
		int arr[]= new int [n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		
		//Array displaying
		System.out.println("\nArray elements are: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");    
		}
		System.out.println();
		
		//Largest element in array
		int max=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("\nLargest element in the array is: "+max);
		
		//Array sorting
		Arrays.sort(arr);
		System.out.println("\nSorted array elements: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
