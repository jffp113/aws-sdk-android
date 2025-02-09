/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the DescribeThingType operation.
 * </p>
 */
public class DescribeThingTypeResult implements Serializable {
    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingTypeName;

    /**
     * <p>
     * The thing type ID.
     * </p>
     */
    private String thingTypeId;

    /**
     * <p>
     * The thing type ARN.
     * </p>
     */
    private String thingTypeArn;

    /**
     * <p>
     * The ThingTypeProperties contains information about the thing type
     * including description, and a list of searchable thing attribute names.
     * </p>
     */
    private ThingTypeProperties thingTypeProperties;

    /**
     * <p>
     * The ThingTypeMetadata contains additional information about the thing
     * type including: creation date and time, a value indicating whether the
     * thing type is deprecated, and a date and time when it was deprecated.
     * </p>
     */
    private ThingTypeMetadata thingTypeMetadata;

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing type.
     *         </p>
     */
    public String getThingTypeName() {
        return thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The name of the thing type.
     *            </p>
     */
    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The name of the thing type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingTypeResult withThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
        return this;
    }

    /**
     * <p>
     * The thing type ID.
     * </p>
     *
     * @return <p>
     *         The thing type ID.
     *         </p>
     */
    public String getThingTypeId() {
        return thingTypeId;
    }

    /**
     * <p>
     * The thing type ID.
     * </p>
     *
     * @param thingTypeId <p>
     *            The thing type ID.
     *            </p>
     */
    public void setThingTypeId(String thingTypeId) {
        this.thingTypeId = thingTypeId;
    }

    /**
     * <p>
     * The thing type ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingTypeId <p>
     *            The thing type ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingTypeResult withThingTypeId(String thingTypeId) {
        this.thingTypeId = thingTypeId;
        return this;
    }

    /**
     * <p>
     * The thing type ARN.
     * </p>
     *
     * @return <p>
     *         The thing type ARN.
     *         </p>
     */
    public String getThingTypeArn() {
        return thingTypeArn;
    }

    /**
     * <p>
     * The thing type ARN.
     * </p>
     *
     * @param thingTypeArn <p>
     *            The thing type ARN.
     *            </p>
     */
    public void setThingTypeArn(String thingTypeArn) {
        this.thingTypeArn = thingTypeArn;
    }

    /**
     * <p>
     * The thing type ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingTypeArn <p>
     *            The thing type ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingTypeResult withThingTypeArn(String thingTypeArn) {
        this.thingTypeArn = thingTypeArn;
        return this;
    }

    /**
     * <p>
     * The ThingTypeProperties contains information about the thing type
     * including description, and a list of searchable thing attribute names.
     * </p>
     *
     * @return <p>
     *         The ThingTypeProperties contains information about the thing type
     *         including description, and a list of searchable thing attribute
     *         names.
     *         </p>
     */
    public ThingTypeProperties getThingTypeProperties() {
        return thingTypeProperties;
    }

    /**
     * <p>
     * The ThingTypeProperties contains information about the thing type
     * including description, and a list of searchable thing attribute names.
     * </p>
     *
     * @param thingTypeProperties <p>
     *            The ThingTypeProperties contains information about the thing
     *            type including description, and a list of searchable thing
     *            attribute names.
     *            </p>
     */
    public void setThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        this.thingTypeProperties = thingTypeProperties;
    }

    /**
     * <p>
     * The ThingTypeProperties contains information about the thing type
     * including description, and a list of searchable thing attribute names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingTypeProperties <p>
     *            The ThingTypeProperties contains information about the thing
     *            type including description, and a list of searchable thing
     *            attribute names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingTypeResult withThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        this.thingTypeProperties = thingTypeProperties;
        return this;
    }

    /**
     * <p>
     * The ThingTypeMetadata contains additional information about the thing
     * type including: creation date and time, a value indicating whether the
     * thing type is deprecated, and a date and time when it was deprecated.
     * </p>
     *
     * @return <p>
     *         The ThingTypeMetadata contains additional information about the
     *         thing type including: creation date and time, a value indicating
     *         whether the thing type is deprecated, and a date and time when it
     *         was deprecated.
     *         </p>
     */
    public ThingTypeMetadata getThingTypeMetadata() {
        return thingTypeMetadata;
    }

    /**
     * <p>
     * The ThingTypeMetadata contains additional information about the thing
     * type including: creation date and time, a value indicating whether the
     * thing type is deprecated, and a date and time when it was deprecated.
     * </p>
     *
     * @param thingTypeMetadata <p>
     *            The ThingTypeMetadata contains additional information about
     *            the thing type including: creation date and time, a value
     *            indicating whether the thing type is deprecated, and a date
     *            and time when it was deprecated.
     *            </p>
     */
    public void setThingTypeMetadata(ThingTypeMetadata thingTypeMetadata) {
        this.thingTypeMetadata = thingTypeMetadata;
    }

    /**
     * <p>
     * The ThingTypeMetadata contains additional information about the thing
     * type including: creation date and time, a value indicating whether the
     * thing type is deprecated, and a date and time when it was deprecated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingTypeMetadata <p>
     *            The ThingTypeMetadata contains additional information about
     *            the thing type including: creation date and time, a value
     *            indicating whether the thing type is deprecated, and a date
     *            and time when it was deprecated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingTypeResult withThingTypeMetadata(ThingTypeMetadata thingTypeMetadata) {
        this.thingTypeMetadata = thingTypeMetadata;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getThingTypeName() != null)
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        if (getThingTypeId() != null)
            sb.append("thingTypeId: " + getThingTypeId() + ",");
        if (getThingTypeArn() != null)
            sb.append("thingTypeArn: " + getThingTypeArn() + ",");
        if (getThingTypeProperties() != null)
            sb.append("thingTypeProperties: " + getThingTypeProperties() + ",");
        if (getThingTypeMetadata() != null)
            sb.append("thingTypeMetadata: " + getThingTypeMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeId() == null) ? 0 : getThingTypeId().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeArn() == null) ? 0 : getThingTypeArn().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeProperties() == null) ? 0 : getThingTypeProperties().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeMetadata() == null) ? 0 : getThingTypeMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThingTypeResult == false)
            return false;
        DescribeThingTypeResult other = (DescribeThingTypeResult) obj;

        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null
                && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getThingTypeId() == null ^ this.getThingTypeId() == null)
            return false;
        if (other.getThingTypeId() != null
                && other.getThingTypeId().equals(this.getThingTypeId()) == false)
            return false;
        if (other.getThingTypeArn() == null ^ this.getThingTypeArn() == null)
            return false;
        if (other.getThingTypeArn() != null
                && other.getThingTypeArn().equals(this.getThingTypeArn()) == false)
            return false;
        if (other.getThingTypeProperties() == null ^ this.getThingTypeProperties() == null)
            return false;
        if (other.getThingTypeProperties() != null
                && other.getThingTypeProperties().equals(this.getThingTypeProperties()) == false)
            return false;
        if (other.getThingTypeMetadata() == null ^ this.getThingTypeMetadata() == null)
            return false;
        if (other.getThingTypeMetadata() != null
                && other.getThingTypeMetadata().equals(this.getThingTypeMetadata()) == false)
            return false;
        return true;
    }
}
