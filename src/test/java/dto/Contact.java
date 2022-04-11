package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Contact {

    String salutation,
            firstName,
            middleName,
            lastName,
            suffix,
            accountName,
            title,
            Department,
            email,
            fax,
            phone,
            mobile;


}
