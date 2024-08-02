package ch.inss.springservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ch.inss")
public class SpringserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringserviceApplication.class, args);
  }

}
