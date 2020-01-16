package SpringLogin.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import test1.UserService;

@Controller
public class HomeController {

//    @Autowired
//    UserService userService;

//	userListのアドレスにアクセスした際にGetメソッドを実行。
    @GetMapping("/userList")
    public String getUserList(Model model) {

//        List<User> userList = userService.selectMany();
//        System.out.println(userList);
//        model.addAttribute("userList", userList);

    	//template配下のファイル名を指定することでViewを呼び出せる。
        return "userList";
    }

}