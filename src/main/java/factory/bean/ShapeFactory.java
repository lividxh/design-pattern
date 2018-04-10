package factory.bean;

import java.lang.reflect.InvocationTargetException;

/**
 * @author livid
 * @version $Id: ShapeFactory.java, v 0.1 2018年04月10日 下午10:31 livid Exp $
 */
public class ShapeFactory {


    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }

    public Shape getShapeByClazz(Class<? extends Shape> clazz) {
        try {
            // 这里通过静态方法获取Class return Class.forName(clazz.getName()).newInstance();
            // 这里通过反射获取
            return clazz.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
