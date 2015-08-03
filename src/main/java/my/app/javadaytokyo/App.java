package my.app.javadaytokyo;

import com.sun.faces.config.FacesInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Collections;

@SpringBootApplication
@ComponentScan(scopedProxy = ScopedProxyMode.TARGET_CLASS)
public class App extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.jsf");
    }

    @Bean
    ServletRegistrationBean facesServletRegistration() {
        return new ServletRegistrationBean() {
            @Override
            public void onStartup(ServletContext servletContext) throws ServletException {
                FacesInitializer facesInitializer = new FacesInitializer();
                facesInitializer.onStartup(Collections.singleton(App.class), servletContext);
            }
        };
    }

    @Configuration
    static class JsfConfog implements ServletContextInitializer {

        @Override
        public void onStartup(ServletContext servletContext) throws ServletException {
            servletContext.setInitParameter("javax.faces.FACELETS_SKIP_COMMENTS", "true");
            servletContext.setInitParameter("primefaces.THEME", "redmond");
            servletContext.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
            servletContext.setInitParameter("javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL", "true");
            // servletContext.setInitParameter("javax.faces.FACELETS_REFRESH_PERIOD", "-1");
        }
    }
}
