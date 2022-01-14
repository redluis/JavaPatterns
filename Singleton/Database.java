public class Database {
    private static Database instance = null;
    private String userDB;
    private String hostDB;

    private Database() {}

    private Database(String userDB, String hostDB) {
        this.userDB = userDB;
        this.hostDB = hostDB;
    }

    public static Database getInstance(String userDB, String hostDB) {
        if (instance == null) {
            instance = new Database(userDB, hostDB);
        }
        return instance;
    }

    // just for example
    public Object get() {return null;}
    public void insert(Object o) {}
    public void update(Object o) {}
    public boolean delete() {return false;}


    @Override
    public String toString() {
        return "Database{" +
                "userDB='" + userDB + '\'' +
                ", hostDB='" + hostDB + '\'' +
                '}';
    }
}
