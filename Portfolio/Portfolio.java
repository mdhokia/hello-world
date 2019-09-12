/**
 * Write a description of class Portfolio here.
 *
 * @author Milan Dhokia
 * @version 44
 */
import java.util.Scanner;

public class Portfolio
{
    // instance variables - replace the example below with your own
    private int errCode;
    public Portfolio()
    {
        // initialise instance variables
        errCode = 0;
    }
    
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        Portfolio runner = new Portfolio();
        int answer = 0;
        
        System.out.print('\u000C');
        System.out.println("Hello welcome to Milano's Portfolio!");
        //System.out.println("What would you like to see first?");
        System.out.println("\nWhat do you want pals");
        
        System.out.println("Press 0 to exit");
        System.out.println("Press 3 to continue");
        answer = keyboard.nextInt();
 
        while(answer != 0)
        {
            System.out.println("What do you want pals");
            System.out.println("Press 4 for Countdown Song");
            System.out.println("Press 5 for Midterm Sample Question");
            System.out.println("Press 0 to exit");
            
            answer = keyboard.nextInt();
            
            if(answer == 4){
               
             runner.CountdownSong();
            }
            if(answer == 5){
                runner.midtermQuestion();
            }
            System.out.println("Press 0 to exit");
          
            int exit = keyboard.nextInt();
        }  
    }

    
    public void CountdownSong()
    { 
        int number = 0;
        String chicken;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print('\u000C');
        System.out.println("What poultry do you want");
        chicken = keyboard.nextLine();
        System.out.println("How many " + chicken + "s do you want fried?");
        number = keyboard.nextInt();
        System.out.println(number + " " + chicken + "s fried");
        
        for(int i=number; i > 0; i--)
        {
            int newNumber = 0;
            
            System.out.println("One got fried and tasted delicious");
            System.out.println("Fat cunt went to KFC and fried some more");
            newNumber = i - 1;
            System.out.println(newNumber +" "+ chicken + "s getting fried");
        }
    
    }

    
    public void midtermQuestion(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println('\u000C');
        System.out.println("What language do we code in?");
        System.out.println("C");
        System.out.println("java");
        System.out.println("Deepika");
        System.out.println("Padukone");
        
        String answer = keyboard.nextLine();
        
        if(answer.equals("java")){
            System.out.println("yes mate!");
        
    }
    else{
        System.out.println("wrong, fool");
    }
}

public void Lab1(){
    
}
    
    

}
