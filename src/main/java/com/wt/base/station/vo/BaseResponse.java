package com.wt.base.station.vo;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * <p>
 * 修改历史:											<br>
 * 修改日期    		修改人员   	版本	 		修改内容<br>
 * -------------------------------------------------<br>
 * 16/12/16 09:40   teng.wang  1.0 初始化创建<br>
 * </p>
 *
 * @author teng.wang
 * @version 1.0
 * @since JDK1.7
 */
public class BaseResponse {

    int retcode = 0;

    String retdesc = "";

    Object body;

    public BaseResponse() {
    }

    public int getRetcode() {
        return retcode;
    }

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public String getRetdesc() {
        return retdesc;
    }

    public void setRetdesc(String retdesc) {
        this.retdesc = retdesc;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this, SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.WriteMapNullValue);
    }
}
