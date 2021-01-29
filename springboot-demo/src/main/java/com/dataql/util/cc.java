package com.dataql.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class cc {

    public static void main(String[] args) {

      //  String jsonstr ="{\"data\":[{\"name\":\"李天\",\"sex\":\"男\",\"identity\":\"430223198601117288\",\"address\":\"北京市\",\"capture_time\":\"2017-03-15 18:42:53\",\"is_a_person\":true,\"serial_number\":\"430223198601117288_2017032310\",\"capture_image\":\"/rawdata/430223198601117288_2017032310/2dbestcolor.jpg\",\"start_date\":\"2015-06-30\",\"end_date\":\"2015-09-30 \"},{\"name\":\"李天\",\"sex\":\"男\",\"identity\":\"430223198601117288\",\"address\":\"北京市\",\"capture_time\":\"2017-03-15 18:42:53\",\"is_a_person\":true,\"serial_number\":\"430223198601117288_2017032310\",\"capture_image\":\"/rawdata/430223198601117288_2017032310/2dbestcolor.jpg\",\"start_date\":\"2015-06-30\",\"end_date\":\"2015-09-30 \"}],\"status\":\"200\",\"message\":\"成功\",\"totalElements\":\"200\",\"totalPages\":\"20\"}";

/*        String jsonstr = "{\"data\":[{\"end_date\":\"2027-05-30\",\"capture_image\":\"/static/rawdata/B1M31AB68528_20190718175838/B1M31AB68528_20190718175838-portrait.jpg\",\"nation\":\"维吾尔族\",\"address\":\"XX疏附县站敏CCC村4组31号\",\"sex\":\"男\",\"id\":\"c6a65dbd7d124d47a8e56352490bf855\",\"capture_time\":\"2019-07-18 17:58:38\",\"name\":\"麦麦提\",\"identity\":\"XX312119670326153X\",\"serial_number\":\"B1M31AB68528_20190718175838\",\"start_date\":\"2007-05-30\",\"device_no\":\" 0010101 \",\"place_name\":\"马家楼上访接济中心\",\"is_a_person\":\"true\"}],\"status\":\"200\",\"message\":\"成功\",\"totalElements\":\"200\",\"totalPages\":\"20\"}";
        JSONArray jsonArray = JSONObject.parseObject(jsonstr).getJSONArray("data");
       if(jsonArray.size() > 0){
           for (int i=0;i < jsonArray.size();i++){
               CloudPersonBean cloudPersonBean = jsonArray.getJSONObject(i).toJavaObject(CloudPersonBean.class);
               System.out.println(cloudPersonBean);
           }
       }*/


      // String json2= "{\"data\":[{\"tag\":\"[一体化录入人员]的同家族人员|一体化录入人员|不准出境人员|危安管控对象\",\"message\":\"在逃日期:2009-09-15 00:00:00\",\"reserved1\":\"一体化布控\",\"reserved2\":\"发现即抓捕，同时通知原籍公安机关\",\"reserved3\":\"22028219931203411X\",\"reserved4\":\"mac\",\"name\":\"李思远\",\"sex\":\"男\",\"identity\":\"430223198601117288\",\"serial_number\":\"43022319860111728820170323\",\"capture_time\":\"2017-03-20 18:02:37\"},{\"tag\":\"[一体化录入人员]的同家族人员|一体化录入人员|不准出境人员|危安管控对象\",\"message\":\"在逃日期:2009-09-15 00:00:00\",\"reserved1\":\"一体化布控\",\"reserved2\":\"发现即抓捕，同时通知原籍公安机关\",\"reserved3\":\"22028219931203411X\",\"reserved4\":\"mac\",\"name\":\"李思远\",\"sex\":\"男\",\"identity\":\"430223198601117288\",\"serial_number\":\"43022319860111728820170323\",\"capture_time\":\"2017-03-20 18:02:37\"}],\"status\":\"200\",\"message\":\"成功\",\"totalElements\":\"200\",\"totalPages\":\"20\"}";
   /*     String json2="{\"data\":[{\"tag\":\"危安管控对象\",\"id\":\"111111111111111\",\"message\":\" [缉控]【 2000000】: [缉控] 在逃日期: 2009 - 09 - 15 00: 00: 00 \",\"reserved1\":\"一体化布控\",\"reserved2\":\"发现即抓捕\",\"name\":\"李xx\",\"sex\":\"男\",\"identity\":\"XXX2231986XX117288\",\"serial_number\":\"XXX2231986XX117288_20190320 \",\"capture_image\":\"/static/rawdata/B1M31AB68528_20190721042342/B1M31AB68528_20190721042342-portrait.jpg\",\"device_no\":\" 0010101 \",\"place_name\":\"马家楼上访接济中心\",\"capture_time\":\"2019-03-20 18:02:37\"}],\"status\":\"200\",\"message\":\"成功\",\"totalElements\":\"200\",\"totalPages\":\"20\"}";
        JSONArray jsonArray2 = JSONObject.parseObject(json2).getJSONArray("data");
        if(jsonArray2.size() > 0){
            for (int i=0;i < jsonArray2.size();i++){
                CloudPersonWarnBean cloudPersonWarnBean = jsonArray2.getJSONObject(i).toJavaObject(CloudPersonWarnBean.class);
                System.out.println(cloudPersonWarnBean);
            }
        }*/

   /*     String json3= "{\"api_key\":\"\",\"api_secret\":\"\",\"datas\":[{\"id\":\"1\",\"personName\":\"XXX \",\"nation\":\"汉\",\"sex\":\"女\",\"idNo\":\"3426221987000007730\",\"addr\":\"河南省郑州市\",\"passTime\":\"2018-06-12 13:50:53\",\"deviceNo\":\"301107001\",\"deviceName\":\"1号数据门\",\"comparisonType\":\"1\",\"comparisonTypeName\":\"人证合一\",\"captureImgUrl\":\"http://10.10.12.21/group1/M00/05/0C/CgoMFVsd79yAcGLnAABrd8IZQWg849.jpg\",\"idnoImgUrl\":\"http://10.10.12.21/group1/M00/05/0C/CgoMFVsd79yAcGLnAABrd8IZQWg849.jpg\"}]}";
        JSONArray jsonArray3 = JSONObject.parseObject(json3).getJSONArray("datas");
        if(jsonArray3.size() > 0){
            for (int i=0;i < jsonArray3.size();i++){
                SwsjmPersonBean swsjmPersonBean = jsonArray3.getJSONObject(i).toJavaObject(SwsjmPersonBean.class);
                System.out.println(swsjmPersonBean);
            }
        }*/

/*
        String json4="{\"api_key\":\"\",\"api_secret\":\"\",\"datas\":[{\"id\":\"1\",\"personName\":\"张家X\",\"sex\":\"男\",\"nation\":\"汉\",\"idNo\":\"340881198704295000\",\"addr\":\"河南省郑州市\",\"warningTime\":\"2018-06-12 13:51:53\",\"deviceNo\":\"301107001\",\"deviceName\":\"1号数据门\",\"warningTypeName\":\"在逃人员\",\"warningTypeColor\":\"红色\",\"captureImgUrl\":\"http://10.10.12.21/group1/M00/05/0C/CgoMFVsd79yAcGLnAABrd8IZQWg849.jpg\",\"idnoImgUrl\":\"http://10.10.12.21/group1/M00/05/0C/CgoMFVsd79yAcGLnAABrd8IZQWg849.jpg\"}]}";
        JSONArray jsonArray4 = JSONObject.parseObject(json4).getJSONArray("datas");
        if(jsonArray4.size() > 0){
            for (int i=0;i < jsonArray4.size();i++){
                SwsjmWarnBean swsjmWarnBean = jsonArray4.getJSONObject(i).toJavaObject(SwsjmWarnBean.class);
                System.out.println(swsjmWarnBean);
            }
        }
        */








  /*      String json5 = "[{\"SERVICE_CODE\":\"11010135500373\",\"SERVICE_NAME\":\"簋街-WL\",\"ADDRESS\":\"北京市东城区簋街\",\"ZIP\":\"\",\"BUSINESS_NATURE\":\"3\",\"PRINCIPAL\":\"\",\"PRINCIPAL_TEL\":\"\",\"INFOR_MAN\":\"\",\"INFOR_MAN_TEL\":\"\",\"INFOR_MAN_EMAIL\":\"\",\"PRODUCER_CODE\":\"06\",\"STATUS\":\"1\",\"ENDING_NUMBER\":\"\",\"SERVER_NUMBER\":\"\",\"EXIT_IP\":\"\",\"AUTH_ACCOUNT\":\"\",\"NET_TYPE\":\"\",\"PRACTITIONER_NUMBER\":\"\",\"NET_MONITOR_DEPARTMENT\":\"\",\"NET_MONITOR_MAN\":\"\",\"NET_MONITOR_MAN_TEL\":\"\",\"REMARK\":\"\",\"SERVICE_TYPE\":\"D\",\"PROVINCE_CODE\":\"110000\",\"CITY_CODE\":\"110100\",\"AREA_CODE\":\"110101\",\"CITY_TYPE\":\"\",\"POLICE_CODE\":\"11010104\",\"MAIL_ACCOUNT\":\"\",\"MOBILE_ACCOUNT\":\"\",\"XPOINT\":\"116.42812\",\"YPOINT\":\"39.947244\",\"GIS_XPOINT\":\"\",\"GIS_YPOINT\":\"\",\"TERMINAL_FACTORY_ORGCODE\":\"723005104\",\"ORG_CODE\":\"596463021\",\"IP_TYPE\":\"\",\"BAND_WIDTH\":\"\",\"NET_LAN\":\"\",\"NET_LAN_TERMINAL\":\"\",\"IS_SAFE\":\"\",\"WIFI_TERMINAL\":\"\",\"PRINCIPAL_CERT_TYPE\":\"\",\"PRINCIPAL_CERT_CODE\":\"\",\"PERSON_NAME\":\"\",\"PERSON_TEL\":\"\",\"PERSON_QQ\":\"\",\"INFOR_MAN_QQ\":\"\",\"START_TIME\":\"\",\"END_TIME\":\"\",\"CREATE_TIME\":\"2016-04-27 12:20:08\",\"CAP_TYPE\":\"1\"},{\"SERVICE_CODE\":\"11010135500374\",\"SERVICE_NAME\":\"王府井步行街-WL\",\"ADDRESS\":\"北京市东城区王府井步行街\",\"ZIP\":\"\",\"BUSINESS_NATURE\":\"3\",\"PRINCIPAL\":\"\",\"PRINCIPAL_TEL\":\"\",\"INFOR_MAN\":\"\",\"INFOR_MAN_TEL\":\"\",\"INFOR_MAN_EMAIL\":\"\",\"PRODUCER_CODE\":\"06\",\"STATUS\":\"1\",\"ENDING_NUMBER\":\"\",\"SERVER_NUMBER\":\"\",\"EXIT_IP\":\"\",\"AUTH_ACCOUNT\":\"\",\"NET_TYPE\":\"\",\"PRACTITIONER_NUMBER\":\"\",\"NET_MONITOR_DEPARTMENT\":\"\",\"NET_MONITOR_MAN\":\"\",\"NET_MONITOR_MAN_TEL\":\"\",\"REMARK\":\"\",\"SERVICE_TYPE\":\"D\",\"PROVINCE_CODE\":\"110000\",\"CITY_CODE\":\"110100\",\"AREA_CODE\":\"110101\",\"CITY_TYPE\":\"\",\"POLICE_CODE\":\"11010121\",\"MAIL_ACCOUNT\":\"\",\"MOBILE_ACCOUNT\":\"\",\"XPOINT\":\"116.417676\",\"YPOINT\":\"39.918122\",\"GIS_XPOINT\":\"\",\"GIS_YPOINT\":\"\",\"TERMINAL_FACTORY_ORGCODE\":\"723005104\",\"ORG_CODE\":\"596463021\",\"IP_TYPE\":\"\",\"BAND_WIDTH\":\"\",\"NET_LAN\":\"\",\"NET_LAN_TERMINAL\":\"\",\"IS_SAFE\":\"\",\"WIFI_TERMINAL\":\"\",\"PRINCIPAL_CERT_TYPE\":\"\",\"PRINCIPAL_CERT_CODE\":\"\",\"PERSON_NAME\":\"\",\"PERSON_TEL\":\"\",\"PERSON_QQ\":\"\",\"INFOR_MAN_QQ\":\"\",\"START_TIME\":\"\",\"END_TIME\":\"\",\"CREATE_TIME\":\"2016-04-27 12:20:08\",\"CAP_TYPE\":\"1\"}]";


        String result = json5.toString();
        JSONArray jsonArray = JSONObject.parseArray(result);
        if(jsonArray.size() > 0){

            for (int i=0;i < jsonArray.size();i++){
                WifiCsInfoEntity wifiCsInfoEntity = jsonArray.getJSONObject(i).toJavaObject(WifiCsInfoEntity.class);
                System.out.println(wifiCsInfoEntity);
            }
        }*/

     //   System.out.println(jsonArray);
    }


}
