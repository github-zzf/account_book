package com.yandaizang.service;

import com.yandaizang.entity.Client;
import com.yandaizang.vo.JsonVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zzf
 * @since 2020-01-07
 */
public interface IClientService {
    List<Client> findList(Client client);

    Object findPage(int page, int size);

    JsonVo insert(Client client);

    JsonVo remove(String ids);

    JsonVo update(Client client);
}
