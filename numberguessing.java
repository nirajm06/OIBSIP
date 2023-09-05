import java.util.Scanner;
import java.util.Random;
public class numberguessing{
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        String play="yes";
        int Round=0,Totalscore=0,Totaltries=0;
        System.out.println();
        System.out.println("A number has been choosen between 1 to 100.Guess that number within 7 tries :");
        while(play.equals("yes")){
            // add 1 to round because round 1st is started
            ++Round;
            // making variable to get track keep of tries and score in each single round.
            int guess,i,k=7,tries=0,score=7;
            // Make an object of random inbuild function.
            Random rand=new Random();
            int number=rand.nextInt(100);
            // we get 7 tries because of loop which will run 7 times as per conditions.
            for(i=1;i<=k;i++){
                System.out.println();
                System.out.print("Chance "+i+": Guess the number :");
                guess=sc.nextInt();
                if(number==guess){
                    System.out.println("Congratulations! you have guessed the correct number.");
                    System.out.println("tries "+tries);
                    System.out.println("score "+score);
                    Totaltries+=tries;
                    Totalscore+=score;
                    System.out.println();
                    // we can restart the game by giving the yes to play's input.
                    System.out.println("would you like to play again ? yes or no .");
                    play=sc.next().toLowerCase();
                    break;
                }
                else if(number>guess && i!= k-1){
                    System.out.println("The number is greater "+guess);
                    // Here our tries and score are updating as per Command.
                    tries++;
                    score--;
                }
                else{
                    System.out.println("The number is smaller "+guess);
                    // here also our tries and score are updating.
                    tries++;
                    score--;
                }
            }
            // if we can't able to guess the correct number then we came out from the loop after 7w67 tries.
            if(i==k+1){
                System.out.println("You have used all 7 tries :");
                System.out.println("The number was :"+number);
                Totaltries+=tries;
                Totalscore+=score;
                System.out.println("Tries "+tries);
                System.out.println("score "+score);
                System.out.println();
                System.out.println("would you like to play again ? yes or no .");
                play=sc.next().toLowerCase();
            }
        }
        // printing total round,tries,score as per our performance.
        System.out.println("\nRound :"+Round);
        System.out.println("Totaltries :"+Totaltries);
        System.out.println("Totalscore :"+Totalscore);
        sc.close();
    }
}