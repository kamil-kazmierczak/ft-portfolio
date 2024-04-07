package ft.portfolio.api.user;

import ft.portfolio.api.portfolio.Portfolio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "USERS")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {

    @Id
    private String id;

    @Column
    private String externalId;

    @OneToMany(mappedBy = "user")
    private Set<Portfolio> portfolios;

}