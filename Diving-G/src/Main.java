import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		double[] scores;
		double degree, Score;
		
		degree = inputValidDegreeOfDifficulty();
		scores = inputAllScores();
		Score = calculateScore(degree, scores);
		
		System.out.println("The final score is: "+ Score);

	}
	
	
	public static Scanner keyboard = new Scanner(System.in);
	
	
	public static double inputValidScore(int i){
		
		double score;
		
		do{
			System.out.print("Judge #"+(i)+" score: ");
			score = keyboard.nextDouble();
			
			if(score<0 || score>10)
				System.out.println("Invalid Score");
			
		}while(score<0 || score>10);
		
		return score;
	
	}
	
	public static double[] inputAllScores(){
		
		double[] scores = new double[7];
		
		for(int i=0; i<7; i++){
			
			scores[i]=inputValidScore(i+1);
		}
		
		System.out.println();
		return scores;
		
	}
	
	public static double inputValidDegreeOfDifficulty(){
		
		double degree;
		
		do{
			
			System.out.print("Degree of difficulty: ");
			degree = keyboard.nextDouble();
			
			if(degree<1.2 || degree>3.8)
				System.out.println("Invalid Degree");
			
		}while(degree<1.2 || degree>3.8);
		
		return degree;
		
	}
	
	public static double calculateScore(double degree, double[] scores){
		
		double m=10,M=0;
		double Score=0;
		
		for(int i=0; i<7; i++){
			
			if(scores[i]<m)
				m=scores[i];
			
			if(scores[i]>M)
				M=scores[i];
		}
		
		for(int i=0; i<7; i++){
			
			Score+=scores[i];
		}
		
		Score = (Score-(M+m))*degree*0.6;
		
		return Score;
		
	}

}
