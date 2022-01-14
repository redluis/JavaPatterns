public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance("user1", "host1");
        Database db2 = Database.getInstance("user2", "host2");
        System.out.println(db1);
        System.out.println(db2);
    }
}
