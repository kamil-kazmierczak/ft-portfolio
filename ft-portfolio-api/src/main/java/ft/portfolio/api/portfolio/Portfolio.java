package ft.portfolio.api.portfolio;

import ft.portfolio.api.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PORTFOLIO")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Portfolio {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column
    private String symbol;

    @Column
    private LocalDate dateOfBuy;

    @Column
    private BigDecimal price;

    @Column
    private Double amount;


}