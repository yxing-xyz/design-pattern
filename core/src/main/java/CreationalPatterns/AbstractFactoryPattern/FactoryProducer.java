/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FactoryProducer
 * Author:   yuxing1994
 * Date:     2018/8/9 23:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.AbstractFactoryPattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/9
 * @since 1.0.0
 */
public class FactoryProducer {
    public static AbstractFactory  getFactory(Class<? extends  AbstractFactory> cls)
    {
        AbstractFactory abstractFactory = null;
        try {
             abstractFactory = cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return abstractFactory;
    }

}