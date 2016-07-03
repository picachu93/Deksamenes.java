/* -.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.
* File Name : Tank.java

* Purpose :

* Creation Date : 03-07-2016

* Last Modified : Sun 03 Jul 2016 01:59:09 PM EEST

* Created By :

_._._._._._._._._._._._._._._._._._._._._.*/

import java.util.*;

public class Tank{
	public int h_start;
	public int h_end;
	public int rate;

	public Tank (int h1, int h2, int r){
		h_start = h1;
		h_end = h2;
		rate = r;
	}

	public boolean wh_event (int h)
	{
		if (h == h_start)
		
			return true;
		
		else 

			return false;

	}
}
