package filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Order(2)   // 过滤顺序，值越小越先执行，值相同或不指定时按filterName排序
// 注意这里的urlPatterns要与前面保持一致
@WebFilter(urlPatterns = "/demoFilter", filterName = "filterTest2") 
public class DemoFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter2初始化中...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("\ndoFilter2()开始执行：发往 " + ((HttpServletRequest) servletRequest).getRequestURL().toString() + " 的请求已被拦截");

        System.out.println("检验接口是否被调用，尝试获取contentType如下： " + servletResponse.getContentType());
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("检验接口是否被调用，尝试获取contentType如下： " + servletResponse.getContentType());

        System.out.println("doFilter2()执行结束。\n");
    }

    @Override
    public void destroy() {
        System.out.println("filter2销毁中...");
    }
}

