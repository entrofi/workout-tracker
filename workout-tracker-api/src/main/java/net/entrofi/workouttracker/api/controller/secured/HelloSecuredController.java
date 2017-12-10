package net.entrofi.workouttracker.api.controller.secured;


import net.entrofi.workouttracker.api.RequestMappingConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RequestMappingConstants.SECURED_PATH_URL)
public class HelloSecuredController {


    @GetMapping(path = "/securedhello")
    public String sayHello() {
        return "Secured hello";
    }
}
