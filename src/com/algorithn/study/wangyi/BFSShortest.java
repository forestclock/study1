package com.algorithn.study.wangyi;
import java.util.Scanner;

public class BFSShortest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = Integer.parseInt(scanner.nextLine());
			int x[] = new int [n];
			int y[] = new int [n];
			int [] des = new int[2];
			int [] time = new int[2];
			
			String [] tx = scanner.nextLine().split(" ");
			String [] ty = scanner.nextLine().split(" ");
			String [] destination = scanner.nextLine().split(" ");
			String [] times = scanner.nextLine().split(" ");

			des[0] = Integer.parseInt(destination[0]);
			des[1] = Integer.parseInt(destination[1]);
			
			time[0] = Integer.parseInt(times[0]);
			time[1] = Integer.parseInt(times[1]);
			int taxiTime = 99999999;
			
			System.out.println("n=======" + n);
			for(int i = 0;i < n;i++){
//				System.out.println("i==========" + i + "----" + tx[i] + "----");
				x[i] = Integer.parseInt(tx[i]);
				y[i] = Integer.parseInt(ty[i]);
				int tmp = (Math.abs(x[i]) + Math.abs(y[i])) * time[0] + (Math.abs(des[0] - x[i]) + Math.abs(des[1] - y[i]))*time[1];
//				System.out.println(tmp);
				if(tmp < taxiTime)
					taxiTime = tmp;
			}
			int walkTime = (Math.abs(des[0]) + Math.abs(des[1])) * Integer.parseInt(times[0]);
//			System.out.println("taxiTime=================" + taxiTime);
//			System.out.println("walkTime------------" + walkTime);
			System.out.println(taxiTime< walkTime ? taxiTime:walkTime);
		}
	}
}
