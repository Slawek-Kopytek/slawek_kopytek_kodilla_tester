public class SimpleArray {
    public static void main(String[] args) {
    String[] stocks = new String[5];
    stocks[0] = "Drago Entertainment";
    stocks[1] = "Galvo";
    stocks[2] = "Columbus";
    stocks[3] = "Prime Bit Games";
    stocks[4] = "Bumech";

    //Picking particular element of array
    String stock = stocks[2];
    System.out.println(stock);

    // Checking length of array
    int numberOfElements = stocks.length;
    System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}
