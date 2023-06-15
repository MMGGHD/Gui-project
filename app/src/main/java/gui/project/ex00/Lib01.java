package gui.project.ex00;

import com.google.gson.Gson;

class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

public class Lib01 {
    public static void main(String[] args) {
        User user = new User();
        // 통신을 하려면 데이터를 json이라는 문자열로 바꾸어야한다.
        user.setUsername("ssar");
        user.setPassword("1234!");

        String testData = "{\"username\":\"ssar\"}";
        System.out.println(testData);
        Gson gson = new Gson();
        String requestBody = gson.toJson(user); // toJson << 라이브러리안의 메서드
        System.out.println(requestBody);
    }
}
