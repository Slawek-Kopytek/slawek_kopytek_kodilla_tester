public class User {
    String name;
    int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    public static void main(String[] args){
        User tomasz = new User("Tomasz", 62);
        User alicja = new User("Alicja", 39);
        User agata = new User("Agata", 26);
        User olaf = new User("Olaf", 20);
        User jan = new User("Jan", 46);
        User beata = new User("Beata", 5);
        User mateusz = new User("Mateusz", 70);
        User krzysztof= new User("Krzysztof", 15);

        User[] users = {tomasz, alicja, agata, olaf, jan, beata, mateusz, krzysztof};

        double total = 0;
        for(int i = 0; i < users.length; i++) {
            total += users[i].getAge();
        }
        double average = total / users.length;
        System.out.println("Sum of users age: " + total);
        System.out.println("Average age: " + average);

        for(int i = 0; i< users.length; i++){
            if(users[i].age < average){
                System.out.println("Below average age: " + users[i].name);
            }
        }
    }
}
