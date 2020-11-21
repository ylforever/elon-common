package com.elon.common.utility;

/**
 * 对象相等比较工具类. 该工具类解决不同类型的对象用equals比较编译不报错, 出问题不容易识别的问题.
 *
 * @author elon
 * @since 1.0
 */
public class EqualCompare<T> {
    /**
     * 字符串相等比较器. 常用的工具类可以定义为常量.
     */
    public static final EqualCompare<String> STRING_EQUAL = new EqualCompare<>();

    /**
     * 对象相等比较.
     *
     * @param a 比较的对象
     * @param b 比较的对象
     * @return true-相等; false-不相等
     */
    public boolean equals(T a, T b) {
        if (a == null) {
            return false;
        }

        return a.equals(b);
    }
}
