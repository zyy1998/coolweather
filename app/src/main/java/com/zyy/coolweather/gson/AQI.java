package com.zyy.coolweather.gson;

/**
 * Created by Mr.zhao on 2017/10/15.
 */

public class AQI {
    /**
     *数据示例：
     * "aqi": {
     "city": {
     "aqi": "27",
     "co": "1",
     "no2": "23",
     "o3": "83",
     "pm10": "17",
     "pm25": "11",
     "qlty": "优",
     "so2": "8"
     }
     },
     */
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
