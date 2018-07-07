// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/constraint_solver/search_limit.proto

package com.google.ortools.constraintsolver;

/**
 * <pre>
 * A search limit
 * The default values for int64 fields is the maxima value, i.e., 2^63-1
 * </pre>
 *
 * Protobuf type {@code operations_research.SearchLimitParameters}
 */
public  final class SearchLimitParameters extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:operations_research.SearchLimitParameters)
    SearchLimitParametersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchLimitParameters.newBuilder() to construct.
  private SearchLimitParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchLimitParameters() {
    time_ = 0L;
    branches_ = 0L;
    failures_ = 0L;
    solutions_ = 0L;
    smartTimeCheck_ = false;
    cumulative_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchLimitParameters(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            time_ = input.readInt64();
            break;
          }
          case 16: {

            branches_ = input.readInt64();
            break;
          }
          case 24: {

            failures_ = input.readInt64();
            break;
          }
          case 32: {

            solutions_ = input.readInt64();
            break;
          }
          case 40: {

            smartTimeCheck_ = input.readBool();
            break;
          }
          case 48: {

            cumulative_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ortools.constraintsolver.SearchLimitProtobuf.internal_static_operations_research_SearchLimitParameters_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ortools.constraintsolver.SearchLimitProtobuf.internal_static_operations_research_SearchLimitParameters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ortools.constraintsolver.SearchLimitParameters.class, com.google.ortools.constraintsolver.SearchLimitParameters.Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private long time_;
  /**
   * <code>int64 time = 1;</code>
   */
  public long getTime() {
    return time_;
  }

  public static final int BRANCHES_FIELD_NUMBER = 2;
  private long branches_;
  /**
   * <code>int64 branches = 2;</code>
   */
  public long getBranches() {
    return branches_;
  }

  public static final int FAILURES_FIELD_NUMBER = 3;
  private long failures_;
  /**
   * <code>int64 failures = 3;</code>
   */
  public long getFailures() {
    return failures_;
  }

  public static final int SOLUTIONS_FIELD_NUMBER = 4;
  private long solutions_;
  /**
   * <code>int64 solutions = 4;</code>
   */
  public long getSolutions() {
    return solutions_;
  }

  public static final int SMART_TIME_CHECK_FIELD_NUMBER = 5;
  private boolean smartTimeCheck_;
  /**
   * <code>bool smart_time_check = 5;</code>
   */
  public boolean getSmartTimeCheck() {
    return smartTimeCheck_;
  }

  public static final int CUMULATIVE_FIELD_NUMBER = 6;
  private boolean cumulative_;
  /**
   * <code>bool cumulative = 6;</code>
   */
  public boolean getCumulative() {
    return cumulative_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (time_ != 0L) {
      output.writeInt64(1, time_);
    }
    if (branches_ != 0L) {
      output.writeInt64(2, branches_);
    }
    if (failures_ != 0L) {
      output.writeInt64(3, failures_);
    }
    if (solutions_ != 0L) {
      output.writeInt64(4, solutions_);
    }
    if (smartTimeCheck_ != false) {
      output.writeBool(5, smartTimeCheck_);
    }
    if (cumulative_ != false) {
      output.writeBool(6, cumulative_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (time_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, time_);
    }
    if (branches_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, branches_);
    }
    if (failures_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, failures_);
    }
    if (solutions_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, solutions_);
    }
    if (smartTimeCheck_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, smartTimeCheck_);
    }
    if (cumulative_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, cumulative_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ortools.constraintsolver.SearchLimitParameters)) {
      return super.equals(obj);
    }
    com.google.ortools.constraintsolver.SearchLimitParameters other = (com.google.ortools.constraintsolver.SearchLimitParameters) obj;

    boolean result = true;
    result = result && (getTime()
        == other.getTime());
    result = result && (getBranches()
        == other.getBranches());
    result = result && (getFailures()
        == other.getFailures());
    result = result && (getSolutions()
        == other.getSolutions());
    result = result && (getSmartTimeCheck()
        == other.getSmartTimeCheck());
    result = result && (getCumulative()
        == other.getCumulative());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTime());
    hash = (37 * hash) + BRANCHES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBranches());
    hash = (37 * hash) + FAILURES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFailures());
    hash = (37 * hash) + SOLUTIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSolutions());
    hash = (37 * hash) + SMART_TIME_CHECK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSmartTimeCheck());
    hash = (37 * hash) + CUMULATIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCumulative());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ortools.constraintsolver.SearchLimitParameters parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.SearchLimitParameters parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.SearchLimitParameters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.SearchLimitParameters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.SearchLimitParameters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ortools.constraintsolver.SearchLimitParameters parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.SearchLimitParameters parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.SearchLimitParameters parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.SearchLimitParameters parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.SearchLimitParameters parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ortools.constraintsolver.SearchLimitParameters parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ortools.constraintsolver.SearchLimitParameters parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ortools.constraintsolver.SearchLimitParameters prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A search limit
   * The default values for int64 fields is the maxima value, i.e., 2^63-1
   * </pre>
   *
   * Protobuf type {@code operations_research.SearchLimitParameters}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:operations_research.SearchLimitParameters)
      com.google.ortools.constraintsolver.SearchLimitParametersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ortools.constraintsolver.SearchLimitProtobuf.internal_static_operations_research_SearchLimitParameters_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ortools.constraintsolver.SearchLimitProtobuf.internal_static_operations_research_SearchLimitParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ortools.constraintsolver.SearchLimitParameters.class, com.google.ortools.constraintsolver.SearchLimitParameters.Builder.class);
    }

    // Construct using com.google.ortools.constraintsolver.SearchLimitParameters.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      time_ = 0L;

      branches_ = 0L;

      failures_ = 0L;

      solutions_ = 0L;

      smartTimeCheck_ = false;

      cumulative_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ortools.constraintsolver.SearchLimitProtobuf.internal_static_operations_research_SearchLimitParameters_descriptor;
    }

    public com.google.ortools.constraintsolver.SearchLimitParameters getDefaultInstanceForType() {
      return com.google.ortools.constraintsolver.SearchLimitParameters.getDefaultInstance();
    }

    public com.google.ortools.constraintsolver.SearchLimitParameters build() {
      com.google.ortools.constraintsolver.SearchLimitParameters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.ortools.constraintsolver.SearchLimitParameters buildPartial() {
      com.google.ortools.constraintsolver.SearchLimitParameters result = new com.google.ortools.constraintsolver.SearchLimitParameters(this);
      result.time_ = time_;
      result.branches_ = branches_;
      result.failures_ = failures_;
      result.solutions_ = solutions_;
      result.smartTimeCheck_ = smartTimeCheck_;
      result.cumulative_ = cumulative_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ortools.constraintsolver.SearchLimitParameters) {
        return mergeFrom((com.google.ortools.constraintsolver.SearchLimitParameters)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ortools.constraintsolver.SearchLimitParameters other) {
      if (other == com.google.ortools.constraintsolver.SearchLimitParameters.getDefaultInstance()) return this;
      if (other.getTime() != 0L) {
        setTime(other.getTime());
      }
      if (other.getBranches() != 0L) {
        setBranches(other.getBranches());
      }
      if (other.getFailures() != 0L) {
        setFailures(other.getFailures());
      }
      if (other.getSolutions() != 0L) {
        setSolutions(other.getSolutions());
      }
      if (other.getSmartTimeCheck() != false) {
        setSmartTimeCheck(other.getSmartTimeCheck());
      }
      if (other.getCumulative() != false) {
        setCumulative(other.getCumulative());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ortools.constraintsolver.SearchLimitParameters parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ortools.constraintsolver.SearchLimitParameters) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long time_ ;
    /**
     * <code>int64 time = 1;</code>
     */
    public long getTime() {
      return time_;
    }
    /**
     * <code>int64 time = 1;</code>
     */
    public Builder setTime(long value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 time = 1;</code>
     */
    public Builder clearTime() {
      
      time_ = 0L;
      onChanged();
      return this;
    }

    private long branches_ ;
    /**
     * <code>int64 branches = 2;</code>
     */
    public long getBranches() {
      return branches_;
    }
    /**
     * <code>int64 branches = 2;</code>
     */
    public Builder setBranches(long value) {
      
      branches_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 branches = 2;</code>
     */
    public Builder clearBranches() {
      
      branches_ = 0L;
      onChanged();
      return this;
    }

    private long failures_ ;
    /**
     * <code>int64 failures = 3;</code>
     */
    public long getFailures() {
      return failures_;
    }
    /**
     * <code>int64 failures = 3;</code>
     */
    public Builder setFailures(long value) {
      
      failures_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 failures = 3;</code>
     */
    public Builder clearFailures() {
      
      failures_ = 0L;
      onChanged();
      return this;
    }

    private long solutions_ ;
    /**
     * <code>int64 solutions = 4;</code>
     */
    public long getSolutions() {
      return solutions_;
    }
    /**
     * <code>int64 solutions = 4;</code>
     */
    public Builder setSolutions(long value) {
      
      solutions_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 solutions = 4;</code>
     */
    public Builder clearSolutions() {
      
      solutions_ = 0L;
      onChanged();
      return this;
    }

    private boolean smartTimeCheck_ ;
    /**
     * <code>bool smart_time_check = 5;</code>
     */
    public boolean getSmartTimeCheck() {
      return smartTimeCheck_;
    }
    /**
     * <code>bool smart_time_check = 5;</code>
     */
    public Builder setSmartTimeCheck(boolean value) {
      
      smartTimeCheck_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool smart_time_check = 5;</code>
     */
    public Builder clearSmartTimeCheck() {
      
      smartTimeCheck_ = false;
      onChanged();
      return this;
    }

    private boolean cumulative_ ;
    /**
     * <code>bool cumulative = 6;</code>
     */
    public boolean getCumulative() {
      return cumulative_;
    }
    /**
     * <code>bool cumulative = 6;</code>
     */
    public Builder setCumulative(boolean value) {
      
      cumulative_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool cumulative = 6;</code>
     */
    public Builder clearCumulative() {
      
      cumulative_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:operations_research.SearchLimitParameters)
  }

  // @@protoc_insertion_point(class_scope:operations_research.SearchLimitParameters)
  private static final com.google.ortools.constraintsolver.SearchLimitParameters DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ortools.constraintsolver.SearchLimitParameters();
  }

  public static com.google.ortools.constraintsolver.SearchLimitParameters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchLimitParameters>
      PARSER = new com.google.protobuf.AbstractParser<SearchLimitParameters>() {
    public SearchLimitParameters parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchLimitParameters(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchLimitParameters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchLimitParameters> getParserForType() {
    return PARSER;
  }

  public com.google.ortools.constraintsolver.SearchLimitParameters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

