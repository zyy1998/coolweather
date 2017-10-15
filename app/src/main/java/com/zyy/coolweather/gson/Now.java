package com.zyy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mr.zhao on 2017/10/15.
 */

public class Now {
    /**
     * 数据示例：
     *  "now": {
     "cond": {
     "code": "300",
     "txt": "阵雨"
     },
     "fl": "15",
     "hum": "95",
     "pcpn": "0.2",
     "pres": "1019",
     "tmp": "16",
     "vis": "5",
     "wind": {
     "deg": "92",
     "dir": "东风",
     "sc": "3-4",
     "spd": "11"
     }
     },
     */

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
