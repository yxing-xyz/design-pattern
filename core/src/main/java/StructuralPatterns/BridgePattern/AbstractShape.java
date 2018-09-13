/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AbstractShape
 * Author:   yuxing1994
 * Date:     2018/9/1 21:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package StructuralPatterns.BridgePattern;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/9/1
 * @since 1.0.0
 */
public abstract class AbstractShape {
    protected DrawAPI drawAPI;

     public AbstractShape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;

    }
    public abstract void draw();
}