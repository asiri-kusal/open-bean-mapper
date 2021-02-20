package lk.open.beanmaputils;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

import com.google.common.base.CaseFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Converter {

    private final static Logger LOGGER = LogManager.getLogger(Converter.class);


    public static void callSetter(Object obj, String setFieldName, Object value) {
        String field = upperUnderscoreToUpperCamel(setFieldName);
        PropertyDescriptor pd;
        try {
            pd = new PropertyDescriptor(field, obj.getClass());
            pd.getWriteMethod().invoke(obj, value);
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            LOGGER.error("Mapping callSetter Method ", e);
        }
    }

    public static String upperUnderscoreToUpperCamel(String value) {
        String to = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, value);
        to = to.substring(0, 1).toLowerCase() + to.substring(1);
        return to;
    }

    public static Object callGetter(Object obj, String getFieldName) {
        PropertyDescriptor pd;
        try {
            pd = new PropertyDescriptor(getFieldName, obj.getClass());
            return pd.getReadMethod().invoke(obj);
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            LOGGER.error("Mapping callGetter Method ", e);
        }
        return null;
    }
}
