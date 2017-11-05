package lab05;
import java.util.Arrays;
import java.util.ArrayList;

public class FunWithStrings{
	
	public static void swapMaxes(ArrayList<String> list1, ArrayList<String> list2){
		String l1Max = "";
		String l2Max = "";
		int l1MaxInd = 0;
		int l2MaxInd = 0;

		for(int i=0;i<list1.size();i++){
			if(list1.get(i)!=null && list1.get(i).length()>l1Max.length()){
				l1Max = list1.get(i);
				l1MaxInd = i;
			}
		}
		for(int x=0;x<list2.size();x++){
			if(list2.get(x)!=null && list2.get(x).length()>l2Max.length()){
				l2Max = list2.get(x);
				l2MaxInd = x;
			}
		}	
		list1.set(l1MaxInd,l2Max);
		list2.set(l2MaxInd,l1Max);
		
	}
}
