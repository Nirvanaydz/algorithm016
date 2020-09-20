##hashmap说明
    extends AbstractMap<K,V>
    implements Map<K,V>, Cloneable
###1、实现map接口中的主要方法：
    对于集合大小的判断，size  isempty
    判断是否包含一个key或者value，使用contains
    获取集合中的keyset
    获取集合中的values
    通过get方法获取某一个key对应的value
    put和remove操作某一个key来改变或者删除一个元素
    entryset Holds cached entrySet(). Note that AbstractMap fields are used
        for keySet() and values().
###2、一些主要的内部静态类  
    主要继承或者实现了set接口，操作其中的元素      