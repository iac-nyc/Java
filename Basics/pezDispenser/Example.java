public class Example {
 
  public static void main(String[] args) {
    System.out.println("***** We are making a new PEZ Dispenser *****"); 
      
    System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser.%n",PezDispenser.MAX_PEZ);  
      
                       
     PezDispenser dispenser = new PezDispenser("Yoda");   
 
      System.out.printf("The dispenser is %s %n",
                      dispenser.getCharacterName()); 
      if(dispenser.isEmpty()){
          System.out.println("Dispenser is empty");
      
      }
      
      
      SelectColor color = new SelectColor("YellowGreen");
      
      System.out.printf("The selected color is %s %n", color.getColor());
      System.out.println("Filling the dispenzer with delicious PEZ...");
      dispenser.fill();
      if(!dispenser.isEmpty()){
          System.out.println("Dispenser is full");
      
      }
      int count=0;
      while(dispenser.dispense()){
          count++;
          System.out.println("Chomp "+ count);
      }
      if(dispenser.isEmpty()){
        System.out.println("Finished all the PEZ");
      }
      dispenser.fill(3);
   
      while(dispenser.dispense()){
          count++;
          System.out.println("Chomp !!"+ count);
      }
      try {
      dispenser.fill(599);
      System.out.println("Won't happen");
      }catch(IllegalArgumentException iae){
          System.out.println("Whoa !!!");
          System.out.printf("The error was %s %n",iae.getMessage());
      
      }
    
  }

}