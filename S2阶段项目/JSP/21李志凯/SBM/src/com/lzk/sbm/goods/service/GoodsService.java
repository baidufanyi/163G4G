/**
 * 
 */
package com.lzk.sbm.goods.service;

import com.lzk.sbm.goods.bean.Goods;

/**
 * @author admin
 * 2017年11月15日
 */
public interface GoodsService {
	
	/**
	 * @param goodsNum
	 * @param goodsId
	 * @return
	 */
	public int updateGoods(int goodsNum, int goodsId);

	/**
	 * @param goodsName
	 * @return
	 * 
	 */
	public Goods getGoodsInfoByName(String goodsName);
}
