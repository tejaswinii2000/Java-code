package Calculator;
import org.springframework.stereotype.Component;

@Component
public class Multiplication implements Operation {
 @Override
 public long apply(long a, long b) {

  return a * b;
 }

 @Override
 public boolean valid(char operator) {

  return '*' == operator;
 }
}