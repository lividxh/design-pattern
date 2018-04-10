package factory.bean;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author livid
 * @version $Id: ShapeFactoryTest.java, v 0.1 2018年04月10日 下午10:36 livid Exp $
 */
public class ShapeFactoryTest {


    ShapeFactory shapeFactory;

    @Before
    public void setUp() throws Exception {
        shapeFactory = new ShapeFactory();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getShape() throws Exception {
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();

        shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
    }


    @Test
    public void getShapeByClazz() throws Exception {

        Shape shape = shapeFactory.getShapeByClazz(Rectangle.class);
        shape.draw();

        shape = shapeFactory.getShapeByClazz(Circle.class);
        shape.draw();
    }

}