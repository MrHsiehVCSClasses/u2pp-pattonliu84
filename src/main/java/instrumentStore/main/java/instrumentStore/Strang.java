package main.java.instrumentStore;

public class Strang extends Instruments{
    
private String range;
    
public Strang (){
    super();
    this.range = "soprano";
}

public Strang (String name, int strings, String genre, String range){
    super (name, strings, genre);
    this.range = range;
}

public String getRange(){
    return range;
}

public void setRange(String newRange){
    this.range = newRange;
}

public String toString (){
    return super.toString () + "; Your instrument type is strings, and the range of your string instrument is: " + range;
}
}
