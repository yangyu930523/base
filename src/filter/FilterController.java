package filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demoFilter")
public class FilterController {

    @GetMapping("hello")
    public String hello() {
        System.out.println("接口被调用：hello() ");
        return "hello filter";
    }

    @GetMapping("hi")
    public String hi() {
        System.out.println("接口被调用：hi()");
        return "hi filter";
    }
}
