package jmx;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * Classe que representa ...
 * 
 * @author local
 * @version 1.0
 * @since 2016-09-05
 *
 */
@ManagedResource(objectName="jmx:name=JMXHello", description="Teste de JMX")
	public class Hello implements HelloMBean {
   
   private String message = null;

   public Hello() {
      message = "Hello, world";
   }

   public Hello(String message) {
      this.message = message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   @ManagedAttribute
   public String getMessage() {
      return message;
   }

   @ManagedOperation
   public void sayHello() {
      System.out.println(message);
   }
}