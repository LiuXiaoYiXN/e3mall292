package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {
/**
 * 需求根据商品id  查询商品数据
 * 参数:Long itemId
 * 返回值:TbItem
 */
	public TbItem findItemById(Long itemId);
	
	
}
