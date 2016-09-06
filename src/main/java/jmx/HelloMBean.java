package jmx;


/**
 * Enumeração que representa ...
 * 
 * @author local
 * @version 1.0
 * @since 2016-09-05
 *
 */
 
public interface HelloMBean  {

   public void setMessage(int message);
   public int getMessage();
   public void sayHello();
}
