package io.docbot;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16-3-20
 * Time: 下午1:04
 * To change this template use File | Settings | File Templates.
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        this.registerBeanDefinitionParser("docbot",new MyBeanDefinitionParser());
    }
}
