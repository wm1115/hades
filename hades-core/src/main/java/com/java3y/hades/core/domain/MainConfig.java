package com.java3y.hades.core.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 3y
 * 主配置
 * eg：{"instanceNames":["TencentSmsService"],"updateTime":"2023年3月20日10:26:0131"}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainConfig {

    /**
     * 实例名
     */
    private List<String> instanceNames;

    /**
     * 更新时间
     */
    private String updateTime;

}
