/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LinuxFactory
 * Author:   yuxing1994
 * Date:     2018/8/9 23:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.AbstractFactoryPattern.Factory;

import CreationalPatterns.AbstractFactoryPattern.Color.Color;
import CreationalPatterns.AbstractFactoryPattern.Factory.AbstractFactory;
import CreationalPatterns.AbstractFactoryPattern.Linux.Linux;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/9
 * @since 1.0.0
 */
public class LinuxFactory extends AbstractFactory {


    @Override
    public Color getColor(Class<? extends Color> colorClass) {
        return null;
    }

    @Override
    public Linux getLinux(Class<? extends Linux> linuxClass) {
        Linux linux = null;
        try {
            linux = linuxClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return linux;
    }
}