package lab05;
import java.util.Arrays;
public class Zipper{
	
	public static int[] zip(int[] arr1, int[] arr2){
		if(arr1==null || arr2==null || arr1.length != arr2.length){
			throw new IllegalArgumentException("bad input");
		}
		if(arr1.length==0){
			return new int[0];
		}
		int[] retArray = new int[arr1.length*2];
		int x =0;
		for(int i=0;i<arr1.length;i++){
			retArray[x] = arr1[i];
			retArray[x+1] = arr2[i];
			x = x+2;
		}
		return retArray;
	}
}
