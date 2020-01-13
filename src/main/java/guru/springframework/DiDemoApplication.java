package guru.springframework;

import guru.springframework.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController)ctx.getBean("myController");
        System.out.println(controller.hello());

//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(ConstructInjectController.class).sayHello());
//        System.out.println(controller.hello());
    }

}
