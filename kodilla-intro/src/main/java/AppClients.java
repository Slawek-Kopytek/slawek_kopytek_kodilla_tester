public class AppClients {
    public static void main(String[] args) {
        Application firstClient = new Application("Adam", 40.5, 178);
        System.out.println("Name of client: " + firstClient.name + " Age: " + firstClient.age + " Height: " + firstClient.height);
        firstClient.condition();
    }
}
