package org.lint.cros;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin
@RestController
@RequestMapping
public class CROSController{

    //@CrossOrigin
    @RequestMapping("/hello")
    public String seyHello(){
        return "成功返回数据";
    }


    @RequestMapping("/hi")
    public String seyHi(){
        return "成功返回Hi";
    }
}
