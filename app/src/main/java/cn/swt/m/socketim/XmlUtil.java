package cn.swt.m.socketim;

import com.thoughtworks.xstream.XStream;

/**
 * 介绍：这里写介绍
 * 作者：sweet
 * 邮箱：sunwentao@priemdu.cn
 * 时间: 2017/11/13
 */
public class XmlUtil {

    public static String toxml(QQMessage qqMessage) {
        XStream xStream = new XStream();
        xStream.alias("QQMessage", QQMessage.class);
        return xStream.toXML(qqMessage);
    }


    public static Object fromXml(String xml) {
        XStream xStream = new XStream();
        xStream.alias("QQMessage", QQMessage.class);
        return xStream.fromXML(xml);
    }
}
