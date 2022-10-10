package main.java.instrumentStore;

public class Instruments {  

    //instance variables
    private String name;
    private int strings;
    private String genre;

    public Instruments(String name, int strings, String genre){ 
    this.name = name;
    this.strings = strings;
    this.genre = genre;
    }

    public Instruments(){
    this.name = "    ";
    this.strings = 88;
    this.genre = "Pop";
    }
    
    public String getName (){
        return name;
    }

    public int getStrings(){
        return strings;
    }

    public String getGenre (){
        return genre;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setStrings (int newStrings){
        this.strings = newStrings;
    }

    public void setGenre (String newGenre){
        this.genre = newGenre;
    }
    public String toString(){
        return "The name of your instrument is: " + name + ", and the number of notes/strings/sounds playable is: " + strings + ", and your genre for this instrument is: " + genre;
    }
}