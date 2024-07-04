//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person jobs = new Person("잠스");
        Phone iphone = new iPhone();
        jobs.buyPhone(iphone);
        jobs.turnOn();

        Person jae = new Person("재용");
        Phone samsung = new Galaxy();
        jae.buyPhone(samsung);
        jae.turnOn();
    }
}