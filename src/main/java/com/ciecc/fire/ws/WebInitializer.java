package com.ciecc.fire.ws;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.ciecc.fire.ws.config.WebSocketConfig2;
import com.ciecc.fire.ws.web.MvcConfig;

/***
 * 
 * @author fire
 *
 */
public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();

		webApplicationContext.register(MvcConfig.class, WebSocketConfig2.class); //, WebSocketConfig.class
		webApplicationContext.setServletContext(servletContext);

		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(webApplicationContext));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);

	}

}
