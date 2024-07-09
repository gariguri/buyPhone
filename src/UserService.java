public class UserService {
    UserDAO userDAO= new UserDAO(); //DB를 한번만 생성
    public void join(User user){ //사용자의 시선

        userDAO.createUser(user); //데이터의 시선

    }
    public void login(User user){
        String userPw=userDAO.getUser(user.getId());
        if(userPw==null){
            System.out.println("회원 정보가 없습니다.");

        }else if (!userPw.equals(user.getPw())) {
            System.out.println("비밀번호가 틀립니다.");
        }else{
            System.out.println("로그인 성공!");
            Main.isLogin=1;
        }
    }
    public void changePw(User user){
        userDAO.updateUser(user);
    }
    public void deleteUser(User user){
        userDAO.removeUser(user);
    }
}
