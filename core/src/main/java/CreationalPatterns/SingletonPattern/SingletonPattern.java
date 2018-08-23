package CreationalPatterns.SingletonPattern; /**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CreationalPatterns.SingletonPattern.SingletonPattern
 * Author:   yuxing1994
 * Date:     2018/8/8 23:09
 * Description: 单利模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


/**
 * 〈一句话功能简述〉<br>
 * 〈单利模式〉
 *
 * @author yuxing1994
 * @create 2018/8/8
 * @since 1.0.0
 */
public class SingletonPattern {
    private static class SingletonFactory {
        private static SingletonPattern singleton = new SingletonPattern();
    }

    public static SingletonPattern getInstance() {
        return SingletonFactory.singleton;
    }
}
