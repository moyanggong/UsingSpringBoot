package service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created by win on 2018/4/26.
 */

@Service
public class MqReceiver {

    @RabbitListener(queues = QueueConfig.QUEUE1)
    public void receive(String message) {
        System.out.println("从qu1队列收到消息为" + message);
    }

}
