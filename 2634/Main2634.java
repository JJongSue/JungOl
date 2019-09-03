package jungol2634;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2634 {
	static int N,M;
	static long L;
	static int[] arr;
	static class pair{
		
		public pair(int first, int second) {
			super();
			this.first = first;
			this.second = second;
		}
		int first;
		int second;
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		L = Long.parseLong(st.nextToken());
		int cnt = 0;
		arr = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(y > L) continue;
			pair p = findmid(x,0,M-1);
			//System.out.println(p.first+" "+p.second);
			//System.out.println(i);
			for(int j=p.first;j<=p.second;j++)
			{
				if( (Math.abs(arr[j]-x)+y) <= L  ) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
	static pair findmid(int x, int s, int e)
	{
		
		/*if(s>e) return new pair(e,s);
		if(s==e) return new pair(s,s);*/
		int half = (s+e)/2;
		if(half > e || half < s) return new pair(s, e);
		if(e-s < 100) return new pair(s, e);
		
		
		//System.out.println(half);
		if(x < arr[half]) {
			return findmid(x,s,half);//new pair(s,half);
		}
		else if(x> arr[half]) return findmid(x, half,e);//new pair(half, e);
		else return new pair(half, half);
		//return p;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
