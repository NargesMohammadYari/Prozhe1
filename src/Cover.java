public class Cover {
    private String brand;
    public static int mojudi;
    private long prise;

    public Cover() {
    }

    public Cover(String brand, long prise) {
        this.brand = brand;
        this.prise = prise;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrise() {
        return prise;
    }

    public void setPrise(long prise) {
        this.prise = prise;
    }
}
