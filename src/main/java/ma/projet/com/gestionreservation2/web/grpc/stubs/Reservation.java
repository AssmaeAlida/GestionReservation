// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package ma.projet.com.gestionreservation2.web.grpc.stubs;

/**
 * Protobuf type {@code Reservation}
 */
public  final class Reservation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Reservation)
    ReservationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Reservation.newBuilder() to construct.
  private Reservation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Reservation() {
    customerName_ = "";
    startDate_ = "";
    endDate_ = "";
    roomPreference_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Reservation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Reservation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            customerName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            startDate_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            endDate_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            roomPreference_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return ma.projet.com.gestionreservation2.web.grpc.stubs.ReservationOuterClass.internal_static_Reservation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.projet.com.gestionreservation2.web.grpc.stubs.ReservationOuterClass.internal_static_Reservation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation.class, ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  public long getId() {
    return id_;
  }

  public static final int CUSTOMERNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object customerName_;
  /**
   * <code>string customerName = 2;</code>
   * @return The customerName.
   */
  public java.lang.String getCustomerName() {
    java.lang.Object ref = customerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerName_ = s;
      return s;
    }
  }
  /**
   * <code>string customerName = 2;</code>
   * @return The bytes for customerName.
   */
  public com.google.protobuf.ByteString
      getCustomerNameBytes() {
    java.lang.Object ref = customerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTDATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object startDate_;
  /**
   * <code>string startDate = 3;</code>
   * @return The startDate.
   */
  public java.lang.String getStartDate() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startDate_ = s;
      return s;
    }
  }
  /**
   * <code>string startDate = 3;</code>
   * @return The bytes for startDate.
   */
  public com.google.protobuf.ByteString
      getStartDateBytes() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDDATE_FIELD_NUMBER = 4;
  private volatile java.lang.Object endDate_;
  /**
   * <code>string endDate = 4;</code>
   * @return The endDate.
   */
  public java.lang.String getEndDate() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endDate_ = s;
      return s;
    }
  }
  /**
   * <code>string endDate = 4;</code>
   * @return The bytes for endDate.
   */
  public com.google.protobuf.ByteString
      getEndDateBytes() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROOMPREFERENCE_FIELD_NUMBER = 5;
  private volatile java.lang.Object roomPreference_;
  /**
   * <code>string roomPreference = 5;</code>
   * @return The roomPreference.
   */
  public java.lang.String getRoomPreference() {
    java.lang.Object ref = roomPreference_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roomPreference_ = s;
      return s;
    }
  }
  /**
   * <code>string roomPreference = 5;</code>
   * @return The bytes for roomPreference.
   */
  public com.google.protobuf.ByteString
      getRoomPreferenceBytes() {
    java.lang.Object ref = roomPreference_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roomPreference_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getCustomerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, customerName_);
    }
    if (!getStartDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, startDate_);
    }
    if (!getEndDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, endDate_);
    }
    if (!getRoomPreferenceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, roomPreference_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getCustomerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, customerName_);
    }
    if (!getStartDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, startDate_);
    }
    if (!getEndDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, endDate_);
    }
    if (!getRoomPreferenceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, roomPreference_);
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
    if (!(obj instanceof ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation)) {
      return super.equals(obj);
    }
    ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation other = (ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation) obj;

    if (getId()
        != other.getId()) return false;
    if (!getCustomerName()
        .equals(other.getCustomerName())) return false;
    if (!getStartDate()
        .equals(other.getStartDate())) return false;
    if (!getEndDate()
        .equals(other.getEndDate())) return false;
    if (!getRoomPreference()
        .equals(other.getRoomPreference())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + CUSTOMERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerName().hashCode();
    hash = (37 * hash) + STARTDATE_FIELD_NUMBER;
    hash = (53 * hash) + getStartDate().hashCode();
    hash = (37 * hash) + ENDDATE_FIELD_NUMBER;
    hash = (53 * hash) + getEndDate().hashCode();
    hash = (37 * hash) + ROOMPREFERENCE_FIELD_NUMBER;
    hash = (53 * hash) + getRoomPreference().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parseFrom(
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
  public static Builder newBuilder(ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation prototype) {
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
   * Protobuf type {@code Reservation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Reservation)
      ma.projet.com.gestionreservation2.web.grpc.stubs.ReservationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.projet.com.gestionreservation2.web.grpc.stubs.ReservationOuterClass.internal_static_Reservation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.projet.com.gestionreservation2.web.grpc.stubs.ReservationOuterClass.internal_static_Reservation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation.class, ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation.Builder.class);
    }

    // Construct using ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      customerName_ = "";

      startDate_ = "";

      endDate_ = "";

      roomPreference_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.projet.com.gestionreservation2.web.grpc.stubs.ReservationOuterClass.internal_static_Reservation_descriptor;
    }

    @java.lang.Override
    public ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation getDefaultInstanceForType() {
      return ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation.getDefaultInstance();
    }

    @java.lang.Override
    public ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation build() {
      ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation buildPartial() {
      ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation result = new ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation(this);
      result.id_ = id_;
      result.customerName_ = customerName_;
      result.startDate_ = startDate_;
      result.endDate_ = endDate_;
      result.roomPreference_ = roomPreference_;
      onBuilt();
      return result;
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
      if (other instanceof ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation) {
        return mergeFrom((ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation other) {
      if (other == ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getCustomerName().isEmpty()) {
        customerName_ = other.customerName_;
        onChanged();
      }
      if (!other.getStartDate().isEmpty()) {
        startDate_ = other.startDate_;
        onChanged();
      }
      if (!other.getEndDate().isEmpty()) {
        endDate_ = other.endDate_;
        onChanged();
      }
      if (!other.getRoomPreference().isEmpty()) {
        roomPreference_ = other.roomPreference_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object customerName_ = "";
    /**
     * <code>string customerName = 2;</code>
     * @return The customerName.
     */
    public java.lang.String getCustomerName() {
      java.lang.Object ref = customerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customerName = 2;</code>
     * @return The bytes for customerName.
     */
    public com.google.protobuf.ByteString
        getCustomerNameBytes() {
      java.lang.Object ref = customerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customerName = 2;</code>
     * @param value The customerName to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customerName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerName() {
      
      customerName_ = getDefaultInstance().getCustomerName();
      onChanged();
      return this;
    }
    /**
     * <code>string customerName = 2;</code>
     * @param value The bytes for customerName to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object startDate_ = "";
    /**
     * <code>string startDate = 3;</code>
     * @return The startDate.
     */
    public java.lang.String getStartDate() {
      java.lang.Object ref = startDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string startDate = 3;</code>
     * @return The bytes for startDate.
     */
    public com.google.protobuf.ByteString
        getStartDateBytes() {
      java.lang.Object ref = startDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string startDate = 3;</code>
     * @param value The startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      startDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string startDate = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartDate() {
      
      startDate_ = getDefaultInstance().getStartDate();
      onChanged();
      return this;
    }
    /**
     * <code>string startDate = 3;</code>
     * @param value The bytes for startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      startDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endDate_ = "";
    /**
     * <code>string endDate = 4;</code>
     * @return The endDate.
     */
    public java.lang.String getEndDate() {
      java.lang.Object ref = endDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string endDate = 4;</code>
     * @return The bytes for endDate.
     */
    public com.google.protobuf.ByteString
        getEndDateBytes() {
      java.lang.Object ref = endDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string endDate = 4;</code>
     * @param value The endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string endDate = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndDate() {
      
      endDate_ = getDefaultInstance().getEndDate();
      onChanged();
      return this;
    }
    /**
     * <code>string endDate = 4;</code>
     * @param value The bytes for endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object roomPreference_ = "";
    /**
     * <code>string roomPreference = 5;</code>
     * @return The roomPreference.
     */
    public java.lang.String getRoomPreference() {
      java.lang.Object ref = roomPreference_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roomPreference_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string roomPreference = 5;</code>
     * @return The bytes for roomPreference.
     */
    public com.google.protobuf.ByteString
        getRoomPreferenceBytes() {
      java.lang.Object ref = roomPreference_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roomPreference_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string roomPreference = 5;</code>
     * @param value The roomPreference to set.
     * @return This builder for chaining.
     */
    public Builder setRoomPreference(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      roomPreference_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string roomPreference = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoomPreference() {
      
      roomPreference_ = getDefaultInstance().getRoomPreference();
      onChanged();
      return this;
    }
    /**
     * <code>string roomPreference = 5;</code>
     * @param value The bytes for roomPreference to set.
     * @return This builder for chaining.
     */
    public Builder setRoomPreferenceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      roomPreference_ = value;
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


    // @@protoc_insertion_point(builder_scope:Reservation)
  }

  // @@protoc_insertion_point(class_scope:Reservation)
  private static final ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation();
  }

  public static ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reservation>
      PARSER = new com.google.protobuf.AbstractParser<Reservation>() {
    @java.lang.Override
    public Reservation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Reservation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Reservation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reservation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.projet.com.gestionreservation2.web.grpc.stubs.Reservation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
