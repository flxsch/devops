package ch.noseryoung.devops;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        String message = "Hello World";

        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
