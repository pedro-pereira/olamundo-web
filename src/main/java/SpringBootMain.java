import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import jmx.Hello;

/**
 * Classe responsável iniciar a aplicação, por padrão ela executará as seguintes etapas:
 * - Criar uma instância do ApplicationContext
 * - Registrar um CommandLinePropertySource para expor argumentos como propriedades do Spring
 * - Atualizar o contexto de aplicação para carregar os singletons
 * - Executar qualquer bean do tipo CommandLineRunner
 * 
 * @author Tecnhe
 *
 */
@ImportResource("classpath*:spring-config.xml")
@ComponentScan(basePackages = { "security", "auth.permission", "api.rest.events" })
@SpringBootApplication
public class SpringBootMain extends SpringBootServletInitializer {
  
  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SpringBootMain.class, args);
    Hello bean = (Hello) ctx.getBean("xmlBean");
    bean.sayHello();
  }
  
}
