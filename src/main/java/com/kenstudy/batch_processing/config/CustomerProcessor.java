package com.kenstudy.batch_processing.config;

import com.kenstudy.batch_processing.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {


    @Override
    public Customer process(Customer item) throws Exception {
        if(item.getCountry().equals("United States")){
            return item;
        }else{
            return null;
        }

    }
}
