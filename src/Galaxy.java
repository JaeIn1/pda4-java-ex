public class Galaxy extends Phone{

    public Galaxy(String brand , String name) {
        super(brand , name);
    }
    @Override
    public void turnOnText(){
        System.out.println("*** 폰 켜지는중 ***");
    }

}
