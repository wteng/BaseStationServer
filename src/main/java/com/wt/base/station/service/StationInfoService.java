package com.wt.base.station.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.wt.base.station.persist.dao.impl.StationInfoDao;
import com.wt.base.station.persist.entity.StationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 修改历史:											<br>
 * 修改日期    		修改人员   	版本	 		修改内容<br>
 * -------------------------------------------------<br>
 * 15/12/16 19:01   teng.wang  1.0 初始化创建<br>
 * </p>
 *
 * @author teng.wang
 * @version 1.0
 * @since JDK1.7
 */
@Service
public class StationInfoService {

    @Autowired
    StationInfoDao stationInfoDao;

    public int insert(StationInfo stationInfo) {
        return stationInfoDao.insert(stationInfo);
    }

    public int insert(Map<String,Object> paramMap) {
        return stationInfoDao.insert(paramMap);
    }

    public StationInfo getStationInfoByName(String stationName) {
        Map<String,Object> paramMap = Maps.newHashMap();
        paramMap.put("stationName",stationName);

        List<StationInfo> stationInfoList = stationInfoDao.selectByCondition(paramMap);
        if (stationInfoList != null && !stationInfoList.isEmpty()) {
            return stationInfoList.get(0);
        }

        return null;
    }

    public List<StationInfo> getStationInfo() {
        Map<String,Object> paramMap = Maps.newHashMap();

        return stationInfoDao.selectByCondition(paramMap);
    }

}
