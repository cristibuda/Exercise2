package ro57.exercise2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLogger {
  public void sayHello(String dclassName) {
    log.info("hello from DummyLogger");
  }
}


