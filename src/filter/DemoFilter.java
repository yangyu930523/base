package filter;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Order(1)   // ����˳��ֵԽСԽ��ִ��
@WebFilter(urlPatterns = "/demoFilter", filterName = "filterTest")
public class DemoFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter��ʼ����...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("\ndoFilter()��ʼִ�У����� " + ((HttpServletRequest) servletRequest).getRequestURL().toString() + " �������ѱ�����");

        System.out.println("����ӿ��Ƿ񱻵��ã����Ի�ȡcontentType���£� " + servletResponse.getContentType());
        // filter����ʽ���ã�������ת����һ��������
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("����ӿ��Ƿ񱻵��ã����Ի�ȡcontentType���£� " + servletResponse.getContentType());

        System.out.println("doFilter()ִ�н�����\n");
    }

    @Override
    public void destroy() {
        System.out.println("filter������...");
    }
}
