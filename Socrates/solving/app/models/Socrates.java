package models;
import java.util.*;

public class Socrates {
	

		public int a;public int b ;public int c;public String sol;
		public Socrates(){}
		public Socrates(int a1,int b1,int c1){a=a1;b=b1;c=c1;}
		public  void solution1(int a , int b, int c){
			double s,s1;
			double d=b*b-(4*a*c);
			if (d>0){ s=(-b-Math.sqrt(d))/2*a;
			s1=(-b+Math.sqrt(d))/2*a;
			sol= "two solution for    "+a+"*x^2+"+b+"*x+"+c+" =0 cuz delta > 0 they are x1 = "+s+"  and x2= "+s1;	
			}
			else if (d==0){
				s=-b/2*a;
				sol= "one solution for   "+a+"*x^2+"+b+"*x+"+c+" =0 cuz delta = 0 and it is x1 =x2 ="+s +"";
			}
			else if (d<0){sol= "no solution for    "+a+"*x^2+"+b+"*x+"+c+" =0 cuz delta < 0";}
			else sol= "you don't enter any thing";
	    }
			
			
		}



