package com.yandaizang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yandaizang.entity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author zzf
 * @since 2020-01-07
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}