package jmx;

import java.util.Collection;
import java.util.LinkedHashSet;

import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.actuate.metrics.Metric;
import org.springframework.stereotype.Component;

@Component
public class CustomMetric implements PublicMetrics {

    public CustomMetric() {
    }

    @Override
    public Collection< Metric< ?> > metrics() {
        Collection< Metric< ?> > result = new LinkedHashSet<>();
        result.add(new Metric<>("sample.metric", 20)); //20 is sample metric value
        // u can add multiple metrics to results
        
        if (System.getProperty("com.sun.management.jmxremote") == null) {
        result.add(new Metric<>("***********************JMX remote is disabled", 20));
     } else {
          String portString = System.getProperty("com.sun.management.jmxremote.port");
          if (portString != null) {
             result.add(new Metric<>("*******************JMX running on port "
                + Integer.parseInt(portString), 20));
          }
     }
        return result;
    }
}
