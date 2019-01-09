package com.rest.api;
/*package com.rest.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/home").setViewName("home");
	}

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	
	 * @Bean public JavaMailSenderImpl javaMailSenderImpl(){ JavaMailSenderImpl
	 * mailSender = new JavaMailSenderImpl(); mailSender.setHost("joyam.in");
	 * mailSender.setPort(465); //Set gmail email id
	 * mailSender.setUsername("test@joyam.in"); //Set gmail email password
	 * mailSender.setPassword("test@123"); Properties prop =
	 * mailSender.getJavaMailProperties(); prop.put("mail.transport.protocol",
	 * "smtp"); prop.put("mail.smtp.auth", "true");
	 * //prop.put("mail.smtp.starttls.enable", "true");
	 * prop.put("mail.smtp.socketFactory.port", "465"); //SSL Port
	 * prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory"
	 * ); //SSL Factory Class prop.put("mail.debug", "true"); return mailSender;
	 * }
	 

}*/