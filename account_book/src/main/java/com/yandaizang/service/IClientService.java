package com.yandaizang.service;

import com.yandaizang.entity.Client;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zzf
 * @since 2020-01-07
 */
public interface IClientService {
    Object listAll(int page, int size);

    int insert(Client client);

    int remove(Integer clientId);

    int update(Client client);
}
