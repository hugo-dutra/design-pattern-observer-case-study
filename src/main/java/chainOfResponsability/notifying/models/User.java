package chainOfResponsability.notifying.models;

import chainOfResponsability.notifying.interfaces.UserObserver;

public class User implements UserObserver {
    private final String name;
    private final String email;
    private final String phone;
    private final String whatsApp;

    private User(String name, String email, String phone, String whatsApp) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.whatsApp = whatsApp;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWhatsApp() {
        return whatsApp;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", whatsApp='" + whatsApp + '\'' +
                '}';
    }

    @Override
    public void update(String message) {
        System.out.println("User: " + name + " - " + message);
    }

    public static class Builder {
        private String name;
        private String email;
        private String phone;
        private String whatsApp;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder whatsApp(String whatsApp) {
            this.whatsApp = whatsApp;
            return this;
        }

        public User build() {
            return new User(name, email, phone, whatsApp);
        }
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        return user.name.equals(name) &&
                user.email.equals(email) &&
                user.phone.equals(phone) &&
                user.whatsApp.equals(whatsApp);
    }



}
