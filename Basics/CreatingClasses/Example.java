public class Example {
 
  public static void main(String[] args) {
    System.out.println("We are making a new PEZ Dispenser");     
      
                       
     PezDispenser dispenser = new PezDispenser("Yoda");   
 
      System.out.printf("The dispenser is %s %n",
                      dispenser.getCharacterName()); 
      
      
      SelectColor color = new SelectColor("YellowGreen");
      
      System.out.printf("The color is %s %n", color.getColor());
    
  }

}