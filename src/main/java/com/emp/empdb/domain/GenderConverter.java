package com.emp.empdb.domain;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply=true)
public class GenderConverter implements AttributeConverter<Gender,String> {

    @Override
    public String convertToDatabaseColumn(Gender gender) {
        switch (gender){
            case MALE:
                return "M";

            case FEMALE:
                return "F";
            default: throw new IllegalArgumentException("Gender "+gender+" not supported");
        }
    }

    @Override
    public Gender convertToEntityAttribute(String s) {
        switch (s){
            case "M":
                return Gender.MALE;
            case "F":
                return Gender.FEMALE;
            default:
                throw new IllegalArgumentException("Gender "+s+" is not supported");
        }
    }
}
