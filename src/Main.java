import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static UserService userService = new UserService();
    static User curUser;

    public static void main(String[] args) {
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        while(flag){
            System.out.print("1.회원가입 / 2.로그인 / 3.회원정보 수정 / 4. 탈퇴 / 0.종료\n입력 : ");
            int input = -1;
            try {
                input = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("유효한 숫자를 입력해주세요.");
                scanner.nextLine(); // 잘못된 입력을 지우기 위해 필요
                continue; // 루프의 처음으로 돌아감
            }

            switch (input){
                case 0:
                    flag = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case 1:
                    select1(scanner);
                    break;
                case 2:
                    select2(scanner);
                    break;
                case 3:
                    select3(scanner);
                    break;
                case 4:
                    select4();
                    break;
            }
        }
    }

    //회원가입
    private static void select1(Scanner scanner){
        System.out.println("가입할 아이디와 비밀번호, 이름을 (띄어쓰기로 구분하여) 입력하세요");
        String idPw = scanner.nextLine();
        String[] list = idPw.split(" ");
        if (list.length != 3) {
            System.out.println("입력 형식이 맞지 않습니다.");
            return;
        }

        User user = new User(list[0] , list[1] , list[2]);
        userService.join(user);
    }
    //로그인
    private static void select2(Scanner scanner) {
        System.out.println("로그인할 아이디와 비밀번호를 (띄어쓰기로 구분하여) 입력하세요");
        String idPw = scanner.nextLine();
        String[] list = idPw.split(" ");
        if (list.length != 2) {
            return;
        }
        curUser = userService.login(list[0], list[1]);
        if (curUser != null) {
            System.out.println(curUser.getName() + "님 환영합니다.");
        } else {
            System.out.println("로그인 실패. 아이디와 비밀번호를 확인하세요.");
        }
    }
    //수정
    private static void select3(Scanner scanner){
        if(curUser == null){
            System.out.println("로그인을 먼저 진행해주세요.");
        }
        else{
            System.out.println("수정할 로그인할 아이디와 비밀번호를 (띄어쓰기로 구분하여) 입력하세요. ");
            String idPw = scanner.nextLine();
            String[] list = idPw.split(" ");
            userService.updateUserInfo(curUser, list[0], list[1]);
            System.out.println("수정된 정보\n아이디 : "+ curUser.getId() + "\n비밀번호 : " + curUser.getPw());
        }
    }
    //탈퇴
    private static void select4(){
        userService.deleteAccount(curUser);
        curUser = null;
    }
}