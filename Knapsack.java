//Knapsack

import java.util.Scanner;
import java.util.Arrays;
public class Knapsack{
	public static void main(String[] args){
		int n=3;
		int[] Profit = {90,100,120};
		int[] Weight={10,20,30};
		int Capacity = 50;
		double MaxProfit = KnapsackGreedy(n,Profit,Weight,Capacity);
		System.out.printf("Maximum Profit: %.2f\n",MaxProfit);
	}
	
	static double KnapsackGreedy(int n,int[] p, int[] w,int m){
		double[] ratio = new double[n];
		for ( int i =0;i<n;i++){
			ratio[i] = p[i]/w[i];
		}
		
		Integer[] index = new Integer[n];
		 
		for ( int i =0;i<n;i++){
			index[i]=i;
		}
		
		Arrays.sort(index,(i,j)->Double.compare(ratio[j],ratio[i]));
		
		double TotalProfit = 0.0;
		int RemainingCapacity = m;
		
		for(int i : index){
			if(w[i] <= RemainingCapacity){
				RemainingCapacity -= w[i];
				TotalProfit = TotalProfit + p[i];
			}else{
				TotalProfit += ratio[i]*RemainingCapacity;
				break;
			}
		}
		return TotalProfit;
	}
}
