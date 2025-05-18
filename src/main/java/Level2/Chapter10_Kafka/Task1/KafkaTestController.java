package Level2.Chapter10_Kafka.Task1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaTestController {

    private final KafkaProducerService kafkaProducerService;

    public KafkaTestController(KafkaProducerService kafkaProducerService){
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestParam String message){
        kafkaProducerService.sendMessage("my-topic", message);
        return ResponseEntity.ok("Отправлено" + message);
    }
}
