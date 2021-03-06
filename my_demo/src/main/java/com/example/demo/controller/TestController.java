package com.example.demo.controller;/**
 * @Author: LongfeiChen
 * @Description:
 * @Date: Created in 22:57 2021/4/24
 * @Modified By:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *ClassName TestController
 *@Description TODO
 *@Author: longfei
 *@Date: 2021/4/24 22:57
 *@Version 1.0
 添加一条注释
 测试远程main分支
 dev1
添加一条注释dev11
测试dev11远程
dev33
测试添加dev11_52后从dev11是否能拉取下来
 第一条

 main的分支
 第二条
 **/

@RestController
public class TestController {
    @Autowired
   private JdbcTemplate jdbcTemplate;
  @RequestMapping("/getUsers")
  public List<Map<String,Object>> getDbType(){
   String sql="SELECT * from student";
   List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
   for(Map<String,Object> map:list){
      Set<Map.Entry<String,Object>> entries=map.entrySet();
      if(entries!=null){
          Iterator<Map.Entry<String,Object>> iterator=entries.iterator();
          while(iterator.hasNext()){
         Map.Entry<String,Object> entry=(Map.Entry<String,Object>) iterator.next();
         Object key=entry.getKey();
         Object value=entry.getValue();
         System.out.println(key+":"+value);
          }
      }

   }
      return  list;
  }



}
