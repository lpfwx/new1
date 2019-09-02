package com.hyxy.hamper;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class HamperConfig implements WebMvcConfigurer{
	@Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      // addPathPatterns 用于添加拦截规则
	      // excludePathPatterns 用于排除拦截
	      InterceptorRegistration addInterceptor = registry.addInterceptor(new Hamper());
	      // 排除配置,排除所有静态文件和不拦截的路径
	      addInterceptor.addPathPatterns("/**"); // 过滤全部请求
	      // 排除配置,排除所有静态文件
	      addInterceptor.excludePathPatterns("/**/*.js");
	      addInterceptor.excludePathPatterns("/**/*.jpg"); // jpg静态文件不拦截
	      addInterceptor.excludePathPatterns("/img/**"); // jpg静态文件不拦截
	      // 或
	      // addInterceptor.excludePathPatterns("/**/*.jpg","/user/select");
	      // addInterceptor.excludePathPatterns("/userLogin","/css/**","/images/**","/js/**","/login.html");
	   }

}
