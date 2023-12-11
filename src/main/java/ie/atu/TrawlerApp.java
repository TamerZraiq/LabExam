package ie.atu;
import java.io.IOException;
public class TrawlerApp {
    public static void main(String[] args) {
        Trawler vessel1 = new Trawler();
        Trawler vessel2 = new Trawler();

        try {
            vessel1.Name = "TamerZraiq";
            vessel1.TransponderID = new int[]{1, 0, 0, 4, 5, 6, 7, 8, 9, 0, 0};
            vessel1.Type = "Freezer";
            System.out.println(" ");
            if(vessel1.Name == " " ){
                System.out.println("Name invalid");
            }
            if(vessel1.Type == "Freezer" || vessel1.Type == "Stern" || vessel1.Type == "OutRigger"){
                vessel1.displayInfo();
            }else{
                System.out.println("Invalid Trawler Type");
            }

            vessel2.Name = "JohnDoe";
            vessel2.TransponderID = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            vessel2.Type = "Stern";
            System.out.println(" ");
            if(vessel2.Name == " " ){
                System.out.println("Name invalid");
            }
            if(vessel2.Type == "Freezer" || vessel2.Type == "Stern" || vessel2.Type == "OutRigger"){
                vessel2.displayInfo();
            }else{
                System.out.println("Invalid Trawler Type");
            }

        }catch(Exception e){
            System.out.println("Invalid Entry");

        }

    }
}
