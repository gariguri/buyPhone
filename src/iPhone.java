public class iPhone extends Phone{
    private final static String Logo="@@@";
    public void printLogo(){
        super.printLogo(Logo);

    }
    public void buyPhone(){
        super.buyPhone("잡스", "애플");
    }
    public void turnOn(){
        super.turnOn("잡스", "애플");
        this.printLogo();
        super.turnOn();
        this.printLogo();
    }
}
