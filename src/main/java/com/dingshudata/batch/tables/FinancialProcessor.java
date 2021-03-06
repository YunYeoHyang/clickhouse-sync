package com.dingshudata.batch.tables;

import com.dingshudata.entity.Application;
import com.dingshudata.entity.tables.Financial;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

@StepScope
@Service
public class FinancialProcessor implements ItemProcessor<Financial, LinkedHashMap<String, Object>> {

    @Override
    public LinkedHashMap<String, Object> process(Financial item) {
        BeanMap m = BeanMap.create(item);
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        for (Field field : Application.class.getDeclaredFields()) {
            String fieldName = field.getName();
            Object value = m.get(field.getName());
            if (value == null) {
                if (field.getType().equals(Integer.class) || field.getType().equals(Double.class)) {
                    linkedHashMap.put(fieldName, 0);
                } else {
                    linkedHashMap.put(fieldName, "");
                }
            } else {
                linkedHashMap.put(fieldName, value);
            }
        }
        return linkedHashMap;
    }
}
