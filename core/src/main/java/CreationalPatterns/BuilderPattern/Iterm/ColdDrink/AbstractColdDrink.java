/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AbstractColdDrink
 * Author:   yuxing1994
 * Date:     2018/8/23 22:31
 * Description: '
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.BuilderPattern.Iterm.ColdDrink;

import CreationalPatterns.BuilderPattern.Iterm.Iterm;
import CreationalPatterns.BuilderPattern.Packing.Bottle;
import CreationalPatterns.BuilderPattern.Packing.Packing;

/**
 * 〈一句话功能简述〉<br>
 * 〈'〉
 *
 * @author yuxing1994
 * @create 2018/8/23
 * @since 1.0.0
 */
public abstract class AbstractColdDrink implements Iterm {

    @Override
    public Packing pack() {
        return new Bottle();
    }

    @Override
    public abstract String name();

    @Override
    public abstract float price();
}