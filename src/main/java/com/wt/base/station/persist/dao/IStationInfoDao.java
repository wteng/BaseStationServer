package com.wt.base.station.persist.dao;

import com.wt.base.station.persist.entity.StationInfo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 修改历史:											<br>
 * 修改日期    		修改人员   	版本	 		修改内容<br>
 * -------------------------------------------------<br>
 * 15/12/16 18:53   teng.wang  1.0 初始化创建<br>
 * </p>
 *
 * @author teng.wang
 * @version 1.0
 * @since JDK1.7
 */
public interface IStationInfoDao {

    int insert(StationInfo stationInfo);

    int insert(Map<String,Object> paramMap);

    List<StationInfo> selectByCondition(Map<String,Object> paramMap);

}
