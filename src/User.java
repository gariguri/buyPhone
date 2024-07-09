public class User {
    // User을 따로 둔 이유? 사전 설계 나중을 대비해서 미리 확장한 것 여러가지 데이터를 받을 것이기 때문..!
    // static 변수로 ID 카운터를 유지

    private String name;
    private String id;
    private String pw;
    public User(){

    }
    public User(String id, String pw) {
        this.id=id;
        this.pw=pw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getId(){return id;}
    public String getPw(){return pw;}
    public String getName() {
        return name;
    }
}
