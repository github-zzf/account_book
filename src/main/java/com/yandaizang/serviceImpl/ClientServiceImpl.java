package com.yandaizang.serviceImpl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yandaizang.entity.Client;
import com.yandaizang.mapper.ClientMapper;
import com.yandaizang.service.IClientService;
import com.yandaizang.vo.JsonVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzf
 * @since 2020-01-07
 */
@Service
public class ClientServiceImpl  implements IClientService {
    @Resource
    private ClientMapper clientMapper;

    @Override
    public List<Client> findList(Client client) {
        return clientMapper.selectList(client);
    }

    @Override
    public IPage<Client> findPage(int page, int size) {

        Page pageObj = new Page(page, size);
        return clientMapper.selectPage(pageObj, null);
    }
    @Override
    public JsonVo insert(Client client) {
       clientMapper.insert(client);
        return JsonVo.sendOk();
    }

    @Override
    public JsonVo remove(String ids) {
        String[] clientIds = ids.split(",");
        for (String clientId : clientIds) {
             clientMapper.deleteById(clientId);
        }
        return JsonVo.sendOk();
    }

    @Override
    public JsonVo update(Client client) {
         clientMapper.updateById(client);
        return JsonVo.sendOk();
    }
}
