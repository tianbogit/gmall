package com.tian.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * spu销售属性值
 * </p>
 *
 * @author tian
 * @since 2020-03-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pms_product_sale_attr_value")
@ApiModel(value="ProductSaleAttrValue对象", description="spu销售属性值")
public class ProductSaleAttrValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商品id")
    @TableField("product_id")
    private Long productId;

    @ApiModelProperty(value = "销售属性id")
    @TableField("sale_attr_id")
    private Long saleAttrId;

    @ApiModelProperty(value = "销售属性值名称")
    @TableField("sale_attr_value_name")
    private String saleAttrValueName;


}
