package com.dataql.sync;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.dataql.bean.CarRecordInfo;
import com.dataql.bean.FaceDoorRecord;
import com.dataql.service.impl.CarRecordInfoServiceImpl;
import com.dataql.service.impl.FaceDoorRecordServiceImpl;

import com.dataql.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Component
public class SynScheduler {

    @Autowired
    private CarRecordInfoServiceImpl carService;

    @Autowired
    private FaceDoorRecordServiceImpl faceService;

    private final  Logger logger = Logger.getLogger(SynScheduler.class.getName());


   /* @Autowired
    public SynScheduler(InstitutionService institutionService, HouseService houseService, ResidentCarService residentCarService, ResidentService residentService, DeviceService deviceService, DeviceStatusService deviceStatusService, CarPassRecordService carPassRecordService, PassRecordService passRecordService, BuildingService buildingService, CarRecordService carRecordService, FaceDoorRecordService faceDoorRecordService, ResidentFaceService residentFaceService) {
        this.institutionService = institutionService;
        this.houseService = houseService;
        this.residentCarService = residentCarService;
        this.residentService = residentService;
        this.deviceService = deviceService;
        this.deviceStatusService = deviceStatusService;
        this.carPassRecordService = carPassRecordService;
        this.passRecordService = passRecordService;

        this.buildingService = buildingService;
        this.carRecordService = carRecordService;
        this.faceDoorRecordService = faceDoorRecordService;
        this.residentFaceService = residentFaceService;
    }*/


    @Scheduled(cron = "0/30 * * * * ?")
    public void carSync(){

        logger.info("-----------------------车辆通过记录同步任务执行开始-----------------------");
        String s = HttpUtil.sendGet("http://11.2.12.8:80/khjy/carRecord/query", "");

        JSONObject objects = JSONArray.parseObject(s);
        JSONArray data = objects.getJSONArray("data");
        List<CarRecordInfo> list = JSON.parseObject(data.toJSONString(), new TypeReference<List<CarRecordInfo>>() {
        });
        if(list!=null&&list.size()>0) carService.saveBatch(list);

        logger.info("-----------------------车辆通过记录同步任务执行结束>>>>更新记录"+list.size()+"-----------------------");

    }


    @Scheduled(cron = "0/30 * * * * ?")
    public void faceSync(){
        logger.info("-----------------------人员通过记录同步任务执行开始-----------------------");

        String s = HttpUtil.sendGet("http://11.2.12.8:80/khjy/faceDoorRecord/query", "");

        JSONObject objects = JSONArray.parseObject(s);
        JSONArray data = objects.getJSONArray("data");
        List<FaceDoorRecord> list = JSON.parseObject(data.toJSONString(), new TypeReference<List<FaceDoorRecord>>() {
        });
        if(list!=null&&list.size()>0) faceService.saveBatch(list);

        logger.info("-----------------------人员通过记录同步任务执行结束>>>>更新记录"+list.size()+"-----------------------");

    }



}
