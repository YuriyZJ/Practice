package Level2.Chapter10_Kafka.Task1;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

//сервисный компонент, который занимается отправкой сообщений в Kafka.
@Service
public class KafkaProducerService {
    private final KafkaTemplate<String, String> kafkaTemplate; //объект, предоставляемый Spring Kafka, который позволяет отправлять сообщения в Kafka (String, String - типы ключа и значения сообщений)

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) { //Внедрение зависимости (KafkaTemplate) через конструктор — лучший способ DI (Dependency Injection) в Spring.
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, String message){
        kafkaTemplate.send(topic, message);
    }
}
