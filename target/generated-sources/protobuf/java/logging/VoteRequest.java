// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logging.proto

package logging;

/**
 * <pre>
 * --- RequestVote RPC ---
 * </pre>
 *
 * Protobuf type {@code logging.VoteRequest}
 */
public final class VoteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:logging.VoteRequest)
    VoteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VoteRequest.newBuilder() to construct.
  private VoteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VoteRequest() {
    candidateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VoteRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return logging.LoggingProto.internal_static_logging_VoteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return logging.LoggingProto.internal_static_logging_VoteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            logging.VoteRequest.class, logging.VoteRequest.Builder.class);
  }

  public static final int TERM_FIELD_NUMBER = 1;
  private int term_ = 0;
  /**
   * <code>int32 term = 1;</code>
   * @return The term.
   */
  @java.lang.Override
  public int getTerm() {
    return term_;
  }

  public static final int CANDIDATEID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object candidateId_ = "";
  /**
   * <code>string candidateId = 2;</code>
   * @return The candidateId.
   */
  @java.lang.Override
  public java.lang.String getCandidateId() {
    java.lang.Object ref = candidateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      candidateId_ = s;
      return s;
    }
  }
  /**
   * <code>string candidateId = 2;</code>
   * @return The bytes for candidateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCandidateIdBytes() {
    java.lang.Object ref = candidateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      candidateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LASTLOGINDEX_FIELD_NUMBER = 3;
  private int lastLogIndex_ = 0;
  /**
   * <code>int32 lastLogIndex = 3;</code>
   * @return The lastLogIndex.
   */
  @java.lang.Override
  public int getLastLogIndex() {
    return lastLogIndex_;
  }

  public static final int LASTLOGTERM_FIELD_NUMBER = 4;
  private int lastLogTerm_ = 0;
  /**
   * <code>int32 lastLogTerm = 4;</code>
   * @return The lastLogTerm.
   */
  @java.lang.Override
  public int getLastLogTerm() {
    return lastLogTerm_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (term_ != 0) {
      output.writeInt32(1, term_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(candidateId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, candidateId_);
    }
    if (lastLogIndex_ != 0) {
      output.writeInt32(3, lastLogIndex_);
    }
    if (lastLogTerm_ != 0) {
      output.writeInt32(4, lastLogTerm_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (term_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, term_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(candidateId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, candidateId_);
    }
    if (lastLogIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, lastLogIndex_);
    }
    if (lastLogTerm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, lastLogTerm_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof logging.VoteRequest)) {
      return super.equals(obj);
    }
    logging.VoteRequest other = (logging.VoteRequest) obj;

    if (getTerm()
        != other.getTerm()) return false;
    if (!getCandidateId()
        .equals(other.getCandidateId())) return false;
    if (getLastLogIndex()
        != other.getLastLogIndex()) return false;
    if (getLastLogTerm()
        != other.getLastLogTerm()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + getTerm();
    hash = (37 * hash) + CANDIDATEID_FIELD_NUMBER;
    hash = (53 * hash) + getCandidateId().hashCode();
    hash = (37 * hash) + LASTLOGINDEX_FIELD_NUMBER;
    hash = (53 * hash) + getLastLogIndex();
    hash = (37 * hash) + LASTLOGTERM_FIELD_NUMBER;
    hash = (53 * hash) + getLastLogTerm();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static logging.VoteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static logging.VoteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static logging.VoteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static logging.VoteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static logging.VoteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static logging.VoteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static logging.VoteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static logging.VoteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static logging.VoteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static logging.VoteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static logging.VoteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static logging.VoteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(logging.VoteRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * --- RequestVote RPC ---
   * </pre>
   *
   * Protobuf type {@code logging.VoteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:logging.VoteRequest)
      logging.VoteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return logging.LoggingProto.internal_static_logging_VoteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return logging.LoggingProto.internal_static_logging_VoteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              logging.VoteRequest.class, logging.VoteRequest.Builder.class);
    }

    // Construct using logging.VoteRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      term_ = 0;
      candidateId_ = "";
      lastLogIndex_ = 0;
      lastLogTerm_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return logging.LoggingProto.internal_static_logging_VoteRequest_descriptor;
    }

    @java.lang.Override
    public logging.VoteRequest getDefaultInstanceForType() {
      return logging.VoteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public logging.VoteRequest build() {
      logging.VoteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public logging.VoteRequest buildPartial() {
      logging.VoteRequest result = new logging.VoteRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(logging.VoteRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.term_ = term_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.candidateId_ = candidateId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lastLogIndex_ = lastLogIndex_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.lastLogTerm_ = lastLogTerm_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof logging.VoteRequest) {
        return mergeFrom((logging.VoteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(logging.VoteRequest other) {
      if (other == logging.VoteRequest.getDefaultInstance()) return this;
      if (other.getTerm() != 0) {
        setTerm(other.getTerm());
      }
      if (!other.getCandidateId().isEmpty()) {
        candidateId_ = other.candidateId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getLastLogIndex() != 0) {
        setLastLogIndex(other.getLastLogIndex());
      }
      if (other.getLastLogTerm() != 0) {
        setLastLogTerm(other.getLastLogTerm());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              term_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              candidateId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              lastLogIndex_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              lastLogTerm_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int term_ ;
    /**
     * <code>int32 term = 1;</code>
     * @return The term.
     */
    @java.lang.Override
    public int getTerm() {
      return term_;
    }
    /**
     * <code>int32 term = 1;</code>
     * @param value The term to set.
     * @return This builder for chaining.
     */
    public Builder setTerm(int value) {
      
      term_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 term = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTerm() {
      bitField0_ = (bitField0_ & ~0x00000001);
      term_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object candidateId_ = "";
    /**
     * <code>string candidateId = 2;</code>
     * @return The candidateId.
     */
    public java.lang.String getCandidateId() {
      java.lang.Object ref = candidateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        candidateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string candidateId = 2;</code>
     * @return The bytes for candidateId.
     */
    public com.google.protobuf.ByteString
        getCandidateIdBytes() {
      java.lang.Object ref = candidateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        candidateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string candidateId = 2;</code>
     * @param value The candidateId to set.
     * @return This builder for chaining.
     */
    public Builder setCandidateId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      candidateId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string candidateId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCandidateId() {
      candidateId_ = getDefaultInstance().getCandidateId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string candidateId = 2;</code>
     * @param value The bytes for candidateId to set.
     * @return This builder for chaining.
     */
    public Builder setCandidateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      candidateId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int lastLogIndex_ ;
    /**
     * <code>int32 lastLogIndex = 3;</code>
     * @return The lastLogIndex.
     */
    @java.lang.Override
    public int getLastLogIndex() {
      return lastLogIndex_;
    }
    /**
     * <code>int32 lastLogIndex = 3;</code>
     * @param value The lastLogIndex to set.
     * @return This builder for chaining.
     */
    public Builder setLastLogIndex(int value) {
      
      lastLogIndex_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 lastLogIndex = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastLogIndex() {
      bitField0_ = (bitField0_ & ~0x00000004);
      lastLogIndex_ = 0;
      onChanged();
      return this;
    }

    private int lastLogTerm_ ;
    /**
     * <code>int32 lastLogTerm = 4;</code>
     * @return The lastLogTerm.
     */
    @java.lang.Override
    public int getLastLogTerm() {
      return lastLogTerm_;
    }
    /**
     * <code>int32 lastLogTerm = 4;</code>
     * @param value The lastLogTerm to set.
     * @return This builder for chaining.
     */
    public Builder setLastLogTerm(int value) {
      
      lastLogTerm_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 lastLogTerm = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastLogTerm() {
      bitField0_ = (bitField0_ & ~0x00000008);
      lastLogTerm_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:logging.VoteRequest)
  }

  // @@protoc_insertion_point(class_scope:logging.VoteRequest)
  private static final logging.VoteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new logging.VoteRequest();
  }

  public static logging.VoteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoteRequest>
      PARSER = new com.google.protobuf.AbstractParser<VoteRequest>() {
    @java.lang.Override
    public VoteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<VoteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public logging.VoteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

