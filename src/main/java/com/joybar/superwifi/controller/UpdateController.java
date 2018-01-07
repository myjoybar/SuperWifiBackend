package com.joybar.superwifi.controller;

import com.joybar.superwifi.entity.UpdateInfo;
import com.joybar.superwifi.result.data.BaseResultInfo;
import com.joybar.superwifi.result.data.SuccessResult;
import com.joybar.superwifi.services.UpdateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joybar on 07/01/18.
 */

@RestController
public class UpdateController {


    @Autowired
    private UpdateServiceImpl updateService;


    //http://localhost:8198/superwifi/say
    @GetMapping(value = "/say")
    public BaseResultInfo say() {
        //  return new ResultInfo(ResultInfo.SUCCESS_CODE,ResultInfo.SUCCESS_MSG,"Hello");
        return new SuccessResult( "hello");
    }

    //http://localhost:8198/superwifi/updateinfo
    @GetMapping(value = "/updateinfo")
    public BaseResultInfo getUpdateInfo() {
        UpdateInfo updateInfo = updateService.getUpdateInfo();
        return new SuccessResult(updateInfo);
    }
}
