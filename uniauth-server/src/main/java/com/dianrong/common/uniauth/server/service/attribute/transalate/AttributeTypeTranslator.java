package com.dianrong.common.uniauth.server.service.attribute.transalate;

import com.dianrong.common.uniauth.server.service.attribute.exp.InvalidPropertyValueException;

/**
 * 用于扩展属性值的类型转换处理.
 * 需要兼容对null的处理.
 */
public interface AttributeTypeTranslator {
  
  /**
   * 转化成一个数据库认识的类型.
   */
  Object toDatabaseType(String attribute) throws InvalidPropertyValueException;

  /**
   * 从字符串转化为对应的类型.
   */
  Object toRealType(String attribute) throws InvalidPropertyValueException;

  /**
   * 从实际类型转换为一个字符.
   */
  String toString(Object obj);
}
