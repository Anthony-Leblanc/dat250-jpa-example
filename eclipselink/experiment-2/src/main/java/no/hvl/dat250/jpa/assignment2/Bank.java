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
public class Bank {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @OneToMany(mappedBy = "owningBank")
  private Set<CreditCard> ownedCards;
}