package lk.open.beanmaputils.example;

import java.util.stream.Stream;

import lk.open.beanmaputils.ConverterCommand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Example {
    private static final Logger LOGGER = LogManager.getLogger(Example.class);
    private static final String MAPPING_CLASS_NAME = "CONVERTER";

    public static void main(String[] args) {
        Contact contact = new Contact();
        InstallationContact installationContact = new InstallationContact();
        installationContact.setCommId("commIdTest");
        installationContact.setIdNumber("brnNumberTest");
        Stream.of(ContactEnum.values()).forEach(contactEnum -> {
            String setFieldName = contactEnum.name();
            String[] values = contactEnum.getValue().split(":");
            ConverterCommand.valueOf(MAPPING_CLASS_NAME)
                            .getMappingObject(contact, installationContact, values[1], setFieldName);
        });
        LOGGER.info(contact);
    }

}
