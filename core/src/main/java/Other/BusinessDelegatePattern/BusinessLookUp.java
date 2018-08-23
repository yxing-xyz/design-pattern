/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BusinessLookUp
 * Author:   yuxing1994
 * Date:     2018/8/21 23:04
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
public class BusinessLookUp {
    public BusinessService getBusinessService(Class<? extends BusinessService> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}