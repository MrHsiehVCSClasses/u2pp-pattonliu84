package main.java.instrumentStore;

public class Wind extends Instruments{
    
private String color;
    
public Wind (){
    super();
    this.color = "yellow";
}

public Wind (String name, int strings, String genre, String color){
    super (name, strings, genre);
    this.color = color;
}

public String getColor(){
    return color;
}

public void setColor(String newColor){
    this.color = newColor;
}

public String toString (){
    return super.toString () + "; Your instrument type is wind, and the color of your wind instrument is: " + color;
}
}
