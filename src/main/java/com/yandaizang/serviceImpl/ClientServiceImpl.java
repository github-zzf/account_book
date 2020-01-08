package com.yandaizang.serviceImpl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yandaizang.entity.Client;
import com.yandaizang.mapper.ClientMapper;
import com.yandaizang.service.IClientService;
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
    public Object listAll(int page, int size) {

        Page pageObj = new Page(page, size);
        return clientMapper.selectPage(pageObj, null);
    }
    @Override
    public int insert(Client client) {
        return clientMapper.insert(client);
    }

    @Override
    public int remove(Integer clientId) {
        return clientMapper.deleteById(clientId);
    }

    @Override
    public int update(Client client) {
        return clientMapper.updateById(client);
    }
}
