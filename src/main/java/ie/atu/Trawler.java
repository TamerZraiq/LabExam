package ie.atu;

import java.util.ArrayList;

public class Trawler {
    String Name;
    int [] TransponderID = new int[11];
    String Type;




    public Trawler(String name, int transponderID, String type) {
        Name = name;
        TransponderID = new int[]{transponderID};
        Type = type;
    }

    public Trawler() {
        Name = "";
        TransponderID = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Type = "";
    }


    public void displayInfo(){
        System.out.println("Name: "+ Name);
        System.out.println("Type: " + Type);
        System.out.print("Transponder ID: ");
        for(int value : TransponderID) {
            System.out.print(" " + value);
            value++;
        }

    }
}
