package jmx;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

@org.springframework.stereotype.Component
@ManagedResource(objectName="jmx:name=JMXHello", description="Teste de JMX")
   public class Hello implements HelloMBean {
   
   private int message = 100;

   public Hello() {
      message = 50;
   }

   public Hello(int message) {
      this.message = message;
   }

   public void setMessage(int message) {
      this.message = message;
   }

   @ManagedAttribute
   public int getMessage() {
      return message;
   }

   @ManagedOperation
   public int sayHello() {
      System.out.println(message);
      return message;
   }
}
