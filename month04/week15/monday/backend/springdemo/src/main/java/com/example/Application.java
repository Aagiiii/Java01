package  com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.app.MessagePrinter;
import com.example.config.AppConfig;


public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        MessagePrinter printer = context.getBean(MessagePrinter.class);

        printer.print();

        ((AnnotationConfigApplicationContext) context).close();
    }
}
