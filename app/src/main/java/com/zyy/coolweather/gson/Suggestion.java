package com.zyy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mr.zhao on 2017/10/15.
 */

public class Suggestion {
    /**
     * 数据示例：
     *  "suggestion": {
     "air": {
     "brf": "优",
     "txt": "气象条件非常有利于空气污染物稀释、扩散和清除，可在室外正常活动。"
     },
     "comf": {
     "brf": "舒适",
     "txt": "今天夜间不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"
     },
     "cw": {
     "brf": "不宜",
     "txt": "不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"
     },
     "drsg": {
     "brf": "较舒适",
     "txt": "建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"
     },
     "flu": {
     "brf": "易发",
     "txt": "天冷风大且空气湿度大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。"
     },
     "sport": {
     "brf": "较不宜",
     "txt": "有降水，且风力很强，推荐您在室内进行低强度运动；若坚持户外运动，请注意避雨防风。"
     },
     "trav": {
     "brf": "一般",
     "txt": "有降水，温度适宜，风大，可能会影响您的出行，旅游指数一般，外出请注意携带雨具并防风。"
     },
     "uv": {
     "brf": "弱",
     "txt": "紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"
     }
     }
     */

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport; //与Json数据名一致，不需要建立映射

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
