package com.snow.learn.entity.esBean;

import lombok.Data;
import org.springframework.data.annotation.Id;

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
public class EsSales {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String brand;

    private String color;

    private BigDecimal price;

}
