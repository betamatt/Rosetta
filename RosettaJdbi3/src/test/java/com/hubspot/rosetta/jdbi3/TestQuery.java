package com.hubspot.rosetta.jdbi3;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonCreator;

public class TestQuery {
  private Set<String> names;

  @JsonCreator
  public TestQuery(Set<String> names) {
    this.names = names;
  }

  public Set<String> getNames() {
    return names;
  }
}
