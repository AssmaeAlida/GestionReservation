// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package ma.projet.com.gestionreservation2.web.grpc.stubs;

public interface ReservationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string customerName = 2;</code>
   * @return The customerName.
   */
  java.lang.String getCustomerName();
  /**
   * <code>string customerName = 2;</code>
   * @return The bytes for customerName.
   */
  com.google.protobuf.ByteString
      getCustomerNameBytes();

  /**
   * <code>string startDate = 3;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <code>string startDate = 3;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <code>string endDate = 4;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <code>string endDate = 4;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();

  /**
   * <code>string roomPreference = 5;</code>
   * @return The roomPreference.
   */
  java.lang.String getRoomPreference();
  /**
   * <code>string roomPreference = 5;</code>
   * @return The bytes for roomPreference.
   */
  com.google.protobuf.ByteString
      getRoomPreferenceBytes();
}
