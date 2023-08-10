package com.nanyin.java8.optional;

/**
 * Description:
 *
 * @author: gaoguoxing
 * @date: 2023/8/8 10:56
 * @version: 1.0
 */

public enum CreateTypeEnum {
    //空的Optional实例
    EMPTY(1,"empty"),

    // 静态方法需要一个非null参数；否则，将引发空指针异常
    STATIC_OF(2,"static of"),

    // 返回描述指定值的Optional，如果非空，则返回空值。
    STATIC_OF_NULLABLE(3, "static of nullable");

    int type;
    String desc;

    CreateTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
