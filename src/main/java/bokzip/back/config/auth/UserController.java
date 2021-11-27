package bokzip.back.config.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/logoutPage")
    public String logout(){
        return "로그아웃 되었습니다.";
    }

}
