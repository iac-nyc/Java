import java.util.Date;
import java.util.Arrays;
import com.iftekhar.Treet;
import com.iftekhar.Treets;


public class Example {


    public static void main(String[] args) {
        Treet treet = new Treet(
            "iftekhar",
            "Java:learning @non-stop",
            new Date(1421878767000L)
        
        );
       Treet secondTreet = new Treet(
      "journeytocode",
      "@treehouse makes learning Java sooooo fun! #treet",
      new Date(1550376162L)
    );
        System.out.printf("This is a new Treet: %s %n", treet);
    
        System.out.println("The words are:");
        for(String word: treet.getWords()){
            System.out.println(word);
        }
        Treet[] treets = {secondTreet, treet};
        Arrays.sort(treets);
        for(Treet exampleTreet: treets){
            System.out.println(exampleTreet);
        }
        Treets.save(treets);
        Treet[] reloadedTreets = Treets.load();
        for (Treet reloaded : reloadedTreets){
            System.out.println(reloaded);
        }
    
    }
    
}