import java.io.Console;
 
public class Story {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*             
            Filter: age, unacceptable words
        */
        String agePrompt = console.readLine("How old are you?  ");
        int age = Integer.parseInt(agePrompt);
        if( age < 18 ){
            console.printf("You are too young to participate. Good Bye.\n");
            System.exit(0);
        }
        String name = console.readLine("What is your name?  ");
        String adjective = console.readLine("Choose a word: (hint: smart, intelligent) ");
        String noun;
        boolean isInvalidWord;
        do {
            noun = console.readLine("Choose a word: (hint: America, New York) ");
            isInvalidWord = (noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("nerd"));
            if(isInvalidWord){
               console.printf("This type of language is not allowed. Try again.\n\n"); 
            }
            }while(isInvalidWord);
        
        String verb = console.readLine("Choose a word: (hint: coding, teaching) ");
     
        console.printf("\n**********\n Your Story: \n **********\n");
        console.printf("There once was a %s ",adjective);
        console.printf("programmer name %s, %nwho wanted to use Java's %s\n",name, verb);
        console.printf("to change %s, in a positive way!%n",noun);
    }
    
}






