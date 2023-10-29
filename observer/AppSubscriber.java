package observer;
import java.util.List;

public class AppSubscriber implements Observer{
    String name;

    public AppSubscriber(String name){
        this.name = name;
    }
    @Override
    public void handleEvent(List<String> assortment) {
        System.out.println("Dear " + name + "\nWe have some changes in assortment:\n" + assortment +
                "\n=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+\n");
       }
}
