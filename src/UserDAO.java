import java.util.HashMap;
import java.util.Map;

public class UserDAO { //=> Repository



    Map<String, String> db=new HashMap<>();
    public void createUser(User user){
        db.put(user.getId(), user.getPw());
        System.out.println(user.getId()+"님 가입을 환영합니다.");
    }
   // HashMap<Integer, String> db=new HashMap<>();
    //제네릭: <> 안에 넣고 싶은거 다 넣어도 돼, 객체/타입면 다 됨~ data를 명시하지 않았어, 다 넣어도 돼  타입과 객체와
    //객체만 받아주기 때문에 int가 들어가지 못하기 때문에 쓰기 편하게 한겹 싸서 integer를 생성, refer class를 등장시킴
    public String getUser(String id){
        String pw=db.get(id);
        if (pw==null){
            return null;
        }
        return pw;
    }
    public void updateUser(User user){
        db.put(user.getId(), user.getPw());
        System.out.println("수정이 완료되었습니다.");
    }
    public void removeUser(User user){
        db.remove(user.getId());
        System.out.println("탈퇴가 완료되었습니다.");
    }
}


