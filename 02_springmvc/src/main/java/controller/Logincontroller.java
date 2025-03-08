package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.Uservo;

@Controller
public class Logincontroller {
	
	//@RequestMapping(value = "/login" ,method= {RequestMethod.GET})
	//@RequestMapping(value = "/login" ,method= {RequestMethod.POST})
	@GetMapping("/login")
	//@PostMapping("/login")
    public String login(@RequestParam("jspusername") String username,@RequestParam(value = "jsppassword",required = false) String password) {
		System.out.println("uaername:"+ username);
		System.out.println("password:"+ password);
		
		if(username.equals("HelloKitty")) {
			return "loginSuccess";
		}else {
			return "loginFail";
		}
   
    }
	
	 
	// "?" 匹配一個字元 test1, test2 -> OK, test10 -> NO
	//@RequestMapping("/pattern/test?")
	public String pattern1() {
	    System.out.println("Pattern: /pattern/test?");
	    return "loginSuccess";
	}
	
	// "*" 匹配多個字元 test10, test100 -> OK
	//@RequestMapping("/pattern/test*")
	public String pattern2() {
	    System.out.println("Pattern: /pattern/test*");
	    return "loginSuccess";
	}
	
	// "**" 匹配零個或多個路徑，路徑名稱任意 /abcd, /abcd/defg -> OK
	@RequestMapping("/pattern/*？")
	public String pattern3() {
	    System.out.println("Pattern: /pattern/**");
	    return "loginSuccess";
	}
	
	
	@RequestMapping(value = "/loginRequest")
    public String loginRequest(HttpServletRequest req,HttpServletResponse res) {
    // 取得QueryString的參數值
    String username = req.getParameter("username");
    String password = req.getParameter("password");
    req.setAttribute("user", "佛殺凱蒂貓");
    return "loginSuccess";
	}
	@GetMapping("/login/user/{u1}")
	public String testPath(@PathVariable("u1") String username) {
		System.out.println("username:"+username);
		return "loginSuccess";
	}
	@RequestMapping("param/class")
	public String getHobby(Uservo user) {
		System.out.println(user);
		return "loginSuccess";
	}
	
	@RequestMapping(value = "/loginModel")
	public String loginModel(@RequestParam("jspusername") String username,@RequestParam("jsppassword") String password, Model model) {
	    model.addAttribute("user", "佛殺凱蒂貓二世");
	    return "loginSuccess";
	}
	
	@RequestMapping(value = "/loginModelAndView")
	public ModelAndView loginModelAndView(Uservo user) {
	    ModelAndView mv = new ModelAndView();
	    // 設置視圖名稱
	    mv.setViewName("loginSuccess");
	    // 添加模型資料
	    mv.addObject("user", user);
	    return mv;
	}
	
	// 應用在方法參數上
	@RequestMapping(value = "/loginModelAttribute")
	public String loginModel(@ModelAttribute("user3") Uservo user) {
	    return "loginFail";
	}
	
	//有點類似全域變數
	@ModelAttribute("title")
	public String title() {
		return "我是標題";
	}
}
