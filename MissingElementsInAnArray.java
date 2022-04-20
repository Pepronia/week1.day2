package week1.day2;

import java.util.Arrays;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public class MissingElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);//sorting
		System.out.println(Arrays.toString(arr));//printing
	int j = 0;
	for(int i=1;i<=arr.length;i++) {//check if 1st element is 1
		
		if(i!=arr[j])//j=0 (1)1=1
		{
			System.out.println(i);
			break;
		}
		j++;
	}
	}	

}
