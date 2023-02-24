package com.example.restful.controller;

import com.example.restful.entity.Model;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@Api(tags = "模型数据接口")
@RequestMapping("models")
public class TestController {

    public static List<Model> models =new ArrayList<Model>();
    static{
        models.add(new Model("model1","1"));
        models.add(new Model("model2","2"));
    }

    @GetMapping("/models")
    @ApiOperation(value = "获取模型列表",notes = "获取所有模型的列表")
    public Object users(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("models", models);
        return models;
    }

    @GetMapping("/models/{id}")
    @ApiOperation(value = "获取单个模型",notes = "根据模型ID查询模型的信息")
    public Model getUsersById(@PathVariable("id") int id){
        return models.get(id - 1);
    }

    @ApiOperation(value = "添加单个模型",notes = "根据模型ID信息添加")
    @PostMapping("/modelAdd")
    public Object add(Model model){
        return models.add(model);
    }

    @DeleteMapping("/models/{id}")
    @ApiOperation(value = "删除模型",notes = "根据模型ID删除模型的信息")
    public Object delete(@PathVariable("id") int id){
        return models.remove(id);
    }
}
