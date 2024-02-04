package JavaAngular.PointofSale;

import java.util.Arrays;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


@SpringBootApplication
public class PointofSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PointofSaleApplication.class, args);
	}
	
	@Bean
	public CorsFilter corsFilter() {
	  CorsConfiguration configuration = new CorsConfiguration();
	  configuration.setAllowCredentials(true);
	  configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
	  configuration.setAllowedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin","Content-Type",
			  "Accept","Authorization","Origin, Accept","X-Requested-With",
			  "Access-Control-Request-Method","Access-Control-Request-Headers","Requestor-Type"));
	  configuration.setExposedHeaders(Arrays.asList("Origin","Content-Type","Accept","Authorization",
			  "Access-Control-Allow-Origin","Access-Control-Allow-Credentials","X-Get-Header"));
	  configuration.setAllowedMethods(Arrays.asList("GET","POST","PATCH", "PUT", "DELETE", "OPTIONS", "HEAD"));
	  configuration.setMaxAge(3600L);
	  UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	  source.registerCorsConfiguration("/**", configuration);
	  return new CorsFilter(source);
	}

}
