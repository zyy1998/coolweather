package com.zyy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mr.zhao on 2017/10/15.
 */

public class Forecast {
    /**
     * 数据示例：
     *  "daily_forecast": [
     {
     "astro": {
     "mr": "01:17",
     "ms": "14:52",
     "sr": "06:01",
     "ss": "17:27"
     },
     "cond": {
     "code_d": "306",
     "code_n": "300",
     "txt_d": "中雨",
     "txt_n": "阵雨"
     },
     "date": "2017-10-15",
     "hum": "84",
     "pcpn": "44.8",
     "pop": "98",
     "pres": "1020",
     "tmp": {
     "max": "18",
     "min": "16"
     },
     "uv": "1",
     "vis": "12",
     "wind": {
     "deg": "66",
     "dir": "东北风",
     "sc": "3-4",
     "spd": "19"
     }
     },
     {
     "astro": {
     "mr": "02:18",
     "ms": "15:32",
     "sr": "06:02",
     "ss": "17:26"
     },
     "cond": {
     "code_d": "300",
     "code_n": "300",
     "txt_d": "阵雨",
     "txt_n": "阵雨"
     },
     "date": "2017-10-16",
     "hum": "86",
     "pcpn": "36.4",
     "pop": "92",
     "pres": "1019",
     "tmp": {
     "max": "19",
     "min": "16"
     },
     "uv": "1",
     "vis": "13",
     "wind": {
     "deg": "71",
     "dir": "东北风",
     "sc": "4-5",
     "spd": "29"
     }
     },
     {
     "astro": {
     "mr": "03:18",
     "ms": "16:09",
     "sr": "06:02",
     "ss": "17:25"
     },
     "cond": {
     "code_d": "300",
     "code_n": "300",
     "txt_d": "阵雨",
     "txt_n": "阵雨"
     },
     "date": "2017-10-17",
     "hum": "86",
     "pcpn": "51.7",
     "pop": "83",
     "pres": "1022",
     "tmp": {
     "max": "19",
     "min": "16"
     },
     "uv": "1",
     "vis": "17",
     "wind": {
     "deg": "352",
     "dir": "北风",
     "sc": "3-4",
     "spd": "22"
     }
     }
     ],
     */

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
