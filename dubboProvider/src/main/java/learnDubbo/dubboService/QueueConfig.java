package learnDubbo.dubboService;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by win on 2018/4/24.
 */

@Configuration
public class QueueConfig {

    public static final String QUEUE1 = "qu1";
    public static final String QUEUE2 = "qu2";


    @Bean
    public Queue queue1() {
        return new Queue(QUEUE1, true);
    }

    @Bean
    public Queue queue2() {
        return new Queue(QUEUE2, true);
    }

}
