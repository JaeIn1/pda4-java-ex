public class Galaxy implements Phone{
    private final String brand;

    public Galaxy(){
        this.brand = "삼성폰";
    }
    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void turnOn() {
        System.out.println("*** 폰 켜지는 중 ***");
    }
}
