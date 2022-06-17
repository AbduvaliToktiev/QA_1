import java.util.ArrayList;

public class Stock {
    private int volume = 50;
    private ArrayList<Product> product;

    public Stock() {

    }

    public Stock(int volume, ArrayList<Product> product) {
        this.product = product;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Склад " +
                "\nобъём = " + getVolume() +
                "\nпродукт = " + getProduct() + "\n";
    }
}
