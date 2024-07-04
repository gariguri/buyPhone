public class Main {
    public static void main(String[] args) {

        iPhone iphone=new iPhone();
        iphone.buyPhone();
        iphone.turnOn();
        System.out.println("\n\n------------------\n");
        Galaxy galaxy=new Galaxy();
        galaxy.buyPhone();
        galaxy.turnOn();
    }
}