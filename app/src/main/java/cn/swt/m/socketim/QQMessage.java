package cn.swt.m.socketim;

/**
 * 介绍：这里写介绍
 * 作者：sweet
 * 邮箱：sunwentao@priemdu.cn
 * 时间: 2017/11/13
 */
public class QQMessage {

    public String content;//消息内容
    public String type;//消息类型
    public String sendTime;//发送时间
    public String fromNick;//发送者昵称
    public String from;//发送者账号
    public String to;//接收者账号
    public int fromAvatar;//发送者性别 0, 1

    @Override
    public String toString() {
        return "QQMessage [content=" + content + ", type=" + type
                + ", sendTime=" + sendTime + ", fromNick=" + fromNick
                + ", from=" + from + ", to=" + to + ", fromAvatar="
                + fromAvatar + "]";
    }
}
