/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Address
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
public class Address implements Serializable {
    // 省市区
    String  country,
            province,
            cicy,
            district;

    public Address(Builder builder) {
        this.country = builder.country;
        this.province = builder.province;
        this.cicy = builder.cicy;
        this.district = builder.district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCicy() {
        return cicy;
    }

    public void setCicy(String cicy) {
        this.cicy = cicy;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public static class Builder {
        String country;
        String province = "";
        String cicy = "";
        String district = "";

        public String getCountry() {
            return country;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public String getProvince() {
            return province;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public String getCicy() {
            return cicy;
        }

        public Builder setCicy(String cicy) {
            this.cicy = cicy;
            return this;
        }

        public String getDistrict() {
            return district;
        }

        public Builder setDistrict(String district) {
            this.district = district;
            return this;
        }

        public Address Build() {
            return new Address(this);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}