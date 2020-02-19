package graduation.platform.analysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kunpeng
 */
@Controller
public class hello {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
