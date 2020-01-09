package com.yandaizang.controler;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yandaizang.entity.Client;
import com.yandaizang.serviceImpl.ClientServiceImpl;
import com.yandaizang.vo.JsonVo;
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
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientServiceImpl clientService;
    @RequestMapping(value = "")
    public String getIndex(){
        return "client";
    }
    @RequestMapping(value = "findPage")
    @ResponseBody
    public IPage<Client> findPage(@RequestParam(value = "page",defaultValue = "1")int page,
                                  @RequestParam(value = "size",defaultValue = "10")int size){
        return clientService.findPage(page, size);
    }
    @RequestMapping(value = "findList")
    @ResponseBody
    public Object findList(Client client){
        return clientService.findList(client);
    }
    @RequestMapping(value = "updateClient")
    @ResponseBody
    public JsonVo updateClient(Client client){
        return clientService.update(client);
    }
    @RequestMapping(value = "insertClient")
    @ResponseBody
    public JsonVo insertClient(Client client){return clientService.insert(client);}
    @RequestMapping(value = "removeClient")
    @ResponseBody
    public JsonVo removeClient(String ids){return clientService.remove(ids);}
}
