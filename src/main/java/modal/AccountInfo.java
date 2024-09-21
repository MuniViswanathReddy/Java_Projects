package modal;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@XmlRootElement
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountInfo {
    private String accountHolderName;
    private String accountType;
    private String phoneNo;
    private String bankName;
    private String balance;
}
