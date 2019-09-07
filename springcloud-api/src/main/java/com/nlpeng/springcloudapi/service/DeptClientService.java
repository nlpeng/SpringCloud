package com.nlpeng.springcloudapi.service;

import com.nlpeng.springcloud.entity.Dept;
import com.nlpeng.springcloudapi.service.impl.DeptClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Description: 修改springcloud-api工程，根据已经有的DeptClientService接口
 * 创建一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 * @author Ferry NLP
 * @create 2019-09-06
 * @since 1.0v
 **/
@FeignClient(value = "SPRINGCLOUD-DEPT",fallbackFactory= DeptClientServiceFallbackFactory.class)
public interface DeptClientService
{
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);
}