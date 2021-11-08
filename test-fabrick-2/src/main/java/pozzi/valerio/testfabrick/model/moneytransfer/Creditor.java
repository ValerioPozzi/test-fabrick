package pozzi.valerio.testfabrick.model.moneytransfer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Valid
public class Creditor {

    @NotNull
    private String name;
    @Valid
    @NotNull
    private Account account;
    private Address address;

}
