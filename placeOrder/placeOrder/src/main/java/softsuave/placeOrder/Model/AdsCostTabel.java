package softsuave.placeOrder.Model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;
import softsuave.placeOrder.enums.AdsType;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class AdsCostTabel {

    private int id;

    private long cost;

    @Enumerated(EnumType.STRING)
    private AdsType type;


}
