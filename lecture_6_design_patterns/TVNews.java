public class TVNews implements Channel {

    @Override
    public void update(String news) {
        System.out.println("TV News: " + news);
    }

}
