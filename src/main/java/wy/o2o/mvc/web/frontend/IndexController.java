package wy.o2o.mvc.web.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
        @RequestMapping(value = "/", method = RequestMethod.GET)

        public String index() {
            System.out.print("hello");

            return "index";

        }
}
