public class UserService{
    UserDAO userDAO = new UserDAO();

    // 1. 회원가입
    public void join(User user) {
        // 이렇게 작성하면 가입이 될 때마다 db가 계속 생성된다.
        // 이렇게 말고 하나만 사용하도록 바꾸는게 필요
        // UserDAO userDAO = new UserDAO();
        // 서비스는 save라고 작성하는게 더 좋다.
        userDAO.save(user);
        System.out.println(user.getName() + "님 가입을 환영합니다.");
    }

    // 2. 로그인
    public User login(String id, String pw) {
        User user = userDAO.getUserById(id);
        if (user != null && user.getPw().equals(pw)) {
            return user;
        }
        return null;
    }

    // 3. 회원정보 수정
    public void updateUserInfo(User user, String newId, String newPw){
        if (newId != null && !newId.isEmpty()) {
            user.setId(newId);
        }
        if (newPw != null && !newPw.isEmpty()) {
            user.setPw(newPw);
        }
        userDAO.updateUserInfo(user.getKey(), user);  // 수정된 정보를 저장합니다.
        System.out.println("회원정보가 성공적으로 수정되었습니다.");
    };


    // 4. 탈퇴
    public void deleteAccount(User user){
        userDAO.deleteUser(user);
        System.out.println("회원 탈퇴가 완료 되었습니다.");
    };
}
