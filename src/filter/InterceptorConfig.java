package filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //&emsp;����ж��������������registry.add������ӾͿ�����
        registry.addInterceptor(new DemoInterceptor()).addPathPatterns("/demoInterceptor/**");
    }

}

