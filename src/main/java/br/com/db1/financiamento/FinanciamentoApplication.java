package br.com.db1.financiamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class FinanciamentoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FinanciamentoApplication.class, args);
  }
  
  @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoClientApplication.class);
	}
}
