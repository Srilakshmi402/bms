package info.inetsolv;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MocInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext container = new AnnotationConfigWebApplicationContext();
		container.register(Mocutile.class);

		DispatcherServlet dispatcherServlet = new DispatcherServlet(container);
		Dynamic addServlet = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
		addServlet.setLoadOnStartup(1);
		addServlet.addMapping("/");
		container.close();
	}

}
