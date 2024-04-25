package com.robertomessabrasil.test01.usecase;

import com.robertomessabrasil.test01.adapter.inbound.ICustomerInputAdapter;
import com.robertomessabrasil.test01.adapter.outbound.ICustomerOutputAdapter;
import com.robertomessabrasil.test01.entity.CustomerEntity;

public class CreateCustomerUseCase  {

    public void createCustomer(ICustomerInputAdapter customerInputAdapter, ICustomerOutputAdapter customerOutputAdapter) {

        CustomerEntity customerEntity = new CustomerEntity()
                .createCustomer(customerInputAdapter.getName());

        customerOutputAdapter.setName(customerEntity.getName());

    }

}
