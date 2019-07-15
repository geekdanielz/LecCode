package comp2100.types.observer;

/**
 * Demo of observer design pattern
 * Taken from Wikipedia
 *
 */
public class ObserverDemo {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();
        
        eventSource.addObserver(event -> {
            System.out.println("[Observer 1] Received response: " + event);
        });

        eventSource.addObserver(event -> {
            System.out.println("[Observer 2] Received response: " + event);
        });
        
        eventSource.scanSystemIn();
    }
}
