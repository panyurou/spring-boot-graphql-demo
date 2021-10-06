package com.panyuro.learn_graphql.springbootgraphql_example.mutations;

import com.panyuro.learn_graphql.springbootgraphql_example.model.BillingAccount;
import com.panyuro.learn_graphql.springbootgraphql_example.model.Currency;
import com.panyuro.learn_graphql.springbootgraphql_example.model.input.CreateBillingAccountInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BillingAccountMutation implements GraphQLMutationResolver {

  public BillingAccount createBillingAccount(CreateBillingAccountInput input){

    return BillingAccount.builder()
      .id(UUID.randomUUID())
      .currency(Currency.RMB)
      .name(input.getName())
      .build();
  }
}
