/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Factory
 * Author:   yuxing1994
 * Date:     2018/8/9 22:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.FactoryPattern;

/**
 * 简单工厂： 根据参数返回相对应的对象
 */
public class Factory {
    public static <T> T get(Class<T> clazz) {
        T obj = null;
        try {
            obj = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }
}