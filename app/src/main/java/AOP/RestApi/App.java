/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package AOP.RestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "AOP.RestApi")
@EnableAspectJAutoProxy
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SpringApplication.run(App.class, args);
    }
}
