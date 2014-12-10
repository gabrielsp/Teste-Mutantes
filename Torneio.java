package torneio.original;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Torneio {
	public static final int P = (int) (1e9+7);

	public static void main(String[] args) {
		
		int n,k;
		List<Integer> hList = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		k = in.nextInt();
		int myh;
		myh = in.nextInt();
	    for(int a=1;a<(1<<n);++a) {
	        int h;
	        h = in.nextInt();
	        hList.add(h);
	    }
	    
	    long result = torneio(n, k, myh, hList);
	    System.out.println(result+"\n");
	    in.close();
	}
	
	public static long torneio(int n, int k, int myh, List<Integer> hList){
		int qpior=0, qmelhor=0;
		for(int i=0;i<n;i++) {
	        if(hList.get(i) > myh) qmelhor++;
	        else qpior++;
	    }
	    if(k <= n) {
	        long ans = (((long)1<<(k-1))*arranja(qpior,(1<<(k-1))-1))%P;
	        ans *= arranja((1<<n)-((1<<(k-1))),(1<<(k-1))) - arranja(qpior - ((1<<(k-1))-1),(1<<(k-1)));
	        ans %= P;
	        ans *= (1<<(n-k+1));
	        ans %= P;
	        ans *= arranja((1<<n)-(1<<k),(1<<n)-(1<<k));
	        return (ans%P+P)%P;
	    }
	    else {
	        if(qmelhor > 0) return 0;
	        else return arranja((1<<n),(1<<n));
	    }
	}	
	
	private static long arranja(int n, int k){
		long ret = 1;
		for (int i = 0; i < k; i++) {
			ret *= n-i;
			ret %= P;
		}
		return ret;
	}
	
	

}
