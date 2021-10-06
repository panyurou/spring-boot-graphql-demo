package com.panyuro.learn_graphql.springbootgraphql_example.model;

import lombok.*;

import java.util.UUID;

@Builder
@Value
public class BillingAccount {
    UUID id;
    String name;
    Currency currency;
}
