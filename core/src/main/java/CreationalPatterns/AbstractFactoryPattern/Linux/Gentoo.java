/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Gentoo
 * Author:   yuxing1994
 * Date:     2018/8/9 23:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.AbstractFactoryPattern.Linux;

import CreationalPatterns.AbstractFactoryPattern.Linux.Linux;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/9
 * @since 1.0.0
 */
public class Gentoo implements Linux {

    @Override
    public void kernel() {
        System.out.println("Gentoo Linux 4.14");
    }
}