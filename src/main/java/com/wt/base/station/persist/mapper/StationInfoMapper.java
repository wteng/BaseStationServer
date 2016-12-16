package com.wt.base.station.persist.mapper;

import com.wt.base.station.persist.entity.StationInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by teng on 15/12/16.
 */
public interface StationInfoMapper {

    int insert(StationInfo stationInfo);
    int insert(Map<String,Object> paramMap);

    List<StationInfo> selectByCondition(Map<String,Object> paramMap);

}
