public class Mobile {
    private String brand, model;
    public static int mojudi;
    private long prise;

    public Mobile(String brand, long prise) {
        this.brand = brand;
        this.prise = prise;
    }

    public Mobile() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getprise() {
        return prise;
    }

    public void setPrise(long id) {
        this.prise = prise;
    }
}
