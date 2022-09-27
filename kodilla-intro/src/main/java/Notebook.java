public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000){
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This notebook is so light!");
        } else if (this.weight >= 800 && this.weight <= 1500){
            System.out.println("This notebook is of medium weight.");
        } else {
            System.out.println("This notebook is quite heavy.");
        }
    }

    public void checkBestOptionToBuy(){
        if (this.year>=2020 && this.price<=1500){
            System.out.println("This notebook is just worth buying.");
        } else if (this.year>2020 && this.price>=1500){
            System.out.println("Don't buy it.");
        } else if (this.year<2020 && this.price>700){
            System.out.println("Check the other notebook if you want to have good performance!");
        }
        else {
            System.out.println("Not too much, but works");
        }
    }
}
