package com.wangyu892449346.bluechat.Interface;

/**
 * Created by wangyu892449346 on 4/13/17.
 * 处理网络协议，对数据进行封包或解包
 */
public interface ProtocolHandler<T> {

    public byte[] encodePackage(T data);

    public T decodePackage(byte[] netData);
}
