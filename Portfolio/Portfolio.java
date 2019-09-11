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
        System.out.println("Press 4 for Countdown Song");
        System.out.println("Press 5 for Midterm Sample Question");
        System.out.println("Press 0 to exit");
        //System.out.println("Press 3 to continue");
        answer = keyboard.nextInt();
 
        while(answer != 0)
        {
            System.out.println("What do you want pals");
            System.out.println("Press 4 for Countdown Song");
            System.out.println("Press 5 for Midterm Sample Question");
            System.out.println("Press 0 to exit");
            
            answer = keyboard.nextInt();
            
            if(answer == 1)
                runner.CountdownSong();
                
            if(answer == 2)
                runner.midtermQuestion();
        
            //System.out.println("Press 0 to exit");
          
            //exit = keyboard.nextInt();
        }  
    }

    
    public void CountdownSong()
    { 
        int number = 0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print('\u000C');
        System.out.println("What animal do you want");
        String animal = keyboard.nextLine();
        System.out.println("How many " + animal + "s do you want jumping on the bed?");
        number = keyboard.nextInt();
        System.out.println(number + " " + animal + "s jumping on the bed");
        
        for(int i=number; i > 0; i--)
        {
            int newNumber = 0;
            
            System.out.println("One fell off and broke his head");
            System.out.println("Mama called the doctor and the doctor said");
            newNumber = i - 1;
            System.out.println(newNumber +" "+ animal + "s jumping on the bed");
        }
    
    }

    
    public void midtermQuestion(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println('\u000C');
        System.out.println("What data type returns either true or false?");
        System.out.println("String");
        System.out.println("Int");
        System.out.println("Boolean");
        System.out.println("Long");
        
        String answer = keyboard.nextLine();
        
        if(answer.equals("Boolean")){
            System.out.println("yes mate!");
        
    }
    else{
        System.out.println("wrong, fool");
    }
}

public void Lab1(){
    
}
    
    

}