/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Coke
 * Author:   yuxing1994
 * Date:     2018/8/23 22:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.BuilderPattern.Iterm.ColdDrink;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/23
 * @since 1.0.0
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}