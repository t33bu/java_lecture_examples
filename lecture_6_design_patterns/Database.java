public class Database {
    // private, with static instance always created
    private static Database singleInstance = null;

    // private constructor!
    private Database() {      
    }
 
    // Static method eturns the same object
    public static Database getInstance() {
        if(singleInstance == null) {
            singleInstance = new Database();
        }
        return singleInstance;
    }

    public void getConnection() {
        System.out.println("Connected to MySQL");
    }
}

