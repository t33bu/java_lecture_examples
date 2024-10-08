import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    // Observers
    private List<Channel> observerList = new ArrayList<>();

    // Note the use of interface as parameter
    public void registerObserver(Channel channel) {
        this.observerList.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.observerList.remove(channel);
    }

    // Deliver news to observers through interface
    public void notify(String news) {
        this.news = news;
        for (Channel channel : this.observerList) {
            channel.update(this.news);
        }
    }
}

