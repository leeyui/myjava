###IO流的操作过程
1.创建源 2.选择流 3.操作 4.关闭  
1024 * 10 * 5：1M * 10 * 5便于阅读  
###节点流  
FileInputStream,FileOutputStream  
FileReader FileWriter File由操作系统管理需要手动调用close（）方法  
ByteArrayInputStream ,ByteArrayOutputStream 不需要手动调用close（）方法，内存由JVM管理，JVM负责释放  
###处理流
BufferedStream  缓冲流  
DataStream      处理原生数据类型   
ObjectStream    处理引用类型  
PrintStream     打印流 