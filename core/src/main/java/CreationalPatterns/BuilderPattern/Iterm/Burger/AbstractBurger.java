/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AbstractBurger
 * Author:   yuxing1994
 * Date:     2018/8/23 22:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.BuilderPattern.Iterm.Burger;

import CreationalPatterns.BuilderPattern.Iterm.Iterm;
import CreationalPatterns.BuilderPattern.Packing.Packing;
import CreationalPatterns.BuilderPattern.Packing.Wrapper;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/23
 * @since 1.0.0
 */
public abstract class AbstractBurger implements Iterm {

    @Override
    public Packing pack() {
        return new Wrapper();
    }

    @Override
    public abstract String name();


    @Override
    public abstract float price();
}