/**
 * This file is part of Project Control Center (PCC).
 * 
 * PCC (Project Control Center) project is intellectual property of 
 * Dmitri Anatol'evich Pisarenko.
 * 
 * Copyright 2010, 2011 Dmitri Anatol'evich Pisarenko
 * All rights reserved
 *
 **/

package co.altruix.pcc.impl.cdm;

import co.altruix.pcc.api.cdm.PccMessage;

/**
 * @author DP118M
 * 
 */
public final class DefaultImmediateSchedulingRequest implements
        PccMessage {
    private static final long serialVersionUID = 1L;
    private Long userId;

    public void setUserId(final Long aId) {
        this.userId = aId;
    }

    public Long getUserId() {
        return this.userId;
    }

}
