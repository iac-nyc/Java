class PezDispenser {
   public static final int MAX_PEZ = 12; 
   final private String characterName;
   private int pezCount; 
    
    
    //constructor
    public PezDispenser(String characterName){
       this.characterName = characterName;
       pezCount = 0; 
    }
    
    public boolean dispense(){
        boolean wasDispensed = false;
        if(!isEmpty()){
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }
    public boolean isEmpty(){
        return pezCount == 0;
    }
    public void fill(){
        fill(MAX_PEZ);
    }
    // Method Overloading
    public void fill(int pezAmount){
        int newAmount = pezCount + pezAmount;
        if (newAmount > MAX_PEZ){
            throw new IllegalArgumentException("Too many pez!");
        }
        pezCount = newAmount;
    }
    
    // String.contains
    // public boolean contains(String matchingText)
    
    public String getCharacterName(){
        return characterName;
    
    }
}

