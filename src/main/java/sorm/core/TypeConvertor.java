package sorm.core;

/**
 * Java数据类型与数据库的数据类型相互转换
 */
public interface TypeConvertor {

    /**
     * 将数据库类型转换为Java类型
     * @param columnType 数据库的字段类型
     * @return Java类型
     */
    String databaseType2JavaType(String columnType);

    /**
     * 将Java类型转换为数据库类型
     * @param javaType Java数据类型
     * @return 数据库数据类型
     */
    String javaType2databseType(String javaType);
}
