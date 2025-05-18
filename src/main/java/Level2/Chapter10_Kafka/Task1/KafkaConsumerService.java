package Level2.Chapter10_Kafka.Task1;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "mu-topic", groupId = "my-group")
    public void listen(String message){
        System.out.println("Полученное сообщение" + message);
    }
}
