/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GreenCircle
 * Author:   yuxing1994
 * Date:     2018/9/1 21:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package StructuralPatterns.BridgePattern.Circle;

import StructuralPatterns.BridgePattern.DrawAPI;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/9/1
 * @since 1.0.0
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                    + radius +", x: " +x+", "+ y +"]");
    }
}