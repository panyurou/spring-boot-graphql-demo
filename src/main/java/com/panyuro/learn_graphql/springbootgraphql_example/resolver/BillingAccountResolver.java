package com.panyuro.learn_graphql.springbootgraphql_example.resolver;

import com.panyuro.learn_graphql.springbootgraphql_example.model.BillingAccount;
import com.panyuro.learn_graphql.springbootgraphql_example.model.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BillingAccountResolver implements GraphQLQueryResolver {
    public BillingAccount billingAccount(UUID id){
        log.info("receive billingAccount id is: "+ id);
        return BillingAccount.builder()
                .id(id)
                .currency(Currency.RMB)
                .name("张三")
                .build();
    }
}
