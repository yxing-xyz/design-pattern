/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Archlinux
 * Author:   yuxing1994
 * Date:     2018/8/9 23:02
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
public class Archlinux implements Linux{

    @Override
    public void kernel() {
        System.out.println("Arch Linux 4.17");
    }
}