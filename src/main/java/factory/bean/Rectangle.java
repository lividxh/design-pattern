package factory.bean;

import java.lang.reflect.Field;

/**
 * @author livid
 * @version $Id: Rectangle.java, v 0.1 2018年04月10日 下午10:25 livid Exp $
 */
public class Rectangle implements Shape {


    public void draw() {
        Class clazz = this.getClass();
        System.out.println("This is " + clazz.getName() + "::draw()");
    }
}
