package com.wt.base.station.service;

import com.google.common.collect.Maps;
import com.wt.base.station.persist.entity.StationInfo;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * <p>
 * 修改历史:											<br>
 * 修改日期    		修改人员   	版本	 		修改内容<br>
 * -------------------------------------------------<br>
 * 15/12/16 19:15   teng.wang  1.0 初始化创建<br>
 * </p>
 *
 * @author teng.wang
 * @version 1.0
 * @since JDK1.7
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class StationInfoServiceTest {

    @Autowired
    private StationInfoService stationInfoService;

    @Test
    public void testInsert() {
//        StationInfo stationInfo = new StationInfo();
//        stationInfo.setAddress("aaaa");
        Map<String,Object> paramMap = Maps.newLinkedHashMap();
        paramMap.put("name","jizhan1");
        int insertResult = stationInfoService.insert(paramMap);
        Assert.assertEquals(1,insertResult);
    }

}
