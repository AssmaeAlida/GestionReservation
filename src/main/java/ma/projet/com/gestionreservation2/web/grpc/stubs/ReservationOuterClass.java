// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package ma.projet.com.gestionreservation2.web.grpc.stubs;

public final class ReservationOuterClass {
  private ReservationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Reservation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Reservation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllReservationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllReservationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllReservationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllReservationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetReservationByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetReservationByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetReservationByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetReservationByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveReservationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveReservationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteReservationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteReservationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021reservation.proto\"k\n\013Reservation\022\n\n\002id" +
      "\030\001 \001(\003\022\024\n\014customerName\030\002 \001(\t\022\021\n\tstartDat" +
      "e\030\003 \001(\t\022\017\n\007endDate\030\004 \001(\t\022\026\n\016roomPreferen" +
      "ce\030\005 \001(\t\"\033\n\031GetAllReservationsRequest\"@\n" +
      "\032GetAllReservationsResponse\022\"\n\014reservati" +
      "ons\030\001 \003(\0132\014.Reservation\"\'\n\031GetReservatio" +
      "nByIdRequest\022\n\n\002id\030\001 \001(\003\"?\n\032GetReservati" +
      "onByIdResponse\022!\n\013reservation\030\001 \001(\0132\014.Re" +
      "servation\";\n\026SaveReservationRequest\022!\n\013r" +
      "eservation\030\001 \001(\0132\014.Reservation\"<\n\027SaveRe" +
      "servationResponse\022!\n\013reservation\030\001 \001(\0132\014" +
      ".Reservation\"&\n\030DeleteReservationRequest" +
      "\022\n\n\002id\030\001 \001(\003\",\n\031DeleteReservationRespons" +
      "e\022\017\n\007success\030\001 \001(\0102\304\002\n\022ReservationServic" +
      "e\022M\n\022getAllReservations\022\032.GetAllReservat" +
      "ionsRequest\032\033.GetAllReservationsResponse" +
      "\022M\n\022getReservationById\022\032.GetReservationB" +
      "yIdRequest\032\033.GetReservationByIdResponse\022" +
      "D\n\017saveReservation\022\027.SaveReservationRequ" +
      "est\032\030.SaveReservationResponse\022J\n\021deleteR" +
      "eservation\022\031.DeleteReservationRequest\032\032." +
      "DeleteReservationResponseB4\n0ma.projet.c" +
      "om.gestionreservation2.web.grpc.stubsP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Reservation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Reservation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Reservation_descriptor,
        new java.lang.String[] { "Id", "CustomerName", "StartDate", "EndDate", "RoomPreference", });
    internal_static_GetAllReservationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GetAllReservationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllReservationsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_GetAllReservationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GetAllReservationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllReservationsResponse_descriptor,
        new java.lang.String[] { "Reservations", });
    internal_static_GetReservationByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetReservationByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetReservationByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_GetReservationByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GetReservationByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetReservationByIdResponse_descriptor,
        new java.lang.String[] { "Reservation", });
    internal_static_SaveReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SaveReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveReservationRequest_descriptor,
        new java.lang.String[] { "Reservation", });
    internal_static_SaveReservationResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_SaveReservationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveReservationResponse_descriptor,
        new java.lang.String[] { "Reservation", });
    internal_static_DeleteReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_DeleteReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteReservationRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_DeleteReservationResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_DeleteReservationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteReservationResponse_descriptor,
        new java.lang.String[] { "Success", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
