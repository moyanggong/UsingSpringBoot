package learnDubbo.dubboService;

import com.alibaba.dubbo.config.annotation.Service;
import learnDubbo.dubboService.ServiceInterface.MqService;


import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by win on 2018/4/26.
 */


@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class MqServiceImpl implements MqService {

    @Autowired
    AmqpTemplate amqpTemplate;


    @Override
    public void send(String message) {
        try {
            amqpTemplate.convertAndSend(QueueConfig.QUEUE1, message);
        } catch (AmqpException e) {
            System.out.println(e.getStackTrace());
        }

    }
}
