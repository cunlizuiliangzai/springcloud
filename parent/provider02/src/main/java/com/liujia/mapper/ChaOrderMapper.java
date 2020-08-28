package com.liujia.mapper;

import com.liujia.entity.ChaOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author ex_111806190
 * @since 2020-8-27 15:00
 */
@Mapper
public interface ChaOrderMapper {

    ChaOrder getChaOrder(String id);

    List<ChaOrder> getChaOrders();

}
