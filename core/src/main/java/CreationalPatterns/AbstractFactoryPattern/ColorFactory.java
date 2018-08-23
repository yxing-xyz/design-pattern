/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ColorFactory
 * Author:   yuxing1994
 * Date:     2018/8/9 23:08
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
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(Class<? extends Color> colorClass) {
        Color color = null;
        try {
            color = colorClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return color;
    }

    @Override
    public Linux getLinux(Class<? extends Linux> linuxClass) {
        return null;
    }
}