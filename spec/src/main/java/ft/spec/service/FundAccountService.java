package ft.spec.service;

import ft.spec.model.FundAccount;

import java.io.Serializable;

/**
 * TODO
 */
public interface FundAccountService extends Serializable {

    /**
     * Create new fund account
     * @param subject The operator
     * @param account FundAccount
     * @return
     */
    Result create(String subject, FundAccount account);

    /**
     * Fund account service result code
     */
    interface Code extends Result.Code {
        // TODO
    }
}
