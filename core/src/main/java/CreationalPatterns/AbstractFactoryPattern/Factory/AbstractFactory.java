/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AbstractFactory
 * Author:   yuxing1994
 * Date:     2018/8/9 23:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.AbstractFactoryPattern.Factory;

import CreationalPatterns.AbstractFactoryPattern.Color.Color;
import CreationalPatterns.AbstractFactoryPattern.Linux.Linux;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/9
 * @since 1.0.0
 */
public abstract class AbstractFactory {
    public abstract Color getColor(Class<? extends Color> colorClass);
    public abstract Linux getLinux(Class<? extends Linux> linuxClass) ;
}