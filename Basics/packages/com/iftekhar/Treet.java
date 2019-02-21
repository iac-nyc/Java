package com.iftekhar;
import java.util.Date;
import java.util.Arrays;
import java.io.Serializable;

public class Treet implements Comparable<Treet>, Serializable{
    private boolean mBreakIt = true;
    private static final long serialVersionUID = 999898973103326960L;              
    private String mAuthor;
    private String mDescription;
    private Date mCreationDate;
    
    public Treet(String author, String description, Date creationDate){
        mAuthor = author;
        mDescription = description;
        mCreationDate = creationDate;
    }
    
    @Override
    public String toString(){
        return String.format(
            "Treet: \"%s\" by %s on %s",mDescription, mAuthor, mCreationDate);
    
    }
    @Override
  //  public int compareTo(Object obj){
     public int compareTo(Treet other){   
    //Treet other = (Treet) obj;
        if(equals(other)){
            return 0;
        }
        int dateCmp = mCreationDate.compareTo(other.mCreationDate);
        if(dateCmp == 0){
            return mDescription.compareTo(other.mDescription);
        }
        return dateCmp;
    
    }
    
   public String getAuthor(){
    return mAuthor;
   } 
    public String getDescription(){
        return mDescription;
    }
    
    public Date getCreationDate(){
        return mCreationDate;
    }
    
    public String[] getWords(){
        return mDescription.toLowerCase().split("[^\\w#@']+");
    }


}