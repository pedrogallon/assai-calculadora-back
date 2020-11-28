package br.com.pedrogallon.assaicalculadoraback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AssaiCalculadoraBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssaiCalculadoraBackApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@SuppressWarnings("deprecation")
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:4200");
				registry.addMapping("/**")
	            .allowedOrigins(CrossOrigin.DEFAULT_ORIGINS)
	            .allowedHeaders(CrossOrigin.DEFAULT_ALLOWED_HEADERS)
	            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
	            .maxAge(3600L);
			}
		};
	}

}
