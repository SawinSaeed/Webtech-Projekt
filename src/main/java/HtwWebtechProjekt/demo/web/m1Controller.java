package HtwWebtechProjekt.demo.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class m1Controller {
    @GetMapping("/")
    public ModelAndView returnM1() {return new ModelAndView("m1commit");}
}
