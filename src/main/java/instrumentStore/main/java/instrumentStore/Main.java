package main.java.instrumentStore;
//As the general console, takes in user input through a Scanner. 
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //Generating a random value for the price of instruments
    java.util.Random rand = new java.util.Random ();
    int x = rand.nextInt(300);   

    //Instantiates the Scanner
    Scanner myScanner = new Scanner(System.in);

      System.out.println("Welcome to the instrument store! What instrument would you like to buy?");
    
      //Instantiates three subclasses
      Percussion myPercussion = new Percussion ();
      Strang myStrang = new Strang ();
      Wind myWind = new Wind ();
      
      //Allows users to select types of instruments
      int selection = 0;
      while (selection >= 0){
      System.out.println("\nWe sell three types of instruments. Press 1 for Percussion, 2 for Strings, 3 for Winds, and 4 for a random instrument!");
      selection = myScanner.nextInt();
      myScanner.nextLine();
      

      //For these if statements, the purpose is to provide questions and take in user input through utilizing myScanner.nextLine(); Then the program takes in the input and adds a random price tag. 
      //For this if statement in particular, when selection = 1, the program allows user input for percussion questions and specific instance variables (in this case, the drum type). 
      if (selection == 1){
      
      System.out.println("\nWhat percussion type would you like? (Ex. Drum kit, bass drum, snare, congos, bongos, triangles, maracas)");
      String drum = myScanner.nextLine();
      myPercussion.setDrum(drum);

      System.out.println("\nWhat genre would you like? (Ex. Jazz, Rock, Orchestra, African, Middle Eastern)");
      String genre = myScanner.nextLine();
      myPercussion.setGenre(genre);

      System.out.println("\nWhat is the name of your percussion? (Ex. Jazzy Bluebird, Retro Machine, Cambodian Kit)");
      String name = myScanner.nextLine();
      myPercussion.setName(name);

      System.out.println("\nHow many percussion would you like? (Ex. A drum set has 5 peices, while congos have 2)");
      int strings = myScanner.nextInt();
      myPercussion.setStrings(strings);

      System.out.println("\nCongradulations! Your percussion type is " + drum + ", your number of percussion is " + strings + ", your genre of selection for this percussion is " + genre + ", the name of your percussion is " + name + " and finally, the price of your percussion is $" + x);
      System.out.println("\nYou have bought a " + genre + " " + drum + " " + strings + " peice percussion named " + name + " for the price of $" + x);
      }

      //For this if statement in particular, when selection = 2, the program allows user input for strings questions and specific instance variables (in this case, the range of the string instrument). 
      if (selection == 2){
        System.out.println("\nWhat strings range would you like? (Ex. Soprano, Alto, Tenor, Bass)");
        String range = myScanner.nextLine();
        myStrang.setRange(range);
  
        System.out.println("\nWhat genre would you like? (Ex. Classical, Modern, European, Latin, Chinese)");
        String genre = myScanner.nextLine();
        myStrang.setGenre(genre);
  
        System.out.println("\nWhat is the name of your strings? (Ex. Bossa Nova Guitar, Hawaiian Uke, Spanish Guitar)");
        String name = myScanner.nextLine();
        myStrang.setName(name);
  
        System.out.println("\nHow many strings would you like? (Ex. A guitar has 6 strings, while a cello has 4)");
        int strings = myScanner.nextInt();
        myStrang.setStrings(strings);
  
        System.out.println("\nCongradulations! Your string range is " + range + ", your number of strings is " + strings + ", your genre of selection for this string instrument is " + genre + ", the name of your string instrument is " + name + " and finally, the price of your string instrument is $" + x);
        System.out.println("\nYou have bought a " + genre + " " + range + " " + strings + " stringed instrument named " + name + " for the price of $" + x);
      }

      //Same thing, but for winds
      if (selection == 3){
        System.out.println("\nWhat wind color would you like? (Ex. Black, Bronze, Gold, Crimson)");
        String color = myScanner.nextLine();
        myWind.setColor(color);
  
        System.out.println("\nWhat genre would you like? (Ex. Jazz, Classical, Experimental, Expressionist)");
        String genre = myScanner.nextLine();
        myWind.setGenre(genre);
  
        System.out.println("\nWhat is the name of your wind? (Ex. Flute, Bassoon, Clarinet, Grand Old Tuba, Alto Sax)");
        String name = myScanner.nextLine();
        myWind.setName(name);
  
        System.out.println("\nHow many keys/valves would you like? (Ex. A clarinet has 17 keys, while a trumpet has 3 valves");
        int strings = myScanner.nextInt();
        myWind.setStrings(strings);
  
        System.out.println("\nCongradulations! Your wind color is " + color + ", your number of keys/valves is " + strings + ", your genre of selection for this wind instrument is " + genre + ", the name of your wind instrument is " + name + " and finally, the price of your wind instrument is $" + x);
        System.out.println("\nYou have bought a " + genre + " " + color + " " + strings + " keys instrument named " + name + " for the price of $" + x);
      }

      //Creates an array list, and creates a random number generator to generate a random instrument
      if (selection == 4){
        String[] arr = {"Violin", "Viola", "Cello", "Double Bass", "Flute", "Oboe", "Bassoon", "Clarinet", "Horn", "Saxophone", "Trumpet", "Trombone", "Tuba", "Snare", "Piano", "Vibraphone", "Marimba", "Koto", "Erhu", "Guzheng", "Classical Guitar", "Electric Guitar", "Electric Piano", "Rhoades", "Synthesizer", "Mellotron"};
        Random randd = new Random ();
        int randomNumber = randd.nextInt(arr.length);
        System.out.println(arr[randomNumber]);
      }
      //Prevents users from entering integers larger than 3
      if (selection > 4){
        System.out.println("Stop attempting to enter a number bigger than 3");
      }
    }
      System.out.println("How dare you enter a negative number and quit the program");
      myScanner.close();
  }

}
