package hello;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/greetings")
    public List<Greeting> greetings(@RequestParam(value="name", defaultValue="World") String name) {
        Greeting g1 = new Greeting(counter.incrementAndGet(),
                String.format(template, name));
        Greeting g2 = new Greeting(counter.incrementAndGet(), "bdgdg");
    	List<Greeting> greetings = new LinkedList<Greeting>();
    	greetings.add(g1);
    	greetings.add(g2);
    	return greetings;
    }
}
