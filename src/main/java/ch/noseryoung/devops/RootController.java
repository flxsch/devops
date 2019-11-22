package ch.noseryoung.devops;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        String message = "App is running";

        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
