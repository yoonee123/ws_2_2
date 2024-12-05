package com.example.demo;

import com.example.demo.dto.PaymentRespDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/payment")
@RestController
public class PaymentApiController {

    @PostMapping
    public PaymentRespDto process() {
        PaymentRespDto paymentRespDto = new PaymentRespDto();
        paymentRespDto.setResult("SUCCESS");
        paymentRespDto.setMsg("결제가 완료되었습니다.");

        return paymentRespDto;
    }

}
