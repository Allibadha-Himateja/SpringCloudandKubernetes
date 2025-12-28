
package com.iss.orderapi.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

//    @GetMapping("/") this has wasted 5 hrs of your time
    @GetMapping
    @ResponseBody
    public String getService()
    {
        return "this is order controller";
    }
}
