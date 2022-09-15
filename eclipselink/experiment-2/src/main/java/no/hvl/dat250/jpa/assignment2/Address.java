package no.hvl.dat250.jpa.assignment2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String street;
  private int number;

  @ManyToMany(mappedBy = "addresses")
  private Set<Person> owners = new HashSet<>();
}