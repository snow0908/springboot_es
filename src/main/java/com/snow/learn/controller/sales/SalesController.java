package com.snow.learn.controller.sales;


import com.snow.learn.entity.sales.Sales;
import com.snow.learn.service.sales.SalesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lx
 * @since 2021-05-08
 */
@RestController
@RequestMapping("/sales")
public class SalesController {
    @Resource
    private SalesService salesService;

    @GetMapping("getSalesList")
    public List<Sales> getSalesList(){
        return salesService.getSalesList();
    }


}

