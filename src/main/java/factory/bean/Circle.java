package factory.bean;

/**
 * @author livid
 * @version $Id: Circle.java, v 0.1 2018年04月10日 下午10:31 livid Exp $
 */
public class Circle implements Shape {

    public void draw() {
        Class clazz = this.getClass();
        System.out.println("This is " + clazz.getName() + "::draw()");
    }
}
