package helloWorld.HelloWeb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String hi() {
        return "Hello Web!";
    }
    
    @RequestMapping("/hello/ping")
    public Message ping() {
        return new Message("pong");
    }
    
    @RequestMapping("/hello/greet")
    public Message greet(@RequestParam("name") String name) {
    	 
        return new Message("Welcome "+ name);
    }
}