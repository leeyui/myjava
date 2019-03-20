package sorm.bean;

import java.util.Map;

/**
 * 封装了数据库表的信息
 */
public class TableInfo {
    /**
     * 表名
     */
    private String tname;
    /**
     * 表中所有的字段信息
     * String:字段名
     */
    private Map<String, ColumnInfo> columns;
    /**
     * 主键
     */
    private  ColumnInfo priKey;

    public TableInfo() {
    }

    public TableInfo(String tname, Map<String, ColumnInfo> columns, ColumnInfo priKey) {
        this.tname = tname;
        this.columns = columns;
        this.priKey = priKey;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Map<String, ColumnInfo> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, ColumnInfo> columns) {
        this.columns = columns;
    }

    public ColumnInfo getPriKey() {
        return priKey;
    }

    public void setPriKey(ColumnInfo priKey) {
        this.priKey = priKey;
    }
}
