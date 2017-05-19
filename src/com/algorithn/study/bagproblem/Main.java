package com.algorithn.study.bagproblem;

import java.util.Scanner;

/**
 * 题目描述：
 * 一种双核CPU的两个核能够同时的处理任务，现在有n个已知数据量的任务需要交给CPU处理，
 * 假设已知CPU的每个核1秒可以处理1kb，每个核同时只能处理一项任务。
 * n个任务可以按照任意顺序放入CPU进行处理，现在需要设计一个方案让CPU处理完这批任务所需的时间最少，
 * 求这个最小的时间。
 * 
 * 输入包括两行：
 *第一行为整数n(1 ≤ n ≤ 50)
 *第二行为n个整数length[i](1024 ≤ length[i] ≤ 4194304)，表示每个任务的长度为length[i]kb，每个数均为1024的倍数。
 *输出一个整数，表示最少需要处理的时间
 *
 *
 *输入例子:
 *5
 *3072 3072 7168 3072 1024
 *输出例子:
 *9216
 * @ClassName Main 
 * @Description 
 * @author zhong
 * @date 2017年5月14日下午10:54:43
 *
 */
public class Main {
     
     
    public static void main(String[] args) {
         
//      int [] inputs = {3072, 3072, 7168, 3072, 1024};
//      int result = solution(5, inputs);
//      System.out.println("result=========" + result);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = Integer.parseInt(scanner.nextLine());
            String tmp = scanner.nextLine();
            String [] tmps = tmp.split(" ");
            int [] inputs = new int[tmps.length];
            for(int i = 0;i < tmps.length;i++){
                inputs[i] = Integer.parseInt(tmps[i]);
            }
             
            int result = solution(n, inputs);
            System.out.println(result);
             
        }
         
    }
    public static int solution(int n, int [] inputs){
 
        int sum = 0;
        for(int i = 0;i < inputs.length;i++){
            sum += (inputs[i]/1024);
        }
        int results[][] = new int [n+1][sum/2+1];
        for(int j = 0;j < (n+1);j++){
            results[0][j] = 0;
        }
        for(int i = 0;i < (n+1);i++){
            results[i][0] = 0;
        }
//      System.out.println(sum/2);
        for(int i = 1;i <= n;i++){
//          System.out.println("input[i-1]-------" + inputs[i-1]/1024 + "-----i=====" + i);
            for(int j = 1;j <= sum/2;j++){
                if(j >= (inputs[i-1]/1024)){
                    int tmp = results[i-1][j-inputs[i-1]/1024] + inputs[i-1]/1024;
                    int tmp2 = results[i-1][j];
                    results[i][j] = getMax(tmp, tmp2);
//                  System.out.println("i----" +i + "=====j======" + j);
                }else{
                    results[i][j] = results[i-1][j];
                }
                 
            }
        }
//      System.out.println(sum-results[n][sum/2]);
        int result = (sum - results[n][sum/2]) * 1024;
        return result;
    }
     
    public static int getMax(int m, int n){
        return m> n?m:n;
    }
 
}
