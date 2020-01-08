package com.yandaizang.serviceImpl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yandaizang.entity.Goods;
import com.yandaizang.mapper.GoodsMapper;
import com.yandaizang.service.IGoodsService;
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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {
	
}
