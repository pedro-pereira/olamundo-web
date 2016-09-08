package jmx;

/**
 * Classe que representa ...
 * 
 * @author local
 * @version 1.0
 * @since 2016-09-08
 *
 */

import org.kjkoster.zapcat.Trapper;
import org.kjkoster.zapcat.zabbix.ZabbixTrapper;

public class SampleAgent {
    
    public void criandoAgenteAtivo() {
        Trapper trapper = null;
        try {
            trapper = new ZabbixTrapper("52.44.57.173",
                                    "Zapcat test application");
            
            trapper.send("java.version",
                           System.getProperty("java.version"));

            // simulate lots of important work being done...
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            trapper.stop();
        }
    }
}
