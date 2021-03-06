package com.lightconf.common.model;

import com.alibaba.fastjson.annotation.JSONType;

import java.util.List;

/**
 * 服务端推送消息实体。
 * @author whfstudio@163.com
 * @date 2018/04/08
 */
@JSONType(typeName = "loginMsg")
public class PushMsg extends BaseMsg {

    private String key;
    private String value;
    private String confType;

    private List<Config> configList;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getConfType() {
        return confType;
    }

    public void setConfType(String confType) {
        this.confType = confType;
    }

    public List<Config> getConfigList() {
        return configList;
    }

    public void setConfigList(List<Config> configList) {
        this.configList = configList;
    }
}
