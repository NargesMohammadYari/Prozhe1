public class Glass {
    public static int mojudi;
    private String brand;
    private long prise;

    public Glass() {
    }

    public Glass(String brand, long prise) {
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
