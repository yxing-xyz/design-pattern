/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: JMSService
 * Author:   yuxing1994
 * Date:     2018/8/21 23:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Other.BusinessDelegatePattern;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/21
 * @since 1.0.0
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}