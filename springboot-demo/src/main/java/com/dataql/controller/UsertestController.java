package com.dataql.controller;


import com.dataql.bean.CarRecordInfo;
import com.dataql.bean.Usertest;
import com.dataql.config.ResultInfo;
import com.dataql.config.Status;
import com.dataql.service.impl.CarRecordInfoServiceImpl;
import com.dataql.service.impl.UsertestServiceImpl;
import com.dataql.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2021-01-26
 */
@RestController
@RequestMapping("/usertest")
public class UsertestController {

    @Autowired
    private UsertestServiceImpl usertestService;

    @Autowired
    private CarRecordInfoServiceImpl service;
    @RequestMapping("/list")
    @ResponseBody
    public R getlist(){

        List<Usertest> list = usertestService.list();

        Map map = new HashMap();
        map.put("data",list);
        return R.ok(map);
    }

    @RequestMapping("/list1")
    @ResponseBody
    public List getlist1(){

        List<Usertest> list = usertestService.list();

        Map map = new HashMap();
        map.put("data",list);
        return list;
    }

    @RequestMapping("/list2")
    @ResponseBody
    public ResultInfo getlist2(){

        List<CarRecordInfo> list = service.list();

        ResultInfo res =new ResultInfo();
        res.setCode(200);
        res.setResult(list);

        return res;
    }

}
