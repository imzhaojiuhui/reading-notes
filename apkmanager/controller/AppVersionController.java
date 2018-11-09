package com.zgiot.soft.api.apkmanager.controller;

import com.zgiot.soft.api.apkmanager.pojo.beanExtend.AppVersionExtend;
import com.zgiot.soft.api.apkmanager.service.AppVersionService;
import com.zgiot.soft.common.BaseController;
import com.zgiot.soft.common.result.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 闫晨
 * @Description
 * @date 2017/11/28 14:55
 * @
 */
@Api("版本号接口")
@RestController
@RequestMapping("/appVersion")
public class AppVersionController extends BaseController {
    @Autowired
    private AppVersionService appVersionServiceImpl;

    @ApiOperation("查询 appVersion")
    @RequestMapping(value = "/selectZxVersion", method = RequestMethod.POST)
    public ResponseEntity<Object> selectZxVersion(
            @ApiParam("appType:1 android 2 ios") @RequestBody AppVersionExtend ex) throws Exception {

        return OK(ResultCode.SUCCESS.getCode(), null, appVersionServiceImpl.selectZxVersion(ex));
    }

    @ApiOperation("查询 所有appVersion")
    @RequestMapping(value = "/select", method = RequestMethod.POST)
    public ResponseEntity<Object> select(
            @ApiParam("appType:1 android 2 ios") @RequestBody AppVersionExtend ex) throws Exception {
        return OK(ResultCode.SUCCESS.getCode(), null, appVersionServiceImpl.select(ex));
    }
}
