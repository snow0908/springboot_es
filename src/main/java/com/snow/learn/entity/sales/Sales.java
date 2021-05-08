package com.snow.learn.entity.sales;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author lx
 * @since 2021-05-08
 */
@Data
@TableName("tb_sales")
public class Sales extends Model<Sales> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    private String brand;

    private String color;

    private BigDecimal price;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Sales{" +
        "id=" + id +
        ", brand=" + brand +
        ", color=" + color +
        ", price=" + price +
        "}";
    }
}
