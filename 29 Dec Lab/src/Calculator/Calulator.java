package Calculator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//@Component
public class Calculator {

 Logger logger = LoggerFactory.getLogger(getClass());

 private List<Operation> operations;

 public Calculator(List<Operation> operations) {
  super();
  this.operations = operations;
 }

 public void calculate(long a, long b, char operator) {

  for (Operation o : operations) {
   if (o.valid(operator)) {

    long output = o.apply(a, b);
    logger.info(a + " " + operator + " " + b + " = " + output);
    return;
   }
  }
  throw new IllegalArgumentException("Illegal operation for operator : " + operator);
 }

}