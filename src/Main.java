import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    static UserService userService=new UserService();
    public static int isLogin=0;
    public static void main(String[] args) {
        User user=new User();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("1: 회원가입 / 2: 로그인 / 3: 회원정보 수정 / 4: 탈퇴 / 0: 종료");
            System.out.print("입력: ");
            String number=scanner.nextLine();
            if(number.equals("0")) {
                break;
            }
            if(number.equals("1")){
                System.out.println("가입하실 아이디와 비밀번호를 (띄어쓰기로 구분하여) 입력하세요.");
                System.out.print("입력: ");
                String idpw=scanner.nextLine();
                String [] parts =idpw.split(" ");
                String id=parts[0];
                String pw=parts[1];

                user.setId(id);
                user.setPw(pw);
                userService.join(user);
            }
            if(number.equals("2")){
                System.out.println("아이디와 비밀번호를 (띄어쓰기로 구분하여) 입력하세요");
                System.out.print("입력: ");
                String idpw=scanner.nextLine();
                String [] parts =idpw.split(" ");
                String id=parts[0];
                String pw=parts[1];
                user.setId(id);
                user.setPw(pw);
                userService.login(user);
            }
            if(number.equals("3")){
                if(isLogin==0){
                    System.out.println("로그인 상태가 아닙니다.");
                }
                else{
                    System.out.println("새 비밀 번호를 입력해주세요.");
                    System.out.print("새 비밀번호: ");
                    String newPw=scanner.nextLine();
                    user.setPw(newPw);
                    userService.changePw(user);
                }
            }
            if(number.equals("4")){
                if(isLogin==0){
                    System.out.println("로그인 상태가 아닙니다.");
                }
                else{
                    userService.deleteUser(user);
                }
            }

        }
        //아래 코드를 실행했을 때, "00님 가입을 환영합니다."

//        Galaxy galaxy23=new Galaxy();
//        Person jobs=new Person();
//        jobs.buyPhone(galaxy23);
//        jobs.turnOnPhone();
//
//        System.out.println("\n\n------------------\n");
//        iPhone iphone=new iPhone();
//        Person jaeyong=new Person();
//        jaeyong.buyPhone(iphone);
//        jaeyong.turnOnPhone();
    }
}