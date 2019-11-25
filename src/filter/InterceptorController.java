package filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demoInterceptor")
public class InterceptorController {

    @GetMapping("hello")
    public String hello() {
        System.out.println("�ӿڱ����ã�hello() ");
        return "hello interceptor";
    }

    @GetMapping("hi")
    public String hi() {
        System.out.println("�ӿڱ����ã�hi()");
        return "hi interceptor";
    }
}

