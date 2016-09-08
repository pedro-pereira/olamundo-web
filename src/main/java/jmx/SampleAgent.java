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
import java.util.concurrent.TimeUnit;

public class SampleAgent {
    
    public void criandoAgenteAtivo() {
        Trapper trapper = null;
        try {
            trapper = new ZabbixTrapper("52.44.57.173",
                                    "appserver8");
            
            trapper.every(30, TimeUnit.SECONDS,
                          "compiler.time",
                          "java.lang:type=Compilation",
                          "TotalCompilationTime");

            // simulate lots of important work being done...
            Thread.sleep(Long.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            trapper.stop();
        }
    }
}
