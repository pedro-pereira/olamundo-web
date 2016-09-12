package jmx;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

@Component
public class CustomEndpoint implements Endpoint<List<String>> {
     
    public String getId() {
        return "customEndpoint";
    }
 
    public boolean isEnabled() {
        return true;
    }
 
    public boolean isSensitive() {
        return true;
    }
 
    public List<String> invoke() {
        // Custom logic to build the output
        List<String> messages = new ArrayList<String>();
        messages.add("1");
        messages.add("2");
        messages.add("3");
        messages.add("4");
        messages.add("5");
        messages.add("6");
        messages.add("7");
        messages.add("8");
        messages.add("9");
        messages.add("10");
        return messages;
    }
}