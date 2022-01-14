public class User {
    private long id;
    private String name;
    private String surname;
    private byte age;

    public static class Builder {
        private User user;

        public Builder() {
            user = new User();
        }

        public Builder withId(long id) {
            user.id = id;
            return this;
        }

        public Builder withName(String name) {
            user.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            user.surname = surname;
            return this;
        }

        public Builder withAge(byte age) {
            user.age = age;
            return this;
        }

        public User build() {
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
