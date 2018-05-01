package learnDubbo.mq;


import learnDubbo.dubboService.ServiceInterface.MqService;

import org.springframework.stereotype.Service;

/**
 * Created by win on 2018/4/20.
 */

//@Service
public class MQSender implements MqService {
    
    
    
    @Override
    public void send(String message) {
        
    }

//    @Autowired
//    AmqpTemplate amqpTemplate;
//
//
//    public void send(String message){
//        amqpTemplate.convertAndSend(QueueConfig.QUEUE1,message);
//    }


}
