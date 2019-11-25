package filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Order(2)   // ����˳��ֵԽСԽ��ִ�У�ֵ��ͬ��ָ��ʱ��filterName����
// ע�������urlPatternsҪ��ǰ�汣��һ��
@WebFilter(urlPatterns = "/demoFilter", filterName = "filterTest2") 
public class DemoFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter2��ʼ����...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("\ndoFilter2()��ʼִ�У����� " + ((HttpServletRequest) servletRequest).getRequestURL().toString() + " �������ѱ�����");

        System.out.println("����ӿ��Ƿ񱻵��ã����Ի�ȡcontentType���£� " + servletResponse.getContentType());
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("����ӿ��Ƿ񱻵��ã����Ի�ȡcontentType���£� " + servletResponse.getContentType());

        System.out.println("doFilter2()ִ�н�����\n");
    }

    @Override
    public void destroy() {
        System.out.println("filter2������...");
    }
}

