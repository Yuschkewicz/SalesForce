package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Account {
    String accountName,
            website,
            type,
            phone,
            fax,
            parentAccount,
            employees,
            industry,
            description,
            shippingStreet;


}
