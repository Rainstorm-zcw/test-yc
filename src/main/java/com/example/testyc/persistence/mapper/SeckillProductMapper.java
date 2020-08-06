package com.example.testyc.persistence.mapper;

import com.example.testyc.persistence.entity.SeckillProduct;
import com.example.testyc.persistence.entity.SeckillProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SeckillProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seckill_product
     *
     * @mbggenerated
     */
    int countByExample(SeckillProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seckill_product
     *
     * @mbggenerated
     */
    int deleteByExample(SeckillProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seckill_product
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seckill_product
     *
     * @mbggenerated
     */
    int insert(SeckillProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seckill_product
     *
     * @mbggenerated
     */
    int insertSelective(SeckillProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seckill_product
     *
     * @mbggenerated
     */
    List<SeckillProduct> selectByExample(SeckillProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seckill_product
     *
     * @mbggenerated
     */
    SeckillProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seckill_product
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SeckillProduct record, @Param("example") SeckillProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seckill_product
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SeckillProduct record, @Param("example") SeckillProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seckill_product
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SeckillProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seckill_product
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SeckillProduct record);
}