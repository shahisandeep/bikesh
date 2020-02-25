package s3.january.session.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import s3.january.session.config.CurrentBalance;


@Profile("dev")
@Service
public class BalanceInquiryService implements CurrentBalance {

    public int getCurrentBalance() {
        return 200;
    }
}
