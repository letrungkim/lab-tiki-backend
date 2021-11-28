package rmit.rmitsb.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class HelloController {

    @RequestMapping(value = "/goodbye", method = RequestMethod.GET)
    public String hello(){
        return "Goodbye MVC";
    }

    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    public String hello(@RequestParam String person){
        return "Bye " + person;
    }

    @RequestMapping(value = "/bye/{person}", method = RequestMethod.GET)
    public String hello2(@PathVariable String person){
        return "Bye " + person;
    }
}


