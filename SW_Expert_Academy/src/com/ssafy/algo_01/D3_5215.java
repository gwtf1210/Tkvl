package com.ssafy.algo_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class D3_5215 {
    static int n,l; 			// n : ����� ��  // l : ���� Į�θ� 
    static int[] score, kalory; // score : �� ���� // kalory : Į�θ�
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Test Case ��
        
        for(int i=1;i<=tc;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            n = Integer.parseInt(st.nextToken()); // ����� ��
            l = Integer.parseInt(st.nextToken()); // ���� Į�θ�
            score = new int[n]; // �� ����
            kalory = new int[n]; // Į�θ�
            
            for(int j=0; j<n; j++) {
                st = new StringTokenizer(br.readLine());
                score[j] = Integer.parseInt(st.nextToken());
                kalory[j] = Integer.parseInt(st.nextToken());
            }
            
            maxScore = 0; 
            check = new boolean[n]; // ��� ��� �迭
             
            dfs(0,0,0); // index, ����, Į�θ�
            System.out.println("#" + i + " " + maxScore);
        }
    }
     
    static int maxScore;
    static boolean[] check;
    private static void dfs(int idx, int s, int k) {
        if(k > l) return; // ����� �� Į�θ� > �� Į�θ�
        if(idx==n) { // ����� ���� �Ǹ�
            maxScore = Math.max(maxScore, s); // maxScore�� s �� ���� ���� return
            return;
        }
        
        dfs(idx+1,s+score[idx],k+kalory[idx]);
        dfs(idx+1,s,k);
    }
}
