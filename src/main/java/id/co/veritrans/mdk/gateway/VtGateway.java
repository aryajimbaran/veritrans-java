package id.co.veritrans.mdk.gateway;

import id.co.veritrans.mdk.gateway.model.VtResponse;

/**
 * Created by gde on 4/30/15.
 */
public interface VtGateway {

    /**
     * Approve a charge transaction which has <b>challenge</b> ChargeResult.
     * @param orderId
     * @return
     */
    VtResponse approve(String orderId);

    /**
     * Capture a previously authorized credit card charge request.
     * @param transactionId
     * @param amount
     * @return
     */
    VtResponse capture(String transactionId, Long amount);

    /**
     * Get the status of a transaction using the orderId from the charge request.
     * @param orderId
     * @return
     */
    VtResponse status(String orderId);

    VtResponse cancel(String orderId);
}
