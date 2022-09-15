package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  private Set<CreditCard> creditCards;

  @ManyToMany
  private Set<Address> addresses;
}