/* -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
 * File Name : Deksamenes.java

 * Purpose :	Educational

 * Creation Date : 03-07-2016

 * Last Modified : Sun 03 Jul 2016 06:31:09 PM EEST

 * Created By :	Stamatis Anoustis,Artemis Zografou

 _._._._._._._._._._._._._._._._._._._._._.*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


public class Deksamenes{
	public static void main(String[] args) throws Exception {
		try {
			File file = new File(args[0]);
			Scanner input = new Scanner(file);
			input = new Scanner(file);
			int i,N,B,H,W,L,K,count =0;
			N = input.nextInt();
			//ArrayList<Tank> tanks = new ArrayList<Tank>(N);
			ArrayList<Struct> tanks = new ArrayList<Struct>(2*N);
			ArrayList<Integer> h_list = new ArrayList<Integer>(2*N);
			
			for ( i = 0; i < N; i++){
				B = input.nextInt();
				H = input.nextInt();
				W = input.nextInt();
				L = input.nextInt();
				Struct temp = new Struct(B,true,W*L);
				tanks.add(count,temp);
				h_list.add(count,B);
				count++;
				Struct temp1 = new Struct(B+H,false,-W*L);
				tanks.add(count,temp1);
				h_list.add(count,B+H);
				count++;
				//System.out.println(B + " " + H + " " + W + " " + L);
			}
			K = input.nextInt();
			input.close();
			Collections.sort(h_list);
		//	for (i = 0;i < 2*N;i++)
		//		System.out.println(h_list.get(i));

			//Sorting according to h_start
			//Sorting
			Collections.sort(tanks, new Comparator<Struct>() {

					public int compare(Struct  t1, Struct  t2)
					{
					return t1.height - t2.height;
					}
			});
			int l=0,r=0,t=0,t_next=0,r_prev = 0;
			i = 0;
			while (l < K && i < 2*N){
				t_next = tanks.get(i).height;
				l = l + r*(t_next - t);
				r = r + tanks.get(i).rate;
				r_prev = r - tanks.get(i).rate;
				i++;			
		//		System.out.println("From "+t+" to "+t_next+" l= "+ l +" r= "+ r+" "+i);
				t = t_next;
			}
			float h,result;
			if (i >= 2*N ){
				result = (float)-1;
				System.out.println(result);
			}
			 else
			{
				h = (l - K)/r_prev;
				result = (float)t_next - h;
				System.out.println(result);
			}	

		}	
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}


}
