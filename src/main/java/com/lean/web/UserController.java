package com.lean.web;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lean.entity.ResponseModel;
import com.lean.util.ApiUtils;
import com.lean.util.RemoteLoad;

@RestController
public class UserController extends RemoteLoad{

    @Value("${service.url.order}")
    private String serviceOrderUrl;
    
    @RequestMapping(value = "/testRestTemplate")
    public ResponseModel testRestTemplate (HttpServletRequest request) {
        
        HashMap<String, Object> par = new HashMap<String, Object>();
        //request值放到HashMap中
        ApiUtils.setRequestPar(request,par);
        //postRestObject参数说明
        //【0】服务名称 serviceOrderUrl
        //【1】接口地址 /order/getUserOrderInfo
        //【2】返回类型 ResponseModel.class
        //【3】参数类型 par
          ResponseModel res = postRestObject(serviceOrderUrl, "/order/getUserOrderInfo", ResponseModel.class, par);
        return res;
        
    }
    
}
