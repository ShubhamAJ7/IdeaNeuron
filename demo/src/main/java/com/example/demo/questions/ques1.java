package com.example.demo.questions;

public class ques1 {

	public static void main(String[] args) {
		int[] arr = {1,5,6,90,8,9};
		for(int i=0;i<arr.length;i++) {
			boolean ar=true;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					ar=false;
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
			if(ar==true) {
				break;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Minimum "+arr[0]);
		System.out.println("Largest Element "+ques1.findLagest(arr));
	}
	public static int findLagest(int[] ar) {
		int a=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>a)
			{
				a=ar[i];
			}
		}
		return a;
		
	}
}
