package App;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Controller
public class MainApp {
	@RequestMapping("/hi")
public @ResponseBody String main1 ()
{
	ApplicationContext cntext=new ClassPathXmlApplicationContext("spring/application-config.xml");
    App_bean ob=(App_bean)cntext.getBean("n1");
    App_bean ob1=(App_bean)cntext.getBean("n3");
    String s=ob.getMsg();
   
    
    return s;
}
}
