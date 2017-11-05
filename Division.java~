package lab05;
import java.util.Arrays;
import java.util.ArrayList;

public class Division{
	private ArrayList<Double> list = new ArrayList<Double>();

	public Division(double[] array){
		if(array==null || array.length==0){
			throw new IllegalArgumentException("need to enter an arry with at least one double");
		}
		for(int i=0;i<array.length;i++){
			list.add(array[i]);
		}
	}
	
	//Removes All zeroes from list
	public void removeZeroes(){
		for(int i=0;i<list.size();i++){
			if(list.get(i)==0){
				list.remove(i);
			}
		}
	}
	
	//replaces all values in list
	//as divided by param divisor
	public void divide(int divisor){
		if(divisor==0){
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		for(int i=0;i<list.size();i++){
			list.set(i,list.get(i)/divisor);
		}
	}
	public String toString(){
		return list.toString();
	}
}
