package com.yandaizang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yandaizang.entity.Client;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author zzf
 * @since 2020-01-07
 */
@Mapper
public interface ClientMapper extends BaseMapper<Client> {
}