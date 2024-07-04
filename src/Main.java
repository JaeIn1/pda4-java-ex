//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        iPhone iPhone=  new iPhone("애플" , "잠스");
        iPhone.turnOn();
        System.out.println("================");
        Galaxy galaxy = new Galaxy("삼송", "재용");
        galaxy.turnOn();
    }
}