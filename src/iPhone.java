public class iPhone extends Phone{
    public iPhone(String brand , String name) {
        super(brand , name);
    }

    @Override
    public void turnOnText() {
        System.out.println("@@@ 폰 켜지는중 @@@");
    }
}

