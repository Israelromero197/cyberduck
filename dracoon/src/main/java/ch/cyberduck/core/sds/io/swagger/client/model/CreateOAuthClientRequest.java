/*
 * DRACOON API
 * REST Web Services for DRACOON<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.30.0-beta.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Request model for creating an OAuth client
 */
@Schema(description = "Request model for creating an OAuth client")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-16T11:28:10.116221+02:00[Europe/Zurich]")
public class CreateOAuthClientRequest {
  @JsonProperty("clientName")
  private String clientName = null;

  /**
   * Authorized grant types  * &#x60;authorization_code&#x60;  * &#x60;implicit&#x60;  * &#x60;password&#x60;  * &#x60;client_credentials&#x60;  * &#x60;refresh_token&#x60;    cf. [RFC 6749](https://tools.ietf.org/html/rfc6749)
   */
  public enum GrantTypesEnum {
    AUTHORIZATION_CODE("authorization_code"),
    CLIENT_CREDENTIALS("client_credentials"),
    IMPLICIT("implicit"),
    PASSWORD("password"),
    REFRESH_TOKEN("refresh_token");

    private String value;

    GrantTypesEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static GrantTypesEnum fromValue(String text) {
      for (GrantTypesEnum b : GrantTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("grantTypes")
  private List<GrantTypesEnum> grantTypes = new ArrayList<>();

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientSecret")
  private String clientSecret = null;

  /**
   * Determines whether client is a confidential or public client.
   */
  public enum ClientTypeEnum {
    CONFIDENTIAL("confidential"),
    PUBLIC("public");

    private String value;

    ClientTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ClientTypeEnum fromValue(String text) {
      for (ClientTypeEnum b : ClientTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("clientType")
  private ClientTypeEnum clientType = null;

  @JsonProperty("redirectUris")
  private List<String> redirectUris = null;

  @JsonProperty("accessTokenValidity")
  private Integer accessTokenValidity = null;

  @JsonProperty("refreshTokenValidity")
  private Integer refreshTokenValidity = null;

  @JsonProperty("approvalValidity")
  private Integer approvalValidity = null;

  public CreateOAuthClientRequest clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Name, which is shown at the client configuration and authorization.
   * @return clientName
  **/
  @Schema(required = true, description = "Name, which is shown at the client configuration and authorization.")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public CreateOAuthClientRequest grantTypes(List<GrantTypesEnum> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  public CreateOAuthClientRequest addGrantTypesItem(GrantTypesEnum grantTypesItem) {
    this.grantTypes.add(grantTypesItem);
    return this;
  }

   /**
   * Authorized grant types  * &#x60;authorization_code&#x60;  * &#x60;implicit&#x60;  * &#x60;password&#x60;  * &#x60;client_credentials&#x60;  * &#x60;refresh_token&#x60;    cf. [RFC 6749](https://tools.ietf.org/html/rfc6749)
   * @return grantTypes
  **/
  @Schema(required = true, description = "Authorized grant types  * `authorization_code`  * `implicit`  * `password`  * `client_credentials`  * `refresh_token`    cf. [RFC 6749](https://tools.ietf.org/html/rfc6749)")
  public List<GrantTypesEnum> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<GrantTypesEnum> grantTypes) {
    this.grantTypes = grantTypes;
  }

  public CreateOAuthClientRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * ID of the OAuth client
   * @return clientId
  **/
  @Schema(description = "ID of the OAuth client")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public CreateOAuthClientRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Secret, which client uses at authentication.
   * @return clientSecret
  **/
  @Schema(description = "Secret, which client uses at authentication.")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public CreateOAuthClientRequest clientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
    return this;
  }

   /**
   * Determines whether client is a confidential or public client.
   * @return clientType
  **/
  @Schema(description = "Determines whether client is a confidential or public client.")
  public ClientTypeEnum getClientType() {
    return clientType;
  }

  public void setClientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
  }

  public CreateOAuthClientRequest redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public CreateOAuthClientRequest addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * URIs, to which a user is redirected after authorization.
   * @return redirectUris
  **/
  @Schema(description = "URIs, to which a user is redirected after authorization.")
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public CreateOAuthClientRequest accessTokenValidity(Integer accessTokenValidity) {
    this.accessTokenValidity = accessTokenValidity;
    return this;
  }

   /**
   * Validity of the access token in seconds.
   * @return accessTokenValidity
  **/
  @Schema(description = "Validity of the access token in seconds.")
  public Integer getAccessTokenValidity() {
    return accessTokenValidity;
  }

  public void setAccessTokenValidity(Integer accessTokenValidity) {
    this.accessTokenValidity = accessTokenValidity;
  }

  public CreateOAuthClientRequest refreshTokenValidity(Integer refreshTokenValidity) {
    this.refreshTokenValidity = refreshTokenValidity;
    return this;
  }

   /**
   * Validity of the refresh token in seconds.
   * @return refreshTokenValidity
  **/
  @Schema(description = "Validity of the refresh token in seconds.")
  public Integer getRefreshTokenValidity() {
    return refreshTokenValidity;
  }

  public void setRefreshTokenValidity(Integer refreshTokenValidity) {
    this.refreshTokenValidity = refreshTokenValidity;
  }

  public CreateOAuthClientRequest approvalValidity(Integer approvalValidity) {
    this.approvalValidity = approvalValidity;
    return this;
  }

   /**
   * &amp;#128640; Since v4.22.0  Validity of the approval interval in seconds.
   * @return approvalValidity
  **/
  @Schema(description = "&#128640; Since v4.22.0  Validity of the approval interval in seconds.")
  public Integer getApprovalValidity() {
    return approvalValidity;
  }

  public void setApprovalValidity(Integer approvalValidity) {
    this.approvalValidity = approvalValidity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOAuthClientRequest createOAuthClientRequest = (CreateOAuthClientRequest) o;
    return Objects.equals(this.clientName, createOAuthClientRequest.clientName) &&
        Objects.equals(this.grantTypes, createOAuthClientRequest.grantTypes) &&
        Objects.equals(this.clientId, createOAuthClientRequest.clientId) &&
        Objects.equals(this.clientSecret, createOAuthClientRequest.clientSecret) &&
        Objects.equals(this.clientType, createOAuthClientRequest.clientType) &&
        Objects.equals(this.redirectUris, createOAuthClientRequest.redirectUris) &&
        Objects.equals(this.accessTokenValidity, createOAuthClientRequest.accessTokenValidity) &&
        Objects.equals(this.refreshTokenValidity, createOAuthClientRequest.refreshTokenValidity) &&
        Objects.equals(this.approvalValidity, createOAuthClientRequest.approvalValidity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientName, grantTypes, clientId, clientSecret, clientType, redirectUris, accessTokenValidity, refreshTokenValidity, approvalValidity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOAuthClientRequest {\n");
    
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    accessTokenValidity: ").append(toIndentedString(accessTokenValidity)).append("\n");
    sb.append("    refreshTokenValidity: ").append(toIndentedString(refreshTokenValidity)).append("\n");
    sb.append("    approvalValidity: ").append(toIndentedString(approvalValidity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
