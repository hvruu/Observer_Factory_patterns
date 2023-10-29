package observer;
import java.util.List;
import java.util.Arrays;
public class ConfectioneryApp {
    public static void main(String[] args) {
        AssortmentDB assortmentData =  new AssortmentDB();

        assortmentData.addAssortment("Carrot Cake");
        assortmentData.addAssortment("Red Velvet Cake");

        List<String> subscriberNames = Arrays.asList("Bekzat", "Mira", "Nur");

        for (String name : subscriberNames) {
            Observer subscriber = new AppSubscriber(name);
            assortmentData.addObserver(subscriber);
        }

        assortmentData.addAssortment("Fruitcake");

        assortmentData.removeAssortment("Red Velvet Cake");

    }
}
