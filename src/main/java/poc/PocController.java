package poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocController {

    @GetMapping("/poc")
    public PocPojo getPoc() {
        return new PocPojo();
    }
}
