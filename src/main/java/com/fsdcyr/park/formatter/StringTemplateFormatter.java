package com.fsdcyr.park.formatter;

import us.codecraft.webmagic.model.formatter.ObjectFormatter;

public class StringTemplateFormatter implements ObjectFormatter<String> {

    private String template;

    public String format(String raw) throws Exception {
        return String.format(template, raw);
    }

    public Class<String> clazz() {
        return String.class;
    }

    public void initParam(String[] extra) {
        template = extra[0];
    }
}