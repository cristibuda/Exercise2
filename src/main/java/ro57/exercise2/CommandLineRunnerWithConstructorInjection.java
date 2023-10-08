package ro57.exercise2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {

    private final DummyLogger dummyLogger;

    public CommandLineRunnerWithConstructorInjection(DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }


    @Override
    public void run(final String... args) throws Exception {
        dummyLogger.sayHello("CommandLineRunnerWithConstructorInjection ");
    }
}