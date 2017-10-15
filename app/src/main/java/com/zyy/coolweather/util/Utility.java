package com.zyy.coolweather.util;

import android.text.TextUtils;
import android.util.Log;

import com.zyy.coolweather.db.City;
import com.zyy.coolweather.db.County;
import com.zyy.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Mr.zhao on 2017/10/14.
 */

public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response) {
        //Returns true if the string is null or 0-length.
        //              ^
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                //将返回数组分别解析为单个类并存储
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObjector = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObjector.getString("name"));
                    province.setProvinceCode(provinceObjector.getInt("id"));
                    province.save();    //存储到数据库
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
         return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response,int provinceId){
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCitys = new JSONArray(response);
                //将返回数组分别解析为单个类并存储
                for (int i = 0; i < allCitys.length(); i++) {
                    JSONObject cityObject = allCitys.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();    //存储到数据库
                }
               return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
       return false;
    }

    /**
     * 解析和处理服务器返回的县级数据
     */
    public static boolean handleCountyResponse(String response,int cityid){
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCitys = new JSONArray(response);
                //将返回数组分别解析为单个类并存储
                for (int i = 0; i < allCitys.length(); i++) {
                    JSONObject countyObject = allCitys.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityid);
                    county.save();    //存储到数据库
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}
