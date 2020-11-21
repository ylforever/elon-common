package com.elon.common.utility;

/**
 * 不同颜色枚举定义
 */
public enum EnumColor {
    RED("red"),

    BLUE("blue");

    private String color;

    private EnumColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
