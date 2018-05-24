package controller;

import com.alibaba.dubbo.config.annotation.Reference;
import learnDubbo.dubboService.ServiceInterface.MqService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用dubbo调用远程服务器上的消息队列服务
 * Created by win on 2018/4/26.
 */

@RestController
@RequestMapping(value = "/sendMessage")
public class MqController {

    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://192.168.63.1:12345")
    private MqService mqService;


    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public void sayHello() {

        mqService.send("123321");
    }


}
//@RestController
//public class DemoConsumerController {
//
//    @Reference(version = "1.0.0",
//            application = "${dubbo.application.id}",
//            url = "dubbo://localhost:12345")
//    private DemoService demoService;
//
//    @RequestMapping("/sayHello")
//    public String sayHello(@RequestParam String name) {
//        return demoService.sayHello(name);
//    }
//
//}