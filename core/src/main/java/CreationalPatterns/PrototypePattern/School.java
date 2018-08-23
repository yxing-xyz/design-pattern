/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: School
 * Author:   yuxing1994
 * Date:     2018/8/15 22:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.PrototypePattern;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/15
 * @since 1.0.0
 */
public class School implements Serializable {
    String name;
    Address address;

    public School(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static class Builder {
        String name;
        Address address;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Address getAddress() {
            return address;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public School build() {
            return new School(this);
        }

    }

    public static Builder newBuilder() {
        return new Builder();
    }
}