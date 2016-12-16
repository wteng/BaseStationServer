package com.wt.base.station.persist.dao.impl;

import com.wt.base.station.persist.dao.IStationInfoDao;
import com.wt.base.station.persist.entity.StationInfo;
import com.wt.base.station.persist.mapper.StationInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * <p>
 * 修改历史:											<br>
 * 修改日期    		修改人员   	版本	 		修改内容<br>
 * -------------------------------------------------<br>
 * 15/12/16 18:54   teng.wang  1.0 初始化创建<br>
 * </p>
 *
 * @author teng.wang
 * @version 1.0
 * @since JDK1.7
 */
@Repository
public class StationInfoDao implements IStationInfoDao {

    @Autowired
    StationInfoMapper stationInfoMapper;

    public int insert(StationInfo stationInfo) {
        return stationInfoMapper.insert(stationInfo);
    }

    public int insert(Map<String, Object> paramMap) {
        return stationInfoMapper.insert(paramMap);
    }


}
