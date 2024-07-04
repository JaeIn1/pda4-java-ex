public abstract class Phone {
    //  필드
    public String brand; // 삼성 , 애플 이런거
    public String name;

    public Phone(String brand , String name) {
        this.brand = brand;
        this.name = name;
    }

    public abstract void turnOnText();
    void purchasePhone (){
        System.out.println(name+"님이 " + brand + "폰을 구매했습니다.");
    }
    void turnOn(){
        purchasePhone();
        System.out.println(name+"님이 " + brand + "폰을 켰습니다.");
        turnOnText();
    }

}

