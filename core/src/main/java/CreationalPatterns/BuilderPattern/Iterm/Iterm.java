/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Iterm
 * Author:   yuxing1994
 * Date:     2018/8/23 22:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.BuilderPattern.Iterm;

import CreationalPatterns.BuilderPattern.Packing.Packing;

/**
 * 〈商品〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/23
 * @since 1.0.0
 */
public interface Iterm {
    String name();

    Packing pack();

    float price();
}