/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Circle
 * Author:   yuxing1994
 * Date:     2018/9/1 21:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package StructuralPatterns.BridgePattern.Circle;


import StructuralPatterns.BridgePattern.AbstractShape;
import StructuralPatterns.BridgePattern.DrawAPI;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/9/1
 * @since 1.0.0
 */
public class Circle extends AbstractShape {
    private int radius, x, y;

    public Circle(DrawAPI drawAPI, int radius, int x, int y) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}