/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: EJBService
 * Author:   yuxing1994
 * Date:     2018/8/21 23:02
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
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");

    }
}
