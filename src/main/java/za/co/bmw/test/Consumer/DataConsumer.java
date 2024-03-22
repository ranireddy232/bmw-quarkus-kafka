package za.co.bmw.test.Consumer;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import java.util.logging.Logger;

@ApplicationScoped
public class DataConsumer {

    private final Logger logger = Logger.getLogger(String.valueOf(DataConsumer.class));

    @Incoming("data-input")
    public void receive(String message){
        System.out.println(" Inside the Consumer");
        logger.info("Got a msg: " + message);
    }
}
