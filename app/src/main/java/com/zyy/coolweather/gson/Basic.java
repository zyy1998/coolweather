package com.zyy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mr.zhao on 2017/10/15.
 */

public class Basic {
    /**数据示例
     * "basic": {
     "city": "苏州",
     "cnty": "中国",
     "id": "CN101190401",
     "lat": "31.29937935",
     "lon": "120.61958313",
     "update": {
     "loc": "2017-10-15 20:46",
     "utc": "2017-10-15 12:46"
     }
     },
     */
    //将Json中的city字段与下面的cityName进行映射，会使city的值赋到cityName上
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        //天气更新时间
        @SerializedName("loc")
        public String updateTime;
    }
}
