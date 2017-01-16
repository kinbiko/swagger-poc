package poc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocController {

    @RequestMapping("/poc")
    public PocPojo getPoc() {
        return new PocPojo();
    }
}
