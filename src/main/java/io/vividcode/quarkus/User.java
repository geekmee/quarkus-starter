package io.vividcode.quarkus;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
  private String id;
  private String name;
  private String email;

  public User() {
    this.id = UUID.randomUUID().toString();
  }

  public User(String name, String email) {
    this();
    this.name = name;
    this.email = email;
  }

  @Id
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
