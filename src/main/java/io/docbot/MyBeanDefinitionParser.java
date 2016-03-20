package io.docbot;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16-3-20
 * Time: 下午1:06
 * To change this template use File | Settings | File Templates.
 */
public class MyBeanDefinitionParser implements BeanDefinitionParser {
    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        GenericBeanDefinition bean = new GenericBeanDefinition();
        bean.setBeanClass(MyBean.class);
        bean.getPropertyValues().add("name",element.getAttribute("name"));
        bean.getPropertyValues().add("timeOut",element.getAttribute("timeOut"));
        parserContext.getRegistry().registerBeanDefinition("myBean",bean);
        return bean;
    }
}
