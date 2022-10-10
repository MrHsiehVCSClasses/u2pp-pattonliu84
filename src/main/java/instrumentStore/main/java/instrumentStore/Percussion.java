package main.java.instrumentStore;

public class Percussion extends Instruments{
    
private String drum;

public Percussion (){
    super();
    this.drum = "snare";

}
public Percussion (String name, int strings, String genre, String drum){
    super(name, strings, genre);
    this.drum = drum;
}

public String getDrum (){
    return drum;
}
public void setDrum(String newDrum){
    this.drum = newDrum;

}

public String toString (){
    return super.toString() + "; Your instrument type is percussion, and your percussion type is: " + drum;
}
}