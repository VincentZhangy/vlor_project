package top.vlor.Iterator;

import top.vlor.Iterator.impl.ConcreteIterator;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:15 2018/6/19
 * @Modified by：
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] objArray = null;

    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * 取值方法：向外界提供聚集元素
     */
    public Object getElement(int index){

        if(index < objArray.length){
            return objArray[index];
        }else{
            return null;
        }
    }
    /**
     * 取值方法：向外界提供聚集的大小
     */
    public int size(){
        return objArray.length;
    }
}
