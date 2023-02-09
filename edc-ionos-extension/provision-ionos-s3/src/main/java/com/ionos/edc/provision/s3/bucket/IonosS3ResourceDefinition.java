/*
 *  Copyright (c) 2022 IONOS
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *      IONOS
 *
 */

package com.ionos.edc.provision.s3.bucket;

import org.eclipse.edc.connector.transfer.spi.types.ResourceDefinition;

import java.util.function.Supplier;

public class IonosS3ResourceDefinition extends ResourceDefinition {
    private String storage;
    private String bucketName;
    private Supplier<Boolean> checker;

    public IonosS3ResourceDefinition() {
        super();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getbucketName() {
        return bucketName;
    }

    public void setbucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public Builder toBuilder() {
        return initializeBuilder(new Builder()).storage(storage).bucketName(bucketName);
    }

    public static class Builder extends ResourceDefinition.Builder<IonosS3ResourceDefinition, Builder> {

        private Builder() {
            super(new IonosS3ResourceDefinition());
        }

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder storage(String storage) {
            resourceDefinition.storage = storage;
            return this;
        }

        public Builder bucketName(String bucketName) {
            resourceDefinition.bucketName = bucketName;
            return this;
        }

        @Override
        protected void verify() {
            super.verify();

        }
    }

}
