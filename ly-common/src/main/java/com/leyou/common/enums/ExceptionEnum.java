package com.leyou.common.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author the one
 * @create 2019-01-17 23:49
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ExceptionEnum {

    PRICE_CANNOT_BE_NULL(400,"价格不能为空！"),
    category_not_found(404,"商品分类没查到"),
    BRAND_SAVE_ERROR(500,"新增商品失败"),
    ;
    private int code;
    private String msg;

}
