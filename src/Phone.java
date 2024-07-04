public class Phone {
    public void printLogo(String Logo){
        System.out.print(Logo);
    }
    public void buyPhone(String person, String name){
        System.out.println(person+"님이 "+name+"폰을 구매했습니다.");
    }
    public void turnOn(String person, String name){
        System.out.println(person+"님이 "+name+"폰을 켰습니다.");
    }

    public void turnOn(){
        System.out.print(" 폰 켜지는 중 ");
    }

}
