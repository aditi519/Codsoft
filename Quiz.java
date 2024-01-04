package com.codesoft;
import java.util.Scanner;

public class Quiz {
	

	    public static void main(String[] args) {
	        String[] que = new String[5];
	        que[0] = "1.Who was the highest run scorer in World Cup 2023?";
	        que[1] = "\n2.Who took the highest wickets in the World Cup 2023?";
	        que[2] = "\n3.Which cricketer holds the record for the most sixes in the ICC Cricket World Cup 2023?";
	        que[3] = "\n4.Which cricketer holds the record for the most fours in the ICC Cricket World Cup 2023?";
	        que[4] = "\n5.Which two teams played in the ICC Cricket World Cup Finale of 2023?";
	      
	        String[] options  = new String[5];
	        options[0] = "a) Virat Kohli \nb) Quinton de Kock \nc) Rohit Sharma \nd) Rachin Ravindra";
	        options[1] = "a) Adam Zampa \nb) Shaheen Afridi \nc) Mohammed Shami \nd) Dilshan Madushanka";
	        options[2] = "a) David Warner \nb) Rohit Sharma \nc) Glenn Maxwell \nd) Shreyas Iyer";
	        options[3] = "a) Rohit Sharma \nb) Quinton de Kock \nc) Glenn Maxwell \nd) Rachin Ravindra";
	        options[4] = "a) India and South Africa \nb) India and Pakistan \nc)  India and Australia \nd) South Africa and Australia";
	        
	        char answers[] = {'a','c','b','a','c'};
	        char[] ans = new char[5];
	        Scanner in = new Scanner(System.in);
	        for (int i = 0; i < 5; i++){
	            long start = System.currentTimeMillis();
	            long end  = start + 200;
	            System.out.println(que[i]);
	            System.out.println(options[i]);
	            while (System.currentTimeMillis() < end){
	                  System.out.print("Enter your option: ");
	                 ans[i] = in.next().charAt(0);
	            }
	        }
	        int score=0;
	        for (int i = 0; i < ans.length; i++) {
	            if(ans[i] == answers[i]){
	                score++;
	            }
	        }
	        System.out.println("\nYour score : "+score);
	    }
}
