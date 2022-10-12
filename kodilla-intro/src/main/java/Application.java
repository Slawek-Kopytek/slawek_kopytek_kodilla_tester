public class Application {
    String name;
    double age;
    double height;

    public Application (String name, double age, double height ) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void condition(){
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older then 30 and taller then 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

}

