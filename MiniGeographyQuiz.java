package GitHub_Work.MiniGeographyQuiz;
import java.util.Scanner;

public class MiniGeographyQuiz {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    int answer;
    System.out.println("Hello and Welcome to a Mini Geo Quiz");
    System.out.println("Your question is, What is the Capital of Nunavut");
    System.out.println("Is it.....");
    System.out.println("1: Alert");
    System.out.println("2: Eureka");
    System.out.println("3: Toronto");
    System.out.println("4: Iqaluit");
    System.out.println("5: Ottawa");
    System.out.print("What is your answer?: ");
    answer=input.nextInt();
        
    switch(answer) {
        case 1: System.out.println("Incorrect"); break;
        case 2: System.out.println("Incorrect"); break;  
        case 3: System.out.println("Incorrect");break;
        case 4: System.out.println("Correct");  break;
        case 5: System.out.println("Incorrect"); break;
        default: System.out.println("Please Choose a number between 1 and 5");
        input.close();
    }
    }
}    
