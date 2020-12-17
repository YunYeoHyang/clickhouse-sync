package com.dingshudata.batch;

import com.dingshudata.entity.Application;
import com.dingshudata.entity.DateField;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.LinkedHashMap;

@StepScope
@Service
public class ApplicationProcessor implements ItemProcessor<Application, LinkedHashMap<String, Object>> {

    @Override
    public LinkedHashMap<String, Object> process(Application item) {
        BeanMap m = BeanMap.create(item);
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        for (Field field : Application.class.getDeclaredFields()) {
            String fieldName = field.getName();
            Object value = m.get(field.getName());
            Field[] fields = DateField.class.getDeclaredFields();
            if (value == null) {
                if (field.getType().equals(String.class)) {
                    if (Arrays.stream(fields).anyMatch(f -> field.getName().equals(f.getName()))) {
                        linkedHashMap.put(fieldName, LocalDate.parse("0001-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    } else {
                        linkedHashMap.put(fieldName, "");
                    }
                } else {
                    linkedHashMap.put(fieldName, 0);
                }
            } else {
                if (Arrays.stream(fields).anyMatch(f -> field.getName().equals(f.getName()))) {
                    if (value.equals("")) {
                        linkedHashMap.put(fieldName, LocalDate.parse("0001-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    } else {
                        linkedHashMap.put(fieldName, LocalDate.parse(value.toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    }
                } else {
                    linkedHashMap.put(fieldName, value);
                }
            }
        }

        System.out.println(linkedHashMap.toString());
        return linkedHashMap;
    }
}
