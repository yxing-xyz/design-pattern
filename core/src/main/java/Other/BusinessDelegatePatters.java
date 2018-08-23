/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BusinessDelegatePatters
 * Author:   yuxing1994
 * Date:     2018/8/21 23:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Other;

import Other.BusinessDelegatePattern.BusinessDelegate;
import Other.BusinessDelegatePattern.Client;
import Other.BusinessDelegatePattern.EJBService;
import Other.BusinessDelegatePattern.JMSService;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/21
 * @since 1.0.0
 */
public class BusinessDelegatePatters {

    public static void main(String args[]) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setBusinessService(EJBService.class);

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setBusinessService(JMSService.class);
        client.doTask();

    }

}