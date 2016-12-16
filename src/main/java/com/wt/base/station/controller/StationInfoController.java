package com.wt.base.station.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.wt.base.station.common.ErrorCodeConstant;
import com.wt.base.station.persist.entity.StationInfo;
import com.wt.base.station.service.StationInfoService;
import com.wt.base.station.vo.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.Map;

/**
 * <p>
 * 修改历史:											<br>
 * 修改日期    		修改人员   	版本	 		修改内容<br>
 * -------------------------------------------------<br>
 * 15/12/16 17:12   teng.wang  1.0 初始化创建<br>
 * </p>
 *
 * @author teng.wang
 * @version 1.0
 * @since JDK1.7
 */
@Controller
public class StationInfoController {

    @Autowired
    StationInfoService stationInfoService;

    @RequestMapping("addInfo")
    @ResponseBody
    public String addInfo(HttpServletRequest request){
        BaseResponse baseResponse = new BaseResponse();
        try {
            Map<String,Object> paramMap = Maps.newHashMap();
            Enumeration<String> enumeration = request.getParameterNames();
            while (enumeration.hasMoreElements()) {
                String keyName = enumeration.nextElement();
                paramMap.put(keyName,request.getParameter(keyName));
            }

            stationInfoService.insert(paramMap);
        } catch (Exception e) {
            baseResponse.setRetcode(ErrorCodeConstant.EXCEPTION_CODE);
            baseResponse.setRetdesc(e.toString());
        }

        return baseResponse.toString();
    }

    @RequestMapping("getStationInfoByName")
    @ResponseBody
    public String getStationInfoByName(@RequestParam String stationName) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            StationInfo stationInfo = stationInfoService.getStationInfoByName(stationName);
            baseResponse.setBody(stationInfo);
        }catch (Exception e) {
            baseResponse.setRetcode(ErrorCodeConstant.EXCEPTION_CODE);
            baseResponse.setRetdesc(e.toString());
        }

        return baseResponse.toString();
    }


}
