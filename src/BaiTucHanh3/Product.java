package BaiTucHanh3;

public class Product {
    private String nameSp;
    private String id;
    private int price;

    public Product(){}

    public Product(String nameSp, String id, int price) {
        this.nameSp = nameSp;
        this.id = id;
        this.price = price;
    }

    public String getNameSp() {
        return nameSp;
    }

    public void setNameSp(String nameSp) {
        this.nameSp = nameSp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "nameSp = " + nameSp +
                ", id = " + id +
                ", price = " + price +
                '}'+"\n";
    }
}
