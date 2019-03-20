package sorm.core;

import java.util.List;

/**
 * 负责查询（提供核心的服务类）
 */
public interface Query {
    /**
     * 执行DML语句
     * @param sql sql语句
     * @param parms  参数
     * @return  返回sql执行影响记录的行数
     */
    int executeDML(String sql, Object[] parms);

    /**
     * 将一个对象插入到数据库
     * @param obj 需要插入的对象
     * @return
     */
    void insert(Object obj);

    /**
     * 删除Class表示类对应在数据库中的记录（根据主键值id删除记录）
     * @param clazz  需要删除类的class对象
     * @param id  主键
     */
    void delete(Class clazz, int id);
    /**
     * 删除对象对应在数据库中的记录（根据obj自己的id删除记录）
     * @param obj 需要删除的类
     */
    void delete(Object obj);

    /**
     * 更新对象在表中的记录，并且只更新指定的属性
     * @param obj 需要更新的对象
     * @param fidldNames 更新的属性
     * @return 返回sql执行影响记录的行数
     */
    int update(Object obj, Object[] fidldNames); //update user set xx = ?,xx = ?;

    /**
     * 查询返回多行记录，并且将每行记录封装到Class指定的对象中
     * @param sql sql语句
     * @param clazz 用于封装JavaBean指定对象的class
     * @param parms sql参数
     * @return 查询的结果
     */
    List queryRows(String sql, Class clazz, Object[] parms);
    /**
     * 查询返回一行记录，并将记录封装到Class指定的对象中
     * @param sql sql语句
     * @param clazz 用于封装JavaBean指定对象的class
     * @param parms sql参数
     * @return 查询的结果
     */
    Object queryUniqueRows(String sql, Class clazz, Object[] parms);
    /**
     * 查询返回一个值（一行一列）
     * @param sql sql语句
     * @param parms sql参数
     * @return 查询的结果
     */
    Object queryValue(String sql, Object[] parms);
    /**
     * 查询返回数字
     * @param sql sql语句
     * @param parms sql参数
     * @return 查询的结果
     */
    Number queryUniqueNumber(String sql, Object[] parms);
}
