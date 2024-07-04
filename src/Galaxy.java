public class Galaxy extends Phone{
    private final static String Logo="***";
    public void printLogo(){
        super.printLogo(Logo);
    }
    public void buyPhone(){
        super.buyPhone("재용", "삼송");
    }
    public void turnOn(){
        super.turnOn("재용", "삼송");
        this.printLogo();
        super.turnOn();
        this.printLogo();
    }
}
