package com.yandaizang.serviceImpl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yandaizang.entity.Account;
import com.yandaizang.mapper.AccountMapper;
import com.yandaizang.service.IAccountService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzf
 * @since 2020-01-07
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {
	
}
