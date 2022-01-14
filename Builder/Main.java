public class Main {
    public static void main(String[] args) {
        User user1 = new User.Builder()
                .withId(1)
                .withName("Red")
                .withSurname("Reddie")
                .withAge((byte)18)
                .build();

        User user2 = new User.Builder()
                .withId(1)
                .withName("Luis")
                .withSurname("Luissie")
                .withAge((byte)18)
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
