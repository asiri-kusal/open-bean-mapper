package lk.open.beanmaputils;

public enum ConverterCommand {

    CONVERTER {
        public Object getMappingObject(Object object, Object builder, String getFieldName, String setFieldName) {
            Converter.callSetter(object, setFieldName, Converter.callGetter(builder, getFieldName));
            return object;
        }
    };
    public abstract Object getMappingObject(Object object, Object builder, String getFieldName, String setFieldName);

}
