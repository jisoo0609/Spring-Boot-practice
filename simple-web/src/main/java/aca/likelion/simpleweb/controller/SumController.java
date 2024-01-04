package aca.likelion.simpleweb.controller;

import aca.likelion.simpleweb.dto.SumRequest;
import aca.likelion.simpleweb.dto.SumResponse;
import org.springframework.web.bind.annotation.*;

// @Controller + @ResponseBody = @RestController
@RestController // http 메시지 그대로 리턴
public class SumController {
    // localhost:8080/sum?num1=10&num2=20
    @GetMapping("/sum")
    public SumResponse sum(
            @RequestParam("num1") Long num1,
            @RequestParam("num2") Long num2
    ) {
        return new SumResponse(num1 + num2);
    }
    /*
    {
        "sum":30
    }
    */

    @PostMapping("/sum")
    public SumResponse sum(
            @RequestBody SumRequest sumRequest
    ) {
        return new SumResponse(sumRequest.getNum1() + sumRequest.getNum2());
    }
}
