package com.yandaizang.controler;

import com.yandaizang.entity.Client;
import com.yandaizang.serviceImpl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zzf
 * @since 2020-01-07
 */
@Controller
@RequestMapping("/yandaizang/client")
public class ClientController {
    @Autowired
    private ClientServiceImpl clientService;
    @RequestMapping(value = "")
    public String getIndex(){
        return "client";
    }
    @RequestMapping(value = "listAll")
    @ResponseBody
    public Object listAll(@RequestParam(value = "page",defaultValue = "1")int page,
                           @RequestParam(value = "size",defaultValue = "10")int size){
        return clientService.listAll(page, size);
    }
    @RequestMapping(value = "updateClient")
    @ResponseBody
    public int updateClient(Client client){
        return clientService.update(client);
    }
}
