package br.com.memorialacademico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import({CustomWebSecurityConfigurerAdapter.class})
public class BackendAppApplication extends SpringBootServletInitializer
{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BackendAppApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BackendAppApplication.class, args);
	}
}
