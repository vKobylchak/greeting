package guru.springframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
//
//@Service
//@Profile("as")
//@Primary
public class PrimaryAustGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Greeting from australia!!";
    }
}
