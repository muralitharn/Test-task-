package softsuave.AdsCost.entity;

import jakarta.persistence.*;
import lombok.*;
import softsuave.AdsCost.enums.AdsType;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ads_Cost_Tabel")
public class AdsCostTabel {

    @Id
    @Column(nullable = true)
    private int id;

    @Column(nullable = true)
    private long cost;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private AdsType type;


}
