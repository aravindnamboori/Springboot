package com.exec.test;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class OnlineMovieProj {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieProj.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	 @Bean
	    public Docket produceApi()
	    {
	    	return new Docket(DocumentationType.SWAGGER_2).select().
	    			apis(RequestHandlerSelectors.basePackage("com.exec.test")).build(); 
	    }

}
