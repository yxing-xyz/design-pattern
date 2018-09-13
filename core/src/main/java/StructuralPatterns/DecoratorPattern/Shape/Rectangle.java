/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Rectangle
 * Author:   yuxing1994
 * Date:     2018/9/12 20:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package StructuralPatterns.DecoratorPattern.Shape;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/9/12
 * @since 1.0.0
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}