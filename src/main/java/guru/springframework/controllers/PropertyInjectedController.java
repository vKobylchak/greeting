package guru.springframework.controllers;

import guru.springframework.service.GreetingRepository;
import guru.springframework.service.GreetingService;
import guru.springframework.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

//    private final GreetingService greetingServiceImpl;
//    private final GreetingService greetingService;
//    public GreetingService getterGreetingService;


    private final GreetingService greetingService;

//    public PropertyInjectedController(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }

    public PropertyInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }


//    @Qualifier("greetingServiceImpl")
//    private final GreetingService greetingService;
//    public PropertyInjectedController( GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

//    private final GreetingService constructorGreetingService;



    public String sayHello() {
        return greetingService.sayGreeting();
    }
}