package com.ciklum.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by skn on 02/10/2015.
 */
@RestController
public class XLSService {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/excel", method = RequestMethod.POST)
//    @ResponseStatus(HttpStatus.OK)
    public
    @ResponseBody
    ResponseExcel excel() {
//        return (counter.incrementAndGet() + "\nMy first web service welcomes you");
        return new ResponseExcel(counter.incrementAndGet(), "My first web service welcomes you");
//        System.out.println(counter.incrementAndGet() + "\nMy first web service welcomes you");
    }

}
