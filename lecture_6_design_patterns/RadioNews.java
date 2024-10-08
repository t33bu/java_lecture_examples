public class RadioNews implements Channel {

    @Override
    public void update(String news) {
        System.out.println("Radio News: " + news);
    }

}
