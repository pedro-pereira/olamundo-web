package jmx;

/**
 * Classe que representa ...
 * 
 * @author local
 * @version 1.0
 * @since 2016-09-08
 *
 */

import org.kjkoster.zapcat.Agent;
import org.kjkoster.zapcat.zabbix.ZabbixAgent;

public class SampleAgent {

   public static Agent agent;

    public static void criarAgente() {

        try {
            if(agent == null)
            agent = new ZabbixAgent();

            // simulate lots of important work being done...
            Thread.sleep(10000);
            System.out.println("******************************** O agente estah no ar... " + agent.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            agent.stop();
        }
    }
}
