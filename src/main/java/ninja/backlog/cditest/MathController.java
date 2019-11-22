package ninja.backlog.cditest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/calculate")
    public Integer getCalculation(){
        return 4;
    }

}
