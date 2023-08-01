// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wv_proto2.proto

package de.klassenserver7b.widevine4j.protobuf;

public interface ClientIdentificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ClientIdentification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of factory-provisioned device root of trust. Optional.
   * </pre>
   *
   * <code>optional .ClientIdentification.TokenType type = 1 [default = KEYBOX];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Type of factory-provisioned device root of trust. Optional.
   * </pre>
   *
   * <code>optional .ClientIdentification.TokenType type = 1 [default = KEYBOX];</code>
   * @return The type.
   */
  de.klassenserver7b.widevine4j.protobuf.ClientIdentification.TokenType getType();

  /**
   * <pre>
   * Factory-provisioned device root of trust. Required.
   * </pre>
   *
   * <code>optional bytes token = 2;</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <pre>
   * Factory-provisioned device root of trust. Required.
   * </pre>
   *
   * <code>optional bytes token = 2;</code>
   * @return The token.
   */
  com.google.protobuf.ByteString getToken();

  /**
   * <pre>
   * Optional client information name/value pairs.
   * </pre>
   *
   * <code>repeated .ClientIdentification.NameValue client_info = 3;</code>
   */
  java.util.List<de.klassenserver7b.widevine4j.protobuf.ClientIdentification.NameValue> 
      getClientInfoList();
  /**
   * <pre>
   * Optional client information name/value pairs.
   * </pre>
   *
   * <code>repeated .ClientIdentification.NameValue client_info = 3;</code>
   */
  de.klassenserver7b.widevine4j.protobuf.ClientIdentification.NameValue getClientInfo(int index);
  /**
   * <pre>
   * Optional client information name/value pairs.
   * </pre>
   *
   * <code>repeated .ClientIdentification.NameValue client_info = 3;</code>
   */
  int getClientInfoCount();
  /**
   * <pre>
   * Optional client information name/value pairs.
   * </pre>
   *
   * <code>repeated .ClientIdentification.NameValue client_info = 3;</code>
   */
  java.util.List<? extends de.klassenserver7b.widevine4j.protobuf.ClientIdentification.NameValueOrBuilder> 
      getClientInfoOrBuilderList();
  /**
   * <pre>
   * Optional client information name/value pairs.
   * </pre>
   *
   * <code>repeated .ClientIdentification.NameValue client_info = 3;</code>
   */
  de.klassenserver7b.widevine4j.protobuf.ClientIdentification.NameValueOrBuilder getClientInfoOrBuilder(
      int index);

  /**
   * <pre>
   * Client token generated by the content provider. Optional.
   * </pre>
   *
   * <code>optional bytes provider_client_token = 4;</code>
   * @return Whether the providerClientToken field is set.
   */
  boolean hasProviderClientToken();
  /**
   * <pre>
   * Client token generated by the content provider. Optional.
   * </pre>
   *
   * <code>optional bytes provider_client_token = 4;</code>
   * @return The providerClientToken.
   */
  com.google.protobuf.ByteString getProviderClientToken();

  /**
   * <pre>
   * Number of licenses received by the client to which the token above belongs.
   * Only present if client_token is specified.
   * </pre>
   *
   * <code>optional uint32 license_counter = 5;</code>
   * @return Whether the licenseCounter field is set.
   */
  boolean hasLicenseCounter();
  /**
   * <pre>
   * Number of licenses received by the client to which the token above belongs.
   * Only present if client_token is specified.
   * </pre>
   *
   * <code>optional uint32 license_counter = 5;</code>
   * @return The licenseCounter.
   */
  int getLicenseCounter();

  /**
   * <pre>
   * List of non-baseline client capabilities.
   * </pre>
   *
   * <code>optional .ClientIdentification.ClientCapabilities client_capabilities = 6;</code>
   * @return Whether the clientCapabilities field is set.
   */
  boolean hasClientCapabilities();
  /**
   * <pre>
   * List of non-baseline client capabilities.
   * </pre>
   *
   * <code>optional .ClientIdentification.ClientCapabilities client_capabilities = 6;</code>
   * @return The clientCapabilities.
   */
  de.klassenserver7b.widevine4j.protobuf.ClientIdentification.ClientCapabilities getClientCapabilities();
  /**
   * <pre>
   * List of non-baseline client capabilities.
   * </pre>
   *
   * <code>optional .ClientIdentification.ClientCapabilities client_capabilities = 6;</code>
   */
  de.klassenserver7b.widevine4j.protobuf.ClientIdentification.ClientCapabilitiesOrBuilder getClientCapabilitiesOrBuilder();

  /**
   * <pre>
   * Serialized VmpData message. Optional.
   * </pre>
   *
   * <code>optional bytes vmp_data = 7;</code>
   * @return Whether the vmpData field is set.
   */
  boolean hasVmpData();
  /**
   * <pre>
   * Serialized VmpData message. Optional.
   * </pre>
   *
   * <code>optional bytes vmp_data = 7;</code>
   * @return The vmpData.
   */
  com.google.protobuf.ByteString getVmpData();

  /**
   * <pre>
   * Optional field that may contain additional provisioning credentials.
   * </pre>
   *
   * <code>repeated .ClientIdentification.ClientCredentials device_credentials = 8;</code>
   */
  java.util.List<de.klassenserver7b.widevine4j.protobuf.ClientIdentification.ClientCredentials> 
      getDeviceCredentialsList();
  /**
   * <pre>
   * Optional field that may contain additional provisioning credentials.
   * </pre>
   *
   * <code>repeated .ClientIdentification.ClientCredentials device_credentials = 8;</code>
   */
  de.klassenserver7b.widevine4j.protobuf.ClientIdentification.ClientCredentials getDeviceCredentials(int index);
  /**
   * <pre>
   * Optional field that may contain additional provisioning credentials.
   * </pre>
   *
   * <code>repeated .ClientIdentification.ClientCredentials device_credentials = 8;</code>
   */
  int getDeviceCredentialsCount();
  /**
   * <pre>
   * Optional field that may contain additional provisioning credentials.
   * </pre>
   *
   * <code>repeated .ClientIdentification.ClientCredentials device_credentials = 8;</code>
   */
  java.util.List<? extends de.klassenserver7b.widevine4j.protobuf.ClientIdentification.ClientCredentialsOrBuilder> 
      getDeviceCredentialsOrBuilderList();
  /**
   * <pre>
   * Optional field that may contain additional provisioning credentials.
   * </pre>
   *
   * <code>repeated .ClientIdentification.ClientCredentials device_credentials = 8;</code>
   */
  de.klassenserver7b.widevine4j.protobuf.ClientIdentification.ClientCredentialsOrBuilder getDeviceCredentialsOrBuilder(
      int index);
}