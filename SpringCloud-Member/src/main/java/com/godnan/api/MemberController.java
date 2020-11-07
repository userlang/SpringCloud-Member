package com.godnan.api;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("会员服务")
public class MemberController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("getMember")
    public String getMember(){
        try{
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
        return  "this is Mumber"+port;
    }

}
