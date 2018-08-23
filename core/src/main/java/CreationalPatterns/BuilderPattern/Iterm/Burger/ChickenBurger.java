/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ChickenBurger
 * Author:   yuxing1994
 * Date:     2018/8/23 22:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.BuilderPattern.Iterm.Burger;

import CreationalPatterns.BuilderPattern.Iterm.Burger.Burger;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/23
 * @since 1.0.0
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "ChickenBurger";

    }

    @Override
    public float price() {
        return 10.0f;
    }
}